/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics3u.adeolatam.u3;

import java.util.Scanner;

/**
 *
 * @author Tami
 */
public class DaysToHoursTamiAdeola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int timeInhours, days, hours, seconds;
        System.out.println("Please Enter how much time in hours you \n you would like to convert: ");
        timeInhours = input.nextInt();
        System.out.println(timeInhours + " Hours Will be converted. :D");
        days = (timeInhours / 24);
        hours = (timeInhours % 24);
        System.out.println("There are " + days + " days and " + hours + " hours in " + timeInhours + " hours");

    }

}
