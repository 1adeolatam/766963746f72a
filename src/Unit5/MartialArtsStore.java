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

    Scanner input = new Scanner(System.in);
    RandomAccessFile recordFile;
    long numRecords, position;

    public MartialArtsStore() throws IOException {
        recordFile = new RandomAccessFile("MartialArts.txt", "rw");
        this.numRecords = recordFile.length() / MartialArts.RECORD_SIZE;
        System.out.println("There are " + this.numRecords + " records in this store");
        openstore();
    }

    public void openstore() throws FileNotFoundException, IOException {

        System.out.println(" WHALECOME TO THE MA STORE");
        System.out.println("There are " + (recordFile.length() / MartialArts.RECORD_SIZE) + " records in this store");
        System.out.println("~~~~~~~MENU~~~~~~~~");
        System.out.println("1. Display Store");
        System.out.println("2. Add Record");
        System.out.println("3. Edit Record ");
        System.out.println("4.");
        System.out.println("5. LEAVE STORE");
        switch (Integer.parseInt(input.nextLine())) {
            case 1:
                System.out.println("Please enter -1 to view all the records or enter a specific record to view it");
                int IDNUMBER = Integer.parseInt(input.nextLine());
                if (IDNUMBER > -1) {
                    display(IDNUMBER);
                } else {
                    for (int i = 0; i < numRecords; i++) {
                        display(i);
                    }
                }
                openstore();

                break;

            case 2:
                MartialArts MA = new MartialArts();
                System.out.println("You are now adding a record\n Instructions: ");

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

                MA = add(MA);
                openstore();
                break;
            case 3:
                // EDIT

                openstore();
                break;
            case 4:

                openstore();
                break;
            case 5:
                System.out.println("Thank you for visiting go fight someone");

                break;
            default:
                System.out.println("PLease eneter a valid entry");
                openstore();
                break;
        }

    }

    public MartialArts write(MartialArts MA) throws IOException {

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

    public MartialArts read(int fileRecordID) throws IOException {
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

    public void display(int IDNUMBER) throws IOException {
        position = MartialArts.RECORD_SIZE * (IDNUMBER);
        recordFile.seek(position);
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

    public MartialArts add(MartialArts MA) throws IOException {
        return write(MA);

    }

    public void find() {

    }

    public static void main(String[] args) throws Exception {

        MartialArtsStore MAS = new MartialArtsStore();

    }

}
