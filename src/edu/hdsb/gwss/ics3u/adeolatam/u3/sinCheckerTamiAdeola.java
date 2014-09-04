/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics3u.adeolatam.u3;

import java.util.Scanner;

/**
 *
 * @author 1adeolatam
 */
public class sinCheckerTamiAdeola {

    /**
     * @param args the command line arguments
     */
    
    int numberEntered;
    String numberReturned;
    
    public static void main(String[] args) {
        String sinEntered;

        int sumOfeven = 0, valueEven, sumEventens, sumEvenunits,valueOdd,sumOfodd = 0,totalSum = 0;
        int nextHighest = 0, checkDigit;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your SIN number");
        sinEntered = input.next();
        if (sinEntered.length() != 9) {
            System.out.println("Please enter a valid SIN number.");
        }
        for(int i = 0;i < 7 ; i = i + 2 ){
            valueEven = Integer.parseInt("" + sinEntered.charAt(i + 1)) * 2;
            valueOdd = Integer.parseInt("" + sinEntered.charAt(i));
            sumEventens = valueEven / 10;
            sumEvenunits = valueEven % 10; 
            sumOfodd = sumOfodd + valueOdd;
            sumOfeven= sumOfeven + sumEventens + sumEvenunits;
            totalSum = sumOfeven + sumOfodd;
             nextHighest = (int) Math.ceil(totalSum / 10.0) * 10;
             
             //System.out.println("Next Highest" + nextHighest);
             //System.out.println("sum Of even "+ sumOfeven +" sum of Odds " + sumOfodd + " Total sum(addition of evens and odds) " + totalSum);
        }
        checkDigit = Integer.parseInt("" + sinEntered.charAt(8));
        if (checkDigit != (nextHighest - totalSum)){
           System.out.println("Pin is incorrect.");
        }
        else {
            System.out.println("The SIN is valid.");
        }
    }

}
