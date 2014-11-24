/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit5;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author 1adeolatam
 */
public class MartialArtsStore {

    static Scanner input = new Scanner(System.in);
    static RandomAccessFile recordFile;
    static long numRecords, position;

    public MartialArtsStore() throws Exception {
        recordFile = new RandomAccessFile("MartialArts.txt", "rw");
        this.numRecords = recordFile.length() / MartialArts.RECORD_SIZE;
        System.out.println("There are " + this.numRecords + " records in this store");
        openstore();
    }

    public static int openstore() throws Exception {

        int choice = 0;
        boolean errorPresent = true;
        while (errorPresent == true) {
            System.out.println(" WHALECOME TO THE MA STORE");
            System.out.println("There are " + (recordFile.length() / MartialArts.RECORD_SIZE) + " Martial records in this store.");
            System.out.println("~~~~~~~MENU~~~~~~~~");
            System.out.println("1. Display Store");
            System.out.println("2. Add Record");
            System.out.println("3. Edit Record ");
            System.out.println("4. LEAVE STORE");
            try {
                choice = Integer.parseInt(input.nextLine());
                errorPresent = false;
            } catch (NumberFormatException nfe) {
                System.err.println("PLease enter a integer between 1 and 4");
            }
        }
        switch (choice) {
            case 1:
                // Choice to display records in file
                displaychoice();
                break;
            case 2:
                Addchoice();
                break;
            case 3:
                // EDIT Existing MARTIAL ART
                editChoice();
                break;
            case 4:
                recordFile.close();
                System.out.println("Thank you for visiting go fight someone");
                 break;
            default:
                System.out.println("PLease eneter a valid entry");

                break;
        }
        return choice;
    }
// Method gives user option of displaying all records or individual ones.
    public static void displaychoice() throws Exception {
        if (recordFile.length() > 0) {
            boolean error1 = false;
            int IDNUMBER = -2;
            while (error1 == false) {

                System.out.println("Please enter -1 to view all the records or enter a specific record ID to view it");
                try {
                    IDNUMBER = Integer.parseInt(input.nextLine());
                    error1 = true;
                } catch (NumberFormatException nfe) {
                    System.err.println("Please enter a valid integer.");
                }
            }
            if (IDNUMBER >= numRecords) {
                System.out.println("Please enter a valid record index.");

            }
            if (IDNUMBER > -1) {
                display(IDNUMBER);
            } else {
                for (int i = 0; i < numRecords; i++) {
                    display(i);
                }
            }
        } else {
            System.err.println("FILE HAS NO RECORDS");

        }

    }
// THe method that adds record to the file from user input, checks for correct user input

    public static void Addchoice() throws IOException, Exception {
        MartialArts MA = new MartialArts();

        System.out.println("You are now adding a record\n Instructions: ");
        try {
            System.out.println("Please enter the founder's name");
            MA.setfounder(input.nextLine());

            System.out.println("Please enter the Name of the art");
            MA.setname(input.nextLine());

            System.out.println("Please enter the Number of practicioners");
            MA.setnumberOfpractitioners(Integer.parseInt(input.nextLine()));

            System.out.println("Please enter the Number of levels");
            MA.setnumberOflevels(Integer.parseInt(input.nextLine()));

            System.out.println("Please enter true if it is full contact or false if it is not");
            MA.setFullContact(Boolean.parseBoolean(input.nextLine()));

            System.out.println("Please enter the first letter of the highest belt colour");
            MA.sethighestLevelcolor(input.nextLine().trim().charAt(0));
        } catch (Exception e) {

            System.err.println("PLEASE INPUT CORRECT DATA TYPES.");

        }

        MA = add(MA);
    }
// Change existing records, and also checks to see if any file is present to edit

    public static void editChoice() throws Exception {

        if (recordFile.length() > 0) {

            int IDchoice = -2;
            System.out.println("Please enter the id of the martial art you would like to edit.");
            try {
                IDchoice = Integer.parseInt(input.nextLine());
            } catch (Exception e) {
                System.err.println("PLease enter a valid id number");
            }
            if (IDchoice < numRecords && IDchoice > -1) {
                MartialArts Ma = new MartialArts();
                Ma.setFileRecordID(IDchoice);
                recordFile.seek(IDchoice * MartialArts.RECORD_SIZE);

                Ma = read(IDchoice);
                try {
                    // Update Founder Name
                    System.out.println("Enter [new Founder] or  press k to leave the name the same  ");
                    String founder = input.nextLine();

                    if (!"k".equalsIgnoreCase(founder)) {
                        Ma.setfounder(founder);
                    }
                    // Update  Name
                    System.out.println("Enter [new Martial art name] or press k to leave the name the same ");
                    String name = input.nextLine();

                    if (!"k".equalsIgnoreCase(name)) {
                        Ma.setname(name);
                    }
                    // UPdate # of practicioners
                    System.out.println("Enter new number of practicioners or [k]eep the current amount");
                    String numberofpractioners = input.nextLine();

                    if (!"k".equals(numberofpractioners)) {
                        Ma.setnumberOfpractitioners(Integer.parseInt(numberofpractioners));
                    }
                    // UPdate # of levels
                    System.out.println("Enter new number of Levels or [k]eep the current amount");
                    String numberoflvl = input.nextLine();

                    if (!"k".equals(numberoflvl)) {
                        Ma.setnumberOflevels(Integer.parseInt(numberoflvl));
                    }

                    // Update full contactness
                    System.out.println("please enter 1 if you would like to change this martial art's full contactness, enter anything else to leave it the way it is");
                    String chaningboolean = input.nextLine();
                    if ("1".equals(chaningboolean)) {
                        Ma.setFullContact(!Ma.isFullContact());
                    }
                    //UPDATE HIGHEST COLOR
                    System.out.println("Enter new color of highest attainable belt of the art or [z]to keep the current color");
                    char highestdan = input.nextLine().trim().charAt(0);

                    if (highestdan != 'z') {
                        Ma.sethighestLevelcolor(highestdan);
                    }
                    Ma.setFileRecordID(IDchoice);
                } catch (Exception e) {

                    System.err.println("PLEASE INPUT CORRECT DATA TYPES.");

                }
                write(Ma);
            } else {
                System.err.println("Please enter a valid object ID. FIRST Object is id 0");
            }
        } else {
            System.err.println("There are no files to edit.");
        }
    }

    public static MartialArts write(MartialArts MA) throws Exception {

        if (MA.getFileRecordID() < 0) {
            recordFile.seek(recordFile.length());
            MA.setFileRecordID(recordFile.length() / MartialArts.RECORD_SIZE);
        } else {
            recordFile.seek(MA.getFileRecordID() * MartialArts.RECORD_SIZE);
        }

        recordFile.writeChars(MA.getfounder());
        recordFile.writeChars(MA.getname());
        recordFile.writeInt(MA.getnumberOfpractitioners());
        recordFile.writeInt(MA.getnumberOflevels());
        recordFile.writeBoolean(MA.isFullContact());
        recordFile.writeChar(MA.gethighestLevelcolor());

        return MA;

    }

    //  Converts file data into an object, small check to see if the id entered is valid ">= 0"
    public static MartialArts read(int fileRecordID) throws Exception {
        MartialArts ma = new MartialArts();
        if (fileRecordID >= 0) {

            recordFile.seek(fileRecordID * MartialArts.RECORD_SIZE);
            ma.setFileRecordID(fileRecordID);

            // GETTING THE FOUNDER
            char Founder[] = new char[MartialArts.FOUNDER_SIZE];
            for (int i = 0; i < MartialArts.FOUNDER_SIZE; i++) {
                Founder[i] = recordFile.readChar();
            }
            ma.setfounder(new String(Founder));

            // GETTING THE NAME 
            char Name[] = new char[MartialArts.NAME_SIZE];
            for (int i = 0; i < MartialArts.NAME_SIZE; i++) {
                Name[i] = recordFile.readChar();
            }
            ma.setname(new String(Name));

            // getting Number of practitioners and levels
            ma.setnumberOfpractitioners(recordFile.readInt());
            ma.setnumberOflevels(recordFile.readInt());

            //Get full contact boolean
            ma.setFullContact(recordFile.readBoolean());

            //get highest color char
            ma.sethighestLevelcolor(recordFile.readChar());

        }
        return ma;
    }

    public static void display(int IDNUMBER) throws Exception {
        position = MartialArts.RECORD_SIZE * (IDNUMBER);
        recordFile.seek(position);
        System.out.println("FILE ID NUMBER " + IDNUMBER);
        char Founder[] = new char[MartialArts.FOUNDER_SIZE];
        for (int i = 0; i < MartialArts.FOUNDER_SIZE; i++) {
            Founder[i] = recordFile.readChar();
        }
        System.out.println("Founder: " + new String(Founder));

        char Name[] = new char[MartialArts.NAME_SIZE];
        for (int i = 0; i < MartialArts.NAME_SIZE; i++) {
            Name[i] = recordFile.readChar();
        }

        System.out.println("NAME: " + new String(Name));

        System.out.println("Number of Practictioners: " + recordFile.readInt());

        System.out.println("Number of Levels: " + recordFile.readInt());
        System.out.println("Is it full contact ?: " + recordFile.readBoolean());

        System.out.println("First Letter of Highest color: " + recordFile.readChar());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }

    public static MartialArts add(MartialArts MA) throws Exception {
        return write(MA);
    }

    public static void main(String[] args) throws Exception {

        MartialArtsStore MAS = new MartialArtsStore();
        int choice = -1;
        while (choice != 4) {
            choice = openstore();
        }
    }

}
