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
public class PacmanClient {

    public static void main(String[] args) {
        
        
            Ghost Inky = new Ghost(Color.MAGENTA,10,60);
        Inky.draw();
    
        
        Pacman TuPac = new Pacman();
        
       TuPac.setxLoc(40);
       TuPac.setyLoc(20);
       
       TuPac.draw();
       
       Ghost Blinky = new Ghost(Color.CYAN, 60, 60);
        
       Blinky.draw();
    }
}

