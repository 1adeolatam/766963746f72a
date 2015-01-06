/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PerformanceTaskAdeola;


/**
 *
 * @author 1adeolatam
 */
public class FractionTester {

    
    
    
    public static void main(String[] args) {

   ProperFraction Keep = new ProperFraction(3, 21);
   
        System.out.println(Keep.toString());
        Keep.setNumerator(-7);
        System.out.println(Keep.getNumerator());
        System.out.println(Keep.toString());
    }
    
}
