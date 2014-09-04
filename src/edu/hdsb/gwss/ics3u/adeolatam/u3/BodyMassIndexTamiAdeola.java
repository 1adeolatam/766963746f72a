/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics3u.adeolatam.u3;

import java.util.Scanner;

/**
 * Name: TamiAdeola
 * Date: 03/03/2014
 * Version: 1.0
 * Purpose: Calculate and classify Body mass indexes, given data
 */
public class BodyMassIndexTamiAdeola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choiceOfsystem;
        double heightOfperson, massOfperson;
        double bodyMassindex = 1.0;
        // The user choses between the metric system or the imperial system
        System.out.println("Please enter 1 for metric system or 0 for imperial system");
        choiceOfsystem = input.nextInt();
        if (choiceOfsystem > 1 || choiceOfsystem < 0) {
            System.out.println("Please restart and enter a valid option");
        }
        //Calculates the BMI of the person
        else if (choiceOfsystem == 1) {
                System.out.println("You have chosen the Metric System. Good choice");
                System.out.println("Please enter your mass in kilograms:");
                massOfperson = input.nextDouble();
                System.out.println("Please enter your height in meters:");
                heightOfperson = input.nextDouble();
                bodyMassindex = (massOfperson /(Math.pow(heightOfperson, 2)) );
                  
                }
        else if (choiceOfsystem == 0) {
                System.out.println("You have chosen the Imperial System. Bad Choice");
                System.out.println("Please enter your mass in pounds:");
                massOfperson = input.nextDouble();
                System.out.println("Please enter your height in inches:");
                heightOfperson = input.nextDouble();
                bodyMassindex = ((massOfperson * 703)/(Math.pow(heightOfperson, 2)));
                
        }
        // Sorts the BMI into the given categories.
        //Using the information on edu, there is a gap between 30 and 31 
        //where no data will be returned. I used what was on the website.
        System.out.println("Your BMI is " + bodyMassindex);
        
        if (bodyMassindex < 15) {
            System.out.println("You are starving");
        }
        else if (bodyMassindex < 19){
            System.out.println("UnderWeight");
        }
        else if (bodyMassindex < 24) {
            System.out.println("You are ideal");
        }
        else if (bodyMassindex < 30) { 
            System.out.println("You are overweight");
        }
        else if (bodyMassindex > 31 && bodyMassindex < 40){
            System.out.println("Obese");
        }
        else if (bodyMassindex > 40){
            System.out.println("Morbidly Obese");
        }

    }

}
