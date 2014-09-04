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
public class DistanceCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double lat1,lat2,lon1,lon2;
        
       System.out.println("Please enter the latitude and longitude of laction and location 2 in order");
       System.out.println("Please use positive numbers for north and east and negative for west & south");
        lat1 = input.nextDouble();
        lon1 = input.nextDouble();
        lat2 = input.nextDouble();
        lon2 = input.nextDouble();
       
       
    }
    
}
