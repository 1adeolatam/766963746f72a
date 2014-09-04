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
public class Y2KDetectorTamiAdeola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int birthYear, currentYear, yourAge;
        boolean validity;

        System.out.println("Please enter your birth year in two digits: e.g 1945 is 45");
        birthYear = input.nextInt();
        System.out.println("Please enter the current year in two digits: e.g 2022 is 22");
        currentYear = input.nextInt();
        validity = true;

        if ((birthYear < 0 || birthYear > 99) || (currentYear > 99 || currentYear < 0)){
           System.out.println("Your entry is invalid");
           
        } else if (validity = true) {
            if (currentYear > birthYear) {
                yourAge = currentYear - birthYear;
                System.out.println(" Your age is " + yourAge);
            } else {
                currentYear = currentYear + 100;
                yourAge = (currentYear - birthYear);
                System.out.println(" Your age is " + yourAge);
            }
        }

    }
}
