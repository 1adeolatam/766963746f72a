/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.hdsb.gwss.ics3u.adeolatam.u3;

/**Name: TamiAdeola
 * Date: 23/03/2014
 * Version: 1.0
 * Purpose: This program shows that the adding of progressive halves from 1 will never equate to 2
 *
 * @author Tami
 */
public class CloserToTwoTamiAdeola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //initializes variables
        double denominator =  1, startingNumber = 0, sum = 0;
        
        
        System.out.println("This program demonstrates that the addind\n of progressive halves from 1 i.e 1 + 1/2 + 1/4 + ... \nwill never equate to 2 without rounding.");
        
        do{
            //The main calculation of the programs
            sum = startingNumber + (1/denominator);
            //Displays the calculation
            System.out.println(startingNumber + "+" + "1/" + denominator + " = " + sum );
            //Increases the denominator
            denominator = denominator * 2;
            startingNumber = sum;
            
            
        }while(sum < 2); 
        // condition for the loop to continue
        System.out.println("The last result is a 2.0 pecause java eventually rounds the answer to 2.");
        
    }
    
}
