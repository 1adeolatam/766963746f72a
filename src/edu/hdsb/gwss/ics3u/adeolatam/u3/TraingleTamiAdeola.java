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
 * Purpose: This program determines if 3 inputted side lengths can form a triangle and 
 * if they will also form a right angled triangle.
 */
public class TraingleTamiAdeola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sideA, sideB, sideC, placeHolder;

        System.out.println("Please enter sidelength of side a");
        sideA = input.nextInt();
        System.out.println("Please enter sidelength of side b");
        sideB = input.nextInt();
        System.out.println("Please enter sidelength of side c");
        sideC = input.nextInt();
//The code below compares the side lengths and makes a the smallest term and c the largest
        if (sideA > sideB || sideA > sideC) {
            if (sideB > sideC) {
                placeHolder = sideA;
                sideA = sideC;
                sideC = placeHolder;
            } else {
                placeHolder = sideA;
                sideA = sideB;
                sideB = placeHolder;
            }
        }

        if (sideB > sideC) {

            placeHolder = sideB;
            sideB = sideC;
            sideC = placeHolder;

        }
//This code determines if the triangle is also a right Angled one through Pythagorean Theory
        if (sideA + sideB >= sideC) {
            System.out.println("It is a triangle");
            if (Math.pow(sideA, 2) + Math.pow(sideB, 2) == Math.pow(sideC, 2)) {
                System.out.println("it is also a right triangle angle.");
            }

        } else {
            System.out.println("It's not a triangle");
        }
        System.out.println("side a is " + sideA + " side b is " + sideB + " side c is " + sideC);

    }
}
