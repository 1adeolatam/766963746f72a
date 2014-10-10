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
public class Pacman extends PacmanCharacter {

    final static int RADIUS = 35;
    
    
    boolean poweredUp;
    String name;
    
    
    int radius;

    //Constructors
    public Pacman() {
        setRadius(RADIUS);
    }

    public Pacman(String name, int radius) {
        this.name = name;
        this.radius = radius;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPoweredUp() {
        return poweredUp;
    }

    public void setPoweredUp(boolean poweredUp) {
        this.poweredUp = poweredUp;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius < 0) {

        } else {
            this.radius = radius;
        }
    }

    // Helpers
    @Override
    public void move() {
        super.move();
        if (this.yLoc <= (c.maxy() / 2)) {
            this.poweredUp =true;
            powerUP();
        }
        if (this.xLoc <= (c.maxx() / 2)) {
            this.poweredUp =true;
           powerUP();
        }
    }

    @Override
    public void draw() {

        c.setColor(Color.YELLOW);

        c.fillOval(this.xLoc, this.yLoc, radius, radius);

    }

    public void powerUP() {
        if (this.poweredUp == true) {
            this.radius = RADIUS * 2;
        }
    }

    @Override
    public void erase() {

        c.setColor(Color.WHITE);

        c.fillOval(this.xLoc, this.yLoc, radius, radius);

    }

    @Override
    public String toString() {
        return "Pacman's radius is " + radius + ", this pacman's name is  " + this.name;
    }

}
