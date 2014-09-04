/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.hdsb.gwss.ics3u.adeolatam.u3;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author 1adeolatam
 */
public class RandomNumbersTamiAdeola {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws  Exception {
       
       // To write to a file
        File file = new File ("output.txt");
        PrintWriter output = new PrintWriter (file);        
        
       // Scanner input = new Scanner(file);
        
        int i =0;
        while(i<1000){
            
            output.println( (int) (Math.random() * 100) + 1);
            i++;
        }
          output.close();
        Scanner input = new Scanner(file);
          
        
        
    }
    
}
