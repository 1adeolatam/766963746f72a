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
public class StartEnd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int startValue, endValue, placeholder;

        System.out.println("Please Enter the Start Value: ");
        startValue = input.nextInt();
        System.out.println("Please Enter the End Value: ");
        endValue = input.nextInt();
        
        if (startValue > endValue){
            placeholder = startValue;
            startValue = endValue;
            endValue = placeholder;
               
        }
        
        System.out.println("Output");
        while (startValue <= endValue) {
            
            System.out.println(startValue + " ");
            startValue++;
        }

    }

}
