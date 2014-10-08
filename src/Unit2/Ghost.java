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
public class Ghost extends PacmanCharacter {
    int radius = 30;
    boolean eaten;
    boolean chasingPac;

    public Ghost(Color color, int xLoc, int yLoc) {
        super(color, xLoc, yLoc);
    }
    
    public void chase(boolean isChasing){
        
    }
    
    @Override
    public void draw( ) {        
    
      
   c.fillOval(this.xLoc, this.yLoc, radius,radius);
   c.fillRect(this.xLoc, this.yLoc+radius/2, radius, radius);
   
   
    }
    @Override
        public void moveLeft() {
             this.xLoc = this.xLoc - STEP_SIZE;
             erase();
             draw();
    }

    @Override
    public void moveRight() {

    }

    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }
      
    
    public void move(int direction){
        if(direction == 1){
            moveUp();
        }else if (direction == 2) {
            moveDown();
        }else if (direction ==3){
            moveLeft();
        }else if (direction ==4){
            moveRight();
        }else{
            System.out.println("Invalid movement value");
        }
    }
    

    private void erase() {

        c.setColor(Color.WHITE);
              
   c.fillOval(this.xLoc, this.yLoc, radius,radius);
   c.fillRect(this.xLoc, this.yLoc+radius/2, radius, radius);
   
    }
    
}
