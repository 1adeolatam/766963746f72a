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
public class WordEcho {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int lengthOfword;
        int counter = 0;
        String wordEntered;

        System.out.println("Please enter a word");
        String str1 = input.nextLine();
        wordEntered = str1;
        lengthOfword = str1.length();

        System.out.println("The word " + wordEntered + " has " + lengthOfword + " characters.");

        while (counter < lengthOfword) {
            System.out.print(wordEntered + " ");
            counter++;
        }

    }

}
