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
public class OrderCheckerTamiAdeola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int PriceofBolt = 5;
        final int PriceofNut = 3;
        final int PriceofWasher = 1;

        int numberOfbolt, numberOfnut, numberOfwasher, totalPrice;

        Scanner input = new Scanner(System.in);

        System.out.println(" Please input the amount of bolts, nuts and washers.");
        System.out.println("Please enter amount of Bolts.");
        numberOfbolt = input.nextInt();
        System.out.println("Please enter amount of Nuts");
        numberOfnut = input.nextInt();
        System.out.println("Please enter amount of Washers");
        numberOfwasher = input.nextInt();
        boolean orderOK = true;

        if (numberOfbolt <= numberOfnut) {
            System.out.println(" Order is Bad. Low amount of nuts.");
            orderOK = false;
        }
        if ((2 * numberOfwasher) < numberOfbolt) {
            System.out.println("Not enough washers");
            orderOK = false;
        }

        else if (orderOK = true) {

            System.out.println("Thhe order is fine.");

        }
        totalPrice = ((PriceofBolt * numberOfbolt) + (PriceofNut * numberOfnut) + (PriceofWasher * numberOfwasher));
        System.out.println("The total price is " + totalPrice);

    }
}