/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.hdsb.gwss.ics3u.adeolatam.u3;

/**
 *
 * @author 1adeolatam
 */
public class Change {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int value ; 
        
        System.out.println("Enter Change in Cents: 212");
        System.out.println("The Minimum Number of Coins : ");
        System.out.println("Quarters:" + (int) (212 / 25));
        System.out.println("Dimes:" + (int) (212 - (25 * 8)) / 10);
        System.out.println("Nickels:" + (int) (212 - (25 * 8)) % 5);
        System.out.println("Pennies:"  + (int) (212 - (25 * 8)) % 10 );
        
        
 
    }
    
}
