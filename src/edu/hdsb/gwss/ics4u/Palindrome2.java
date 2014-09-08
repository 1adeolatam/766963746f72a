/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics4u;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author 1adeolatam
 */
public class Palindrome2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String Entered = "", reversed = "", word;
       
        String[] palindromes = new String[25];
        int palindromeArrayindex = 0;

        System.out.println("PLease enter a sentence, to check for palindromeness");
        Entered = input.nextLine();
         StringTokenizer st = new StringTokenizer(Entered, " ");
        while (st.hasMoreTokens()) {

            int i = st.nextToken().length() - 1;
            while (i > -1) {
                reversed = reversed + st.nextToken().charAt(i);
                i--;
            }
            if (st.nextToken().equalsIgnoreCase(reversed)) {
                palindromes[palindromeArrayindex] = st.nextToken();
                palindromeArrayindex++;
            }
        }
        
       
    }
}
