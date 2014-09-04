/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics3u.adeolatam.u3;

import java.text.NumberFormat;

/**
 *
 * @author 1adeolatam
 */
public class Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       // Money (localized)
NumberFormat money = NumberFormat.getCurrencyInstance();
double dollars = 21.4567;
System.out.println( money.format( dollars ) );
 
// Number (localized)
NumberFormat number = NumberFormat.getIntegerInstance();
int num = 123456789;
System.out.println( number.format( num ) );
 
// Percent (localized)
NumberFormat percent = NumberFormat.getPercentInstance();
double sale = .1944;
System.out.println( percent.format( sale ) );
 
     // Decimal (localized)
     NumberFormat decimal = NumberFormat.getNumberInstance(); 
     decimal.setMinimumFractionDigits( 3 );
     decimal.setMaximumFractionDigits( 4 );
     double numWithDecimal = 7 / 3.0;
     System.out.println( decimal.format( numWithDecimal ) );
        
        
    }

}
