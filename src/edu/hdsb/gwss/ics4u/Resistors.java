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
        String colour,colour2,colour3;
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

        
        

        
        
        colour = coloursEntered.substring(0, coloursEntered.indexOf("-"));
           System.out.println(colour);
        for (int j = 0; j < colourValue.length ; j++) { 
        if (colour.equalsIgnoreCase(colourValue[j])) {
                    numbers[0] = j;
        }
        }
  
        colour2 = coloursEntered.substring(coloursEntered.indexOf("-")+1, coloursEntered.lastIndexOf("-"));
           System.out.println(colour2); 
        for (int j = 0; j < colourValue.length; j++) { 
        if (colour2.equalsIgnoreCase(colourValue[j])) {
                    numbers[1] = j;
        }
        }
  
         colour3 = coloursEntered.substring(coloursEntered.lastIndexOf("-")+1,coloursEntered.length());
            System.out.println(colour3);
            
         for (int j = 0; j < colourValue.length; j++) { 
        if (colour3.equalsIgnoreCase(colourValue[j])) {
                    numbers[2] = j;
        }
        }
        System.out.println("The resistance is " + numbers[0] + numbers[1] + " x 10^ " + numbers[2]);

    }

}
