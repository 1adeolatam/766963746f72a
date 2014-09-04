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
public class ChangeTamiAdeola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        

        int amountOfquarters, amountOfdimes, amountOfnickels;
        int value; 

       
        System.out.println("Enter Change in Cents: ");
         value = input.nextInt();
        System.out.println("The the amount of change being calulated is" + value);
         amountOfquarters = (value / 25);
        System.out.println("Quarters:" + amountOfquarters);       
        value = (value - 25 * amountOfquarters);
        amountOfdimes = (value / 10);
        System.out.println("Dimes:" + amountOfdimes);
        value = (value - 10 * amountOfdimes);
        amountOfnickels = (value / 5);
        System.out.println("Nickels:" + amountOfnickels);
        System.out.println("Pennies:" + value);
        

    }

}
