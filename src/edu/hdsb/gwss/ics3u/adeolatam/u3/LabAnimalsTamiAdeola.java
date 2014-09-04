/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.hdsb.gwss.ics3u.adeolatam.u3;

import java.util.Scanner;

/**Name: TamiAdeola
 * Date: 23/03/2014
 * Version: 1.0
 * Purpose: Calculates the amount of time it takes for animals to to out live their food if a constant amount is added
 *
 * @author Tami
 */
public class LabAnimalsTamiAdeola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
          
          int amountOfanimals, amountOffood, hourlyFood;
         
        System.out.println("This program will determine when the animals in a lab will out live the amount of food provide");
        System.out.println("The animals eat 1 unit of food and double every hour.");
        //gets data for variables
        System.out.print("Please enter the initial amount of animals: ");
        amountOfanimals = input.nextInt();
        System.out.print("Please enter the initial amount of food: ");
        amountOffood = input.nextInt();
        System.out.print("Please enter the amount of food added per hour: ");
        hourlyFood = input.nextInt();
        //disallows invalid enteries
        if (amountOfanimals <= 0 || amountOffood <= 0 || hourlyFood <= 0){
            System.out.println("PLEASE RESTART THE PROGRAM AND ENTER VALID DATA.");
                    
       }else{        
        
        System.out.format("%2s %5s %10s", "Hour", "Amount of Animals", "Amount of Food");
        for( int hour = 1; amountOfanimals < amountOffood; hour++){
            
            //calculations done to determine variables
            System.out.format("\n%-2d %5d %10d", hour, amountOfanimals, amountOffood);
            amountOffood = amountOffood + hourlyFood;
            amountOffood = amountOffood - amountOfanimals;
            amountOfanimals = amountOfanimals * 2;
            
            
            
        }
        }
    }
        
        
       
      
        
        
        
        
    }
    

