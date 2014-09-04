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
public class length30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String firstWord, secondWord;
        int lengthOffirstWord, lengthOfsecondWord;
        int numberOfdots = 0;

        System.out.println("Please enter the first word");
        firstWord = input.nextLine();
        System.out.println("Please enter the second word");
        secondWord = input.nextLine();

        lengthOffirstWord = firstWord.length();
        lengthOfsecondWord = secondWord.length();
        
        while((lengthOffirstWord + lengthOfsecondWord + numberOfdots) < 30) {
           numberOfdots++; 

    }

        
        System.out.print(firstWord);
}

}
