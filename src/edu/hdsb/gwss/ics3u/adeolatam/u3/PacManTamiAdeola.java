/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.hdsb.gwss.ics3u.adeolatam.u3;

import hsa.Console;
import java.awt.Color;

/**
 *
 * @author 1adeolatam
 */
public class PacManTamiAdeola {

    /**
     * @param args th Console c = new Console( "New Window" );
        e command line arguments
     */
    public static void main(String[] args) {
        
        final int PACMANSIZE = 300;
        
        int locationx = 20, locationy = 20;
        int eyeLocationx = 90, eyeLocationy = 70;
        
        Console c = new Console( "New Window" );
        
       
        
        for(int i = 1; i < 100000000;locationx = locationx + 1 ){
            
             c.setColor(Color.yellow);
        c.fillArc(locationx, locationy, PACMANSIZE, PACMANSIZE, 45, 270);
        c.setColor(Color.BLACK);
        c.fillArc(eyeLocationx, eyeLocationy, 40, 40, 0, 360);
        eyeLocationx = eyeLocationx + 1;
        c.clear();
            
        }
          
        
        
    }
    
}
