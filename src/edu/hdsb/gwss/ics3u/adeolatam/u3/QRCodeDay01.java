/*
 * Garth Webb Secondary School
 * Performance Task 2014 - Semester 2
 * Day 01
 *
 * Garth Webb QR Code
 */
package edu.hdsb.gwss.ics3u.adeolatam.u3;

import hsa.Console;
import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Garth Webb QR Code
 *
 * @author Mr. Muir
 * @author YOU
 */
public class QRCodeDay01 {

    static final int SQUARE_DOT_WIDTH = 10;
    static final int LETTER_WIDTH = SQUARE_DOT_WIDTH * 3;

    // HSA Console
    static Console c = new Console();

    /**
     * QR Code Main
     *
     * Starting point for the QR Code Reader & Generator
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        // Arrays
        int[][] qrData = new int[24][24];

        // Day 01 - Part 1
        System.out.println("----------------");
        System.out.println("Day 01 - Part 01");

        // TEST 'A'
        String binaryString = toBinary('A');
        System.out.println("A --> " + binaryString);
        System.out.println("Length: " + binaryString.length());
        if ("01000001".equals(binaryString)) {
            System.out.println("\t Works!");
        } else {
            System.out.println("\t Try Again!");
        }

        // TEST 'a'
        binaryString = toBinary('a');
        System.out.println("a --> " + binaryString);
        System.out.println("Length: " + binaryString.length());
        if ("01100001".equals(binaryString)) {
            System.out.println("\t Works!");
        } else {
            System.out.println("\t Try Again!");
        }

        // Day 01 - Part 2
        System.out.println("----------------");
        System.out.println("Day 01 - Part 02");

        // Data Before
        System.out.println("BEFORE: ");
        displayBitmap(qrData);

        // Read QR Code
        readQRCode(qrData);

        // Data After
        System.out.println("AFTER: ");
        displayBitmap(qrData);

    }

    /**
     * This method will take a character (ASCII) and convert to an 8-Bit binary
     * number. The binary number will be stored as a string and returned.
     *
     * Example:<br/>
     *
     * 'A' --> 65 (Decimal) --> 01000001<br/>
     * 'a' --> 97 (Decimal) --> 01100001
     *
     * @param letter the character to convert
     * @return a string that represents the 8-bit ASCII code in binary.
     */
    public static String toBinary(char letter) {
        String bitString = "";
        int asciiNumber = (int) letter;
        int[] remainder = new int[8];
        int dividen = asciiNumber;
        for (int i = remainder.length - 1; i > 0; i--) {
            remainder[i] = dividen % 2;
            dividen = dividen / 2;
        }
        for (int q = 0; q < remainder.length; q++) {
            bitString = bitString + remainder[q];
        }

        return bitString;
    }

    /**
     * This method reads QR Code data from a file and populates the qrData
     * array.
     *
     * @param qrData
     * @throws Exception
     */
    public static void readQRCode(int[][] qrData) throws Exception {

        Scanner input = new Scanner(new File("QR.code.bmp.txt"));
        String number;
        StringTokenizer swagtosater;

        String lineEntered ;

        for (int row = 0; row < qrData.length; row++) {
            lineEntered = input.nextLine();
            for (int col = 0; col < qrData[row].length; col++) {
                qrData[row][col] = Integer.parseInt( "" + lineEntered.charAt( col ) );
                 
                
            }
        }
    }
        // READ QR Code Bitmap File
    //  - 24 x 24 bits
    // TO DO

    /**
     * Display data in the array that represents the QR code.
     *
     * @param qrData
     */
    public static void displayBitmap(int[][] qrData) {

        for (int row = 0; row < qrData.length; row++) {
            for (int col = 0; col < qrData.length; col++) {
                System.out.print(qrData[row][col]);
            }
            System.out.println();
        }
    }

}
