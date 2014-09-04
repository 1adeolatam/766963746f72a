/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics3u.adeolatam.u3;

import java.util.Scanner;

/**
 * Name: Tami Adeola Date: 03/03/2014 Version: 1.0 This code is used to
 * calculate how much a letter would cost depending on th weight.
 */
public class LetterCostTamiAdeola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("This program will calculate the cost of Mailing a letter dependent on its mass\n and which class it is sent in.");
        Scanner input = new Scanner(System.in);
        int choiceOfclass;
        double massOfobject;
        double totalPrice = 1.0;
       

        // The user choses between 1st class and 2nd class
        System.out.println("Please enter 1 for 1st class mail or 0 for 2nd class mail.");
        choiceOfclass = input.nextInt();

        // disallows invalid options
        if (choiceOfclass > 1 || choiceOfclass < 0) {
            System.out.println("Please restart and enter a valid option");
            // compares the mass of the object to the pricing scheme given
        } else {

            System.out.println("You hav selected first class. Enter the mass in grams.");
            massOfobject = input.nextDouble();

            if (massOfobject <= 0) {
                System.out.println("Invalid Mass");
            } else {

                if (choiceOfclass == 1) {
                    System.out.println("You have selected first class. Enter the mass in grams.");

                    if (massOfobject <= 30) {
                        totalPrice = 0.4;
                    } else if (massOfobject <= 50) {
                        totalPrice = 0.6;
                    } else if (massOfobject <= 100) {
                        totalPrice = 0.8;
                    } else if (massOfobject > 100) {
                       
                        totalPrice = (0.8 + (Math.ceil((massOfobject - 100) / 50)) * .29);
                        
                    }

                } else if (choiceOfclass == 0) {
                    System.out.println("You hav selected second class. Enter the mass in grams.");

                    if (massOfobject <= 30) {
                        totalPrice = 0.3;
                    } else if (massOfobject <= 50) {
                        totalPrice = 0.5;
                    } else if (massOfobject <= 100) {
                        totalPrice = 0.6;
                    } else if (massOfobject > 100) {
                        totalPrice = (0.8 + (Math.ceil((massOfobject - 100) / 50)) * .19);
                    }

                }
                System.out.println("The price of your mail is $" + totalPrice);
            }

        }
    }

}
