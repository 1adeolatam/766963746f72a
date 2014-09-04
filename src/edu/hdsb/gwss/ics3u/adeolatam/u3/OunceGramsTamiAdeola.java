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
 * Purpose: This program is used to convert ounces to grams up to 15.
 *
 * @author 1adeolatam
 */
public class OunceGramsTamiAdeola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//initializes grams variable
        double grams = 28.35;

        System.out.println("Ounce to Grams conversion chart.");

        System.out.format("%-2s %-9s\n", "Ounces", "Grams");
        // increases the number of ounces and caluclates the grams.
        for (int ounces = 1; ounces < 16; ounces++) {

            System.out.format("%-2d %10.2f\n", ounces, ounces * grams);

        }

    }

}
