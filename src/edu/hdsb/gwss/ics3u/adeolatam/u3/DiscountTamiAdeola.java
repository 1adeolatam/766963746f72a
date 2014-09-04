package edu.hdsb.gwss.ics3u.adeolatam.u3;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1adeolatam
 */
public class DiscountTamiAdeola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        
        int priceOfpurchaseIncents, totalOfpurchase;
        
        System.out.println("Please enter the price of your purchase in cents");
        priceOfpurchaseIncents = input.nextInt();
        
        if(priceOfpurchaseIncents > 1000){ 
        totalOfpurchase = (int) (priceOfpurchaseIncents * .9);
        }
        else{ 
        totalOfpurchase = priceOfpurchaseIncents;
        }
        System.out.println("The total amount to be payed is " + totalOfpurchase);
        
    }
    
}
