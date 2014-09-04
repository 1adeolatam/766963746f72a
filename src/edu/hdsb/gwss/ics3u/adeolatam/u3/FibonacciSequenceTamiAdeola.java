/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.hdsb.gwss.ics3u.adeolatam.u3;

/**Name: TamiAdeola
 * Date: 23/03/2014
 * Version: 1.0
 * Purpose:The purpose is to show the first 20 numbers of the fibonacci sequence
 *
 * @author Tami
 */
public class FibonacciSequenceTamiAdeola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int aValue = 1,bValue =1;
        int cValue = aValue + bValue;
        
        
        
        System.out.println("This program will print out the first 20 terms of the fibonacci sequence");
        System.out.println(aValue);
        System.out.println(bValue);
        //Prints the first 2 digits
        int counter;
        for (counter = 1; counter < 19;counter++){
            
            
            //replaces the previous values of 1 to repeat the sequence 18 more times.
            aValue = bValue;
            bValue = cValue;
            System.out.println(cValue);
            cValue = aValue + bValue;
            
        }
        
        
    }
    
}
