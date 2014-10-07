/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit2;

import hsa.Console;

/**
 *
 * @author Tami
 */
public class PacmanCharacter {

    public static Console c = new Console();

    int xLoc;
    int yLoc;
    boolean alive;

    public PacmanCharacter() {
    }

    public PacmanCharacter(Console hsaConsole) {
        this();
        if (c == null) {
            c = hsaConsole;
            System.out.println("INFO: HSA Console set.");
        }
    }

    public PacmanCharacter(int xLoc, int yLoc) {

        this.xLoc = xLoc;
        this.yLoc = yLoc;
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
