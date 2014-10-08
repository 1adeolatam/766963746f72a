/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit2;

import hsa.Console;
import java.awt.Color;

/**
 *
 * @author Tami
 */
public class PacmanCharacter {

    public static final int DIRECTION_UP = 1;
    public static final int DIRECTION_DOWN = 2;
    public static final int DIRECTION_LEFT = 3;
    public static final int DIRECTION_RIGHT = 4;

    public static Console c = new Console();

    int xLoc;
    int yLoc;
    boolean alive;
    int direction;

    public PacmanCharacter() {
    }

    public PacmanCharacter(Console hsaConsole) {
        this();
        if (c == null) {
            c = hsaConsole;
            System.out.println("INFO: HSA Console set.");
        }
    }

    
    public PacmanCharacter(Color color, int xLoc, int yLoc) {
        c.setColor(color);
        this.xLoc = xLoc;
        this.yLoc = yLoc;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }
    
    

    public int getxLoc() {
        return xLoc;
    }

    public void setxLoc(int xLoc) {
        this.xLoc = xLoc;
    }

    public int getyLoc() {
        return yLoc;
    }

    public void setyLoc(int yLoc) {
        this.yLoc = yLoc;
    }

    public boolean isAlive() {
        return alive;
    }

    public void draw() {

    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void moveLeft() {

    }

    public void moveRight() {

    }

    public void moveUp() {

    }

    public void moveDown() {

    }

    private void erase() {

    }

    public static void setConsole(Console hsaConsole) {
        c = hsaConsole;
    }

}
