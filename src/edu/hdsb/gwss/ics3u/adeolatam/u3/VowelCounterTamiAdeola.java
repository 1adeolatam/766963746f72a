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
public class VowelCounterTamiAdeola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfvowels = 0;

        String sentenceEntered;
        System.out.println("Please enter a sentence");
        sentenceEntered = input.next();
        sentenceEntered = sentenceEntered.toLowerCase();

        for (int i = 0; i < sentenceEntered.length(); i++) {
            switch (sentenceEntered.charAt(i)) {

                case 'a':
                case 'e':
                case 'i':
                case 'u':
                case 'o':
                    numberOfvowels ++;
                    break;
            }

        }
        System.out.println("There are " + numberOfvowels + " in this sentence.");

    }

}
