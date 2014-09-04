/*
 * Garth Webb Secondary School
 * Performance Task 2014 - Semester 2
 * Day 02
 *
 * Garth Webb QR Code
 */
package edu.hdsb.gwss.ics3u.adeolatam.u3;

import hsa.Console;

/**
 * Garth Webb QR Code
 *
 * @author Mr. Muir
 * @author YOU
 */
public class QRCodeDay02 {

    static final int SQUARE_DOT_WIDTH = 10;
    static final int LETTER_WIDTH = SQUARE_DOT_WIDTH * 3;
    static final int NUMBER_BITS = 9;

    // HSA Console
    static Console c = new Console();

    /**
     * QR Code Main
     *
     * Starting point for the QR Code Reader & Generator
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // QR Location
        int xLoc = 0;
        int yLoc = 0;

        // Convert 'a' to a QR Code (single code) (3x3)
        String binaryString = Integer.toBinaryString((int) 'A');
        drawBox(binaryString, true, xLoc, yLoc);

    }

    /**
     * This method draws a 3x3 QR code for a single character that is
     * represented by the binary string.
     *
     * @param code ASCII Character encoded as an 8-Bit Binary String
     * @param parity parity bit; true, character is included / false, character
     * is excluded
     * @param xLoc the screen location (column) to draw the box
     * @param yLoc the screen location (row) to draw the box
     */
    public static void drawBox(String code, boolean parity, int xLoc, int yLoc) {
        int[][] codeValue = new int[3][3];
        c.drawRect(xLoc, yLoc, LETTER_WIDTH, LETTER_WIDTH);
        if (code.length() < NUMBER_BITS) {
            int numberOfleadingZeroes = NUMBER_BITS - code.length();
            for (int i = 0; i < numberOfleadingZeroes; i++) {
                code = "0" + code;

            }
        }
        int rowsum = 0;

        for (int row = 0; row < codeValue.length; row++) {
            for (int col = 0; col < codeValue[row].length; col++) {

                if (code.charAt(rowsum) == '1') {
                    codeValue[row][col] = 1;
                }
                rowsum++;

            }

        }

        int i = 0;
        for (int row = 0; row < codeValue.length; row++) {
            for (int col = 0; col < codeValue[row].length; col++) {
                if (parity = true) {
                    c.fillRect(xLoc, yLoc, SQUARE_DOT_WIDTH, SQUARE_DOT_WIDTH);
                    parity = false;
                }
                if (code.charAt(i) == '1') {
                    c.fillRect(xLoc + SQUARE_DOT_WIDTH * col, yLoc + (SQUARE_DOT_WIDTH * row), SQUARE_DOT_WIDTH, SQUARE_DOT_WIDTH);
                }
                i++;
            }
        }
    }

}
