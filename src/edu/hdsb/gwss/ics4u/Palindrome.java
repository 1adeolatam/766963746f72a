/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4u;

import java.util.Scanner;

/**
 *
 * @author 1adeolatam
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String Entered, reversed = "";

        System.out.println("PLease enter a word, to check for palindromeness");

        Entered = input.next();
        int i = Entered.length() - 1;
        while (i > -1) {
            reversed = reversed + Entered.charAt(i);
            i--;
        }
        if (reversed.equalsIgnoreCase(Entered)) {
            System.out.println("This String is a palindrome!");
        } else {
            System.out.println("This String is not a palindrome!");
        }

        

    }

}
