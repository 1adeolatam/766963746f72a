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
public class CosineLawTamiAdeola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double lengthOfa, lengthOfb, angleOfC, answer;

        System.out.println("Enter the side length of side A: ");
        lengthOfa = input.nextDouble();
        System.out.println("Enter the side length of side B: ");
        lengthOfb = input.nextDouble();
        System.out.println("Enter the angle of C: ");
        angleOfC = input.nextDouble();
        answer = Math.sqrt((lengthOfa * lengthOfa) + (lengthOfb * lengthOfb) - 2 * lengthOfa * lengthOfb * Math.cos(Math.toRadians(angleOfC)));

        System.out.println("The length of side c is " + (answer));
        

    }

}
