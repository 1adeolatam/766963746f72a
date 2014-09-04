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
public class YorkSwagEzrealIsBadMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int x = 420;
       int y = 69;
       
       System.out.println("X + Y = " + (x + y));
       System.out.println("x / y = " + (x / y));
       System.out.println("x / 2.0 = " + (x / 2.0));
       System.out.println("x / 2 = " + (x / 2));
       System.out.println("x % 2 = " + (x % 2));
       System.out.println("x * y = " + (x * y));
       
       System.out.println("x ^ y =" + Math.pow(x, y));
       System.out.println(" Math.ceil 2.000001 y = " + Math.ceil(2.000001));
       System.out.println(" Math.floor 2.000001 y = " + Math.floor(2.000001));
       System.out.println(" Math.ceil -2.000001 y = " + Math.ceil(-2.000001));
       System.out.println(" Math.floor 2.000001 y = " + Math.floor(-2.000001));
       
       System.out.println(" Math.random() = " + Math.random());
       
       int dieValue = (int)(Math.random() );
       System.out.println(" dieValue: " + (int) ((Math.random() * 6) + 1));
       
       
         
       
  }
    
}
