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
public class HeronFormulaTamiAdeola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double valueOfa, valueOfb, valueOfc, valueOfs, finalAnswer;
        
        System.out.println("Please put in the value of a b and c respectively.");
        System.out.println("Please input a");
        valueOfa = input.nextDouble();
        System.out.println("Please input b");
        valueOfb = input.nextDouble();
        System.out.println("Please input c");
        valueOfc = input.nextDouble();
       valueOfs = ((valueOfa + valueOfb + valueOfc) / 2);
       System.out.println("The value of S in herons formula is " + valueOfs);
       
       finalAnswer = Math.sqrt(valueOfs *(valueOfs - valueOfa) * (valueOfs - valueOfb) *(valueOfs - valueOfc) );
       
       System.out.println("The area of this triangle is " + finalAnswer);
       
    }
    
}
