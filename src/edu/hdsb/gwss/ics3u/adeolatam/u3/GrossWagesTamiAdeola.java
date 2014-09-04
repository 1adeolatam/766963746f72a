/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics3u.adeolatam.u3;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author Tami
 */
public class GrossWagesTamiAdeola {

    /**
     * @param args the command line arguments
     */
    final static double Overtime = 40;
    public static double hours, grossWage, hourlyPay;

    public static double CalculateGrossWage(double hours, double salary, boolean getsOvertime) {

        if (GrossWagesTamiAdeola.hours < 40 || getsOvertime == false) {
            GrossWagesTamiAdeola.grossWage = (hours * salary);
        } else {
            GrossWagesTamiAdeola.grossWage = (Overtime * GrossWagesTamiAdeola.hourlyPay) + ((GrossWagesTamiAdeola.hours - 40) * GrossWagesTamiAdeola.hourlyPay) * 1.5;
        }

        return GrossWagesTamiAdeola.grossWage;

    }

    public static void main(String[] args) {

        final double WAGE_CANADA = 10;

        System.out.println("Please enter the number of hours worked");

        NumberFormat money = NumberFormat.getCurrencyInstance();

        Scanner input = new Scanner(System.in);
        GrossWagesTamiAdeola.hours = input.nextInt();
        System.out.println("Please enter the hourlyPay");
        GrossWagesTamiAdeola.hourlyPay = input.nextInt();
        System.out.println("Canada " + (money.format(CalculateGrossWage(hours, WAGE_CANADA, true))));
        System.out.println("Bangladesh " + (money.format(CalculateGrossWage(hours, .15, false))));
        System.out.println("Dominican Republic " + (money.format(CalculateGrossWage(hours, 1.6, false))));
        System.out.println("China " + (money.format(CalculateGrossWage(hours, .48, false))));
        System.out.println("Haiti " + (money.format(CalculateGrossWage(hours, .55, false))));

    }

}
