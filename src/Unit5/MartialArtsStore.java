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
        
        System.out.println("~~~~~~~MENU~~~~~~~~");
        System.out.println("1. Display Store");
        System.out.println("2. Add Record");
        System.out.println("3. Delete Record ");
        switch (input.nextInt()) {
            case 1:
                System.out.println("Please enter -1 to view all the records or enter a specific record to view it");
                int IDNUMBER = input.nextInt();
                if (IDNUMBER >= 0) {
                    display(IDNUMBER);
                } else {
                    for (int i = 0; i < numRecords; i++) {
                        display(i);
                    }
                }
                break;
            
            case 2:
                System.out.println("You are now adding a record\n Instructions: ");
                MartialArts MA = new MartialArts();
                System.out.println("Please enter the founder's name");
                MA.setfounder((String) input.nextLine());
                System.out.println("Please enter the Name of the art");
                MA.setname((String) input.nextLine());
                System.out.println("Please enter the Number of practicioners");
                MA.setnumberOfpractitioners(input.nextInt());
                System.out.println("Please enter the Number of levels");
                MA.setnumberOflevels(input.nextInt());
                System.out.println("Please enter true if it is full contact or false if it is not");                
                MA.setFullContact(input.nextBoolean());
                System.out.println("Please enter the first letter of the highest belt colour");
                MA.sethighestLevelcolor(input.nextLine().charAt(0));
                
                write(MA);
                break;
            case 3:
                System.out.println("Please enter the ID of the record you would like to delete");
                position = input.nextLong() * MartialArts.RECORD_SIZE;
                recordFile.seek(position);
                // pls do
                break;
        }
        
    }
    
    public void write(MartialArts MA) throws IOException {
        
        if (MA.getFileRecordID() < 0) {
            recordFile.seek(recordFile.length());
        } else {
            recordFile.seek(MA.getFileRecordID() * MartialArts.RECORD_SIZE);
        }
        
        recordFile.writeChars(MA.getfounder());
        recordFile.writeChars(MA.getname());
        recordFile.writeInt(MA.getnumberOfpractitioners());
        recordFile.writeInt(MA.getnumberOflevels());
        recordFile.writeBoolean(MA.isFullContact());
        recordFile.writeChar(MA.gethighestLevelcolor());
        ;
        
    }
    
    public void read(int fileRecordID) throws IOException {
        
        if (fileRecordID >= 0) {
            
            MartialArts ma = new MartialArts();
            
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
        
    }
    
    public void display(int IDNUMBER) throws IOException {
        position = MartialArts.RECORD_SIZE * (IDNUMBER - 1);
        recordFile.seek(position);
        System.out.println("Name :");
        System.out.println("Number Of practicioners :");
        System.out.println("Number of practitioners :");
        System.out.println("Highest Colour :");
        
    }
    
    public void add(MartialArts MA) throws IOException {
        recordFile.seek(recordFile.length());
        write(MA);
        
    }
    
    public static void main(String[] args) throws Exception {
        
        MartialArts Tk = new MartialArts("Takewando", "asadadasdawd", 21, 3, true, 'r');
        Tk.setFileRecordID(0);
        
        System.out.println("HI");
        
    }
    
}
