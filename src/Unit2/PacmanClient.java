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

    public static void delay() {
        try {
            Thread.sleep(30);
        } catch (Exception e) {

        }
    }

    public static void main(String[] args) {

        Ghost Inky = new Ghost(Color.MAGENTA, 350, 60, "Inky");
        Inky.draw();

        Pacman TuPac = new Pacman();

        TuPac.setxLoc(400);
        TuPac.setyLoc(500);

        TuPac.draw();

        Ghost Blinky = new Ghost(Color.CYAN, 400, 200, "Blinky");

        Blinky.draw();

        TuPac.setDirection(1);
        Inky.setDirection(3);
        Blinky.setDirection(4);

        for (int i = 0; i < 50; i++) {
            System.out.println("MOVE");
            TuPac.move();
            Inky.move();
            Blinky.move();
            delay();
        }
        // Checking constructors
        Pacman Sacman = new Pacman("Sacman",30);
        Pacman Racman = new Pacman();
        
        
        //invalid x and y location
        Ghost Rinky = new Ghost(Color.pink,-56,-70,"Rinkeh");
        
        
        //null object
        Ghost Sinky = new Ghost(null);
        
        
        
    }
}
