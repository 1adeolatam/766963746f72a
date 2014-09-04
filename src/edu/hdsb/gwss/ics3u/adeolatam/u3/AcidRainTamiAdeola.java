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
 * Purpose: This code is used to determine the whether fish would die based
 * on the acidity or alkalinity of the water.
 */
public class AcidRainTamiAdeola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double pHlevel;

        System.out.println("Acid Rain.");
        System.out.println("This program determines if the pH level of a body of water is too unhealthy for fish.");
        System.out.println("Please enter the pH level of the water body:");
        pHlevel = input.nextDouble();

        //This block below sorts the users input into the categories such as 
        // invalid, too basic , too acidic and neutral
        if (pHlevel < 0 || pHlevel > 14) {
            System.out.println("Please enter non-theoretical values.");
        } else if (pHlevel < 6.4) {
            System.out.println("The water is too acidic. Fishes will die.");
        } else if (pHlevel > 7.4) {
            System.out.println("Water is too basic. Fishes will die.");
        } else {
            System.out.println("The water is Neutral enough for the fish to survive");
        }

    }

}
