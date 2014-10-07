/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Unit2;

import java.awt.Color;

/**
 *
 * @author Tami
 */
public class Ghost extends PacmanCharacter {
    int radius = 30;
    boolean eaten;
    
    
    public void draw( ) {
        
        c.setColour(Color.blue);
      
   c.fillOval(this.xLoc, this.yLoc, radius,radius);
   c.fillRect(this.xLoc, this.yLoc+radius/2, radius, radius);
   
   
    }
    
}
