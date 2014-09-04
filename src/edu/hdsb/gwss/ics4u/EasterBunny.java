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
public class EasterBunny {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int year,a,b,c,d,e,f,g,h,i,j,k,m,p,day, month;
         year = input.nextInt();
         
         a    = year % 19;
         b    = year / 100;
         c    = year % 100;
         d    = b/4;
         e    = b%4;
         f    = (8+b)/25;
         g    = (b-f+1) % 3;
         h    = (19* a + b - d - g+15) % 30;
         i    = c / 4;
         k    = c % 4;
         j    = (32+ 2 * e + 2 * i - h - k) % 7;
         m    = (a + 11 * h + 22 * j) /451;
         month = (h + j - 7 * m + 114) / 31;
         p     = (h + j - 7 * m + 114) % 31;
         day  = p + 1;
         
         
                    System.out.println( p);
                     System.out.println( month);
         System.out.println(" Easter sunday will fall on day " + day + " in month " + month);
    }
    
}
