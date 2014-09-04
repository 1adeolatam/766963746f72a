/*
 * Garth Webb Secondary School
 * Performance Task 2014 - Semester 2
 * Day 04
 *
 * Garth Webb QR Code
 */
package edu.hdsb.gwss.ics3u.adeolatam.u3;

import hsa.Console;
import java.io.File;
import java.util.Scanner;

/**
 * Garth Webb QR Code
 *
 * @author Mr. Muir
 * @author YOU
 */
public class QRCodeDay04 {

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

        // DATA
        int[][] qrData = new int[24][24];

        // READ QR Code
        readQRCode(qrData);

        // DISPLAY FILE BIT MAP
        displayBitmap(qrData);

        // DECODE MESSAGE
        String message = decodeQRCode(qrData);

        c.println("----------------------");
        c.println("MESSAGE: ");
        c.println(message);

    }

    /**
     * TASK 5
     *
     * This method takes a full QR Code bitmap (24x24), and the row and col of
     * the SINGLE character to decode.
     *
     * Don't forget to check the parity bit.
     *
     * @param qrData 24x24 bitmap
     * @param row row in the 24x24 matrix, which is the starting row of the 3x3
     * sub matrix
     * @param col col in the 24x24 matrix, which is the starting col of the 3x3
     * sub matrix
     * @return the decoded character.
     */
    public static char decodeQRCharacter(int[][] qrData, int row, int col) {
        int asciiValue = 0;
        int powerindex = 8;
        if (qrData[row][col] == 1) {
            qrData[row][col] = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    asciiValue = asciiValue + (qrData[row + i][col + j] * (int) Math.pow(2, powerindex));

                    powerindex--;
                }

            }
        }
        // DECODE THE CHARACTER!

        System.out.println(asciiValue);
        return (char) asciiValue;
    }

    /**
     * TASK 5
     *
     * This method takes a full QR Code bitmap (24x24), and decodes each 3x3 QR
     * Character to form the encoded message.
     *
     * @param qrData 24x24 bitmap
     * @return the decoded message.
     */
    public static String decodeQRCode(int[][] qrData) {
        String message = "";

        for (int row = 0; row < 8 * 3; row = row + 3) {
            for (int col = 0; col < 8 * 3; col = col + 3) {

                message = message + decodeQRCharacter(qrData, row, col);
            }
        }
        return message;
    }

    /**
     * This method reads QR Code data from a file and populates the qrData
     * array.
     *
     * @param qrData
     * @throws Exception
     */
    public static void readQRCode(int[][] qrData) throws Exception {

        Scanner input = new Scanner(new File("Day04.bmp.txt"));

        // Read Each Line
        String line;
        int row = 0;
        while (input.hasNext()) {
            line = input.nextLine();
            for (int c = 0; c < line.length(); c++) {
                qrData[row][c] = Integer.parseInt("" + line.charAt(c));
            }
            row++;
        }
    }

    /**
     * Display data in the array that represents the QR code.
     *
     * @param qrData
     */
    public static void displayBitmap(int[][] qrData) {

        for (int row = 0; row < qrData.length; row++) {
            for (int col = 0; col < qrData.length; col++) {
                c.print(qrData[row][col]);
            }
            c.println();
        }
    }

}
