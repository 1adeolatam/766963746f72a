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
public class PalindromeTamiAdeola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         String sentenceEntered, reversedSentence ="";
         
         
         System.out.println("Words that are the same forwards and backwards \n are called palindromes.");
         
         System.out.println("Please enter a sentence");
         sentenceEntered = input.next();
         int lengthOfsentence = sentenceEntered.length();
         
         
         for (int i = lengthOfsentence - 1 ; i >= 0; i--){
             
             reversedSentence = reversedSentence + sentenceEntered.charAt(i);
         }
         
         System.out.println("The word backwards is " + reversedSentence);
         
             if (sentenceEntered.equalsIgnoreCase(reversedSentence)){
                 System.out.println("Its a palindrome yaya");
             }else{
                 System.out.println("It aint a palindrome ;_;");
             }         
         
    }
    
}
