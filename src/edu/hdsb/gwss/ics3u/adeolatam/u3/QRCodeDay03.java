/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics3u.adeolatam.u3;

import hsa.Console;
import java.util.Scanner;

/**
 *
 * @author test
 */
public class QRCodeDay03 {

    static final int SQUARE_DOT_WIDTH = 10;
    static final int LETTER_WIDTH = SQUARE_DOT_WIDTH * 3;
    static final int xLoc = 0;
    static final int yLoc = 0;
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

        Scanner input = new Scanner(System.in);
        // MESSAGE to ENCODE
        // TO DO; ASK USER FOR MESSAGE
        System.out.println("Please enter the sentence you would like converted.");
        String message = input.nextLine();
        if (message.length() > 64) {
            System.out.println("Please restart and enter a line with 64 or less characters.");
        } else {

            createQRCode(message);
        }
        // QR BOX OUTLINE
        c.drawRect(0, 0, 8 * LETTER_WIDTH, 8 * LETTER_WIDTH);

    }

    /**
     * TASK 4
     */
    public static void createQRCode(String message) {
        int messageindex = 0;
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
               
                
                if(messageindex < message.length()){
                drawBox(toBinary(message.charAt(messageindex)), true, xLoc + LETTER_WIDTH* col, yLoc + LETTER_WIDTH* row);
                messageindex++;}
                else{
                    drawBox(binaryWhiteSpace(),false,xLoc + LETTER_WIDTH* col, yLoc + LETTER_WIDTH* row);
                }

            }
          
        }
       
    }

    /**
     * TASK 5
     */
    public static String binaryWhiteSpace() {
        String whitespace = "";
        for(int i = 0; i < 8;i++){
        whitespace = whitespace + (int) (Math.random() * 9001) % 2 ;
        }
        
       
        return whitespace;
    }

    /**
     * This method will draw a 3x3 GW QR Character.
     *
     * @param code the 8-Bit binary string
     * @param parity the parity bit; true, character is included / false,
     * character is excluded
     * @param xLoc the screen location (column) to draw the box
     * @param yLoc the screen location (row) to draw the box
     */
    public static void drawBox(String code, boolean parity, int xLoc, int yLoc) {

        if (parity) {
            code = "1" + code;
        } else {
            code = "0" + code;
        }

        int letterIndex = 0;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (code.charAt(letterIndex) == '1') {
                    c.fillRect(xLoc + col * SQUARE_DOT_WIDTH, yLoc + row * SQUARE_DOT_WIDTH, SQUARE_DOT_WIDTH, SQUARE_DOT_WIDTH);
                }
                letterIndex++;
            }
        }

    }

    public static String toBinary(char letter) {
        int asciiValue = (int) letter;
        String bitString = "";
        while (asciiValue > 0) {
            if (asciiValue % 2 == 1) {
                bitString = "1" + bitString;
            } else {
                bitString = "0" + bitString;
            }
            asciiValue = asciiValue / 2;
        }

        while (bitString.length() < 8) {
            bitString = "0" + bitString;
        }

        return bitString;
    }

}
