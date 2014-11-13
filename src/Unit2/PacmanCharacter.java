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
public abstract class PacmanCharacter implements Movement {

    public static final int STEP_SIZE = 10;
    public static final int DIRECTION_UP = 1;
    public static final int DIRECTION_DOWN = 2;
    public static final int DIRECTION_LEFT = 3;
    public static final int DIRECTION_RIGHT = 4;

    public static Console c = new Console();

    protected int xLoc;

    protected int yLoc;
    boolean alive;
    protected int direction;

    //Constructors
    public PacmanCharacter() {

    }

    public PacmanCharacter(Console hsaConsole) {
        this();
        if (c == null) {
            c = hsaConsole;
            System.out.println("INFO: HSA Console set.");
        }
    }

    protected PacmanCharacter(Color color, int xLoc, int yLoc) {
        if (xLoc < 0 || yLoc < 0) {
            System.out.println("Invalid location for this pacman character");
        } else {
            c.setColor(color);
            this.xLoc = xLoc;
            this.yLoc = yLoc;
        }
    }

    //object setters and getters
    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        if (direction < 1 || direction > 4) {
            System.out.println("invalid direction");
        } else {
            this.direction = direction;
        }
    }

    public int getxLoc() {
        return xLoc;
    }

    public void setxLoc(int xLoc) {
        if (xLoc < 0) {

        } else {
            this.xLoc = xLoc;
        }
    }

    public int getyLoc() {
        return yLoc;
    }

    public void setyLoc(int yLoc) {
        if (yLoc < 0) {

        } else {
            this.yLoc = yLoc;
        }
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    //Helper methods
    @Override
    public abstract void draw();

    @Override
    public void moveRight() {

        erase();
        this.xLoc = this.xLoc + STEP_SIZE;
        draw();
    }

    @Override
    public void moveUp() {

        erase();
        this.yLoc = this.yLoc - STEP_SIZE;
        draw();
    }

    @Override
    public void moveDown() {

        erase();
        this.yLoc = this.yLoc + STEP_SIZE;
        draw();
    }

    @Override
    public void moveLeft() {

        erase();
        this.xLoc = this.xLoc - STEP_SIZE;
        draw();
    }

    @Override
    public abstract void erase();

    public void move() {
        if (this.direction == 1) {
            this.moveUp();
        } else if (this.direction == 2) {
            this.moveDown();
        } else if (this.direction == 3) {
            this.moveLeft();
        } else if (this.direction == 4) {
            this.moveRight();
        } else {
            System.out.println("Invalid movement value");
        }
    }

    public static void setConsole(Console hsaConsole) {
        c = hsaConsole;
    }

}
