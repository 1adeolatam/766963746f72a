/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.hdsb.gwss.ics3u.adeolatam.u3;

import hsa.Console;
import java.util.Scanner;

/**
 *
 * @author 1adeolatam
 */
public class TicTacToe {

    /**
     * @param args the command line arguments
     */
    
    final static int leftVertLocx = 150;
      final static int leftVertLocy = 30;
      final static int leftVertLength = 300;
      final static int lineThickness = 1;
      final static int topHorizLocx = 75;      
        final static int topHorizLocy =100;
        final static int spacing = leftVertLength/2;
        final static int distanceaccrossx = 40;
        final static int radius = 75;
        static int [][] board;
      static Console c = new Console("New Window");
    public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
           int playerChoice = input.nextInt();
          
           //left vertical line
           c.drawRect(leftVertLocx, leftVertLocy,  lineThickness, leftVertLength);
           // top horizontal line
           c.drawRect(topHorizLocx,topHorizLocy,leftVertLength,lineThickness);
           // right vertical line
           c.drawRect(leftVertLocx+spacing,leftVertLocy,lineThickness,leftVertLength);
           // bot horizontal line
           c.drawRect(topHorizLocx,topHorizLocy+spacing,leftVertLength,lineThickness);

           //topleft X & O
           if(playerChoice == 7){
               c.fillOval(topHorizLocx,leftVertLocy , radius, radius);
              
           }
           
    }
    
}
