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
public class GolfTamiAdeola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);


                
        int[] holeScore = new int[18];
        int total = 0;
        System.out.println("Please enter the scores for each hole in order.");
        for (int i = 0; i < holeScore.length; i++) {
            System.out.print("Hole " + (i + 1) + "  ");
            holeScore[i] = input.nextInt();
            total = total + holeScore[i];
        }

        System.out.println(total);
    }

}
