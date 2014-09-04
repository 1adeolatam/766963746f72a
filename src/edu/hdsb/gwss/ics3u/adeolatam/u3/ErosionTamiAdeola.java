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
 * Purpose:This program calculates how soon topsoil will reach a point where no crops can grow
 *
 * @author Tami
 */
public class ErosionTamiAdeola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double topSoil;

        System.out.println("Please enter the amount of top soil present in centimeters:");
        topSoil = input.nextDouble();
        int year = 0;
// disallows invalid enteries
        if (topSoil <= 0) {
            System.out.println("PLEASE RESTART THE PROGRAM WITH VALID DATA.");
        } else {
            while (topSoil > 9.0) {

                topSoil = topSoil * .99 + 0.005;

                year++;
            }
            System.out.println("It will take " + year + " years for canada's topsoil to erode to 9 centimeters.");
        }
    }
}
