/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Unit2;
import static Unit2.PacmanCharacter.c;
import hsa.Console;
import java.awt.Color;
/**
 *
 * @author Tami
 */
public class Pacman extends PacmanCharacter{
    
    int livesLeft;
    boolean poweredUp;
    int points;
    
    int radius = 35;
    
    
    public void draw( ) { 
            
 
      
    c.setColor(Color.YELLOW);

        c.fillOval(this.xLoc, this.yLoc, radius,radius );
        
    }
    
    
    
    
    
    
}
