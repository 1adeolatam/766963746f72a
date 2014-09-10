/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4u;

import java.util.Scanner;

/**
 *
 * @author 1adeolatam
 */
public class Resistors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String coloursEntered = input.next();
        String colour;
        int[] numbers = new int[3];

        String[] colourValue = new String[10];
        colourValue[0] = "BLACK";
        colourValue[1] = "BROWN";
        colourValue[2] = "RED";
        colourValue[3] = "ORANGE";
        colourValue[4] = "YELLOW";
        colourValue[5] = "GREEN";
        colourValue[6] = "BLUE";
        colourValue[7] = "VIOLET";
        colourValue[8] = "GREY";
        colourValue[9] = "WHITE";

        int start = 0, endpos ;
        endpos = coloursEntered.indexOf("-");

        for (int i = 0; i < numbers.length-1; i++) {
            colour = coloursEntered.substring(start, endpos);
            System.out.println(colour);
            for (int j = 0; j < colourValue.length - 1; j++) {
                if (colour.equalsIgnoreCase(colourValue[j])) {
                    numbers[i] = j;
                }
            }
            start = endpos;
            
        }

        System.out.println("The resistance is " + numbers[0] + numbers[1] + " x 10^ " + numbers[2]);

    }

}
