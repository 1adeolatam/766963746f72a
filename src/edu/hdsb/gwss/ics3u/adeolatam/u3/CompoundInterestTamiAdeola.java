/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics3u.adeolatam.u3;

import java.util.Scanner;

/**Name: TamiAdeola
 * Date: 23/03/2014
 * Version: 1.0
 * Purpose: This program is to calculate compound interest using the given algorithm.
 *
 * @author 1adeolatam
 */
public class CompoundInterestTamiAdeola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double yearlyInvestment, interestRate, totalAmountinBank, Interest, total;
        int endYear, year = 1;
// Initializes variables
        System.out.println("Please enter the yearly investment:");
        yearlyInvestment = input.nextDouble();
        System.out.println("Please enter the interest rate (%)");
        interestRate = input.nextDouble();
        System.out.println("Please enter the amount of years");
        endYear = input.nextInt();

        totalAmountinBank = yearlyInvestment;
        interestRate = interestRate / 100;
        // Disallows invalid data entry.
        if (yearlyInvestment <= 0 || interestRate <= 0 || endYear <= 0){
            System.out.println("PLEASE RESTART THE PROGRAM AND ENTER VALID DATA");
        }else{

        System.out.format("%-5s %9s %8s %7s \n", "Year", "Amount In Bank", "Interest", "Total");
        while (endYear >= year) {
// Calculates the interest amount
            Interest = totalAmountinBank * interestRate;

            total = totalAmountinBank + Interest;
            
            System.out.format("%-2d %9.2f %8.2f %7.2f \n ",year, totalAmountinBank, Interest, total);
            totalAmountinBank = total + yearlyInvestment;
// THe counter for the program, which is the amount of years
            year++;

        }

    }
    }

}
