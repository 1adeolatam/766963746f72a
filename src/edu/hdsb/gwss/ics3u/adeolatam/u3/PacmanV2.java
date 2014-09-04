/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics3u.adeolatam.u3;

import hsa.Console;
import java.awt.Color;
import java.awt.event.KeyEvent;

/**
 *
 * @author 1adeolatam
 */
public class PacmanV2 extends Console {

    final int PACMANSIZE = 100;
    final int STEPSIZE = 10;
    final int EYESIZE = 20;

    int locationx = 20, locationy = 20;
    //int eyeLocationx = 90, eyeLocationy = 70;

    public PacmanV2() {
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        PacmanV2 pacman = new PacmanV2();
        pacman.drawOpenup();
    }

    public void drawOpenup() {

        setColor(Color.YELLOW);

        fillArc(locationx, locationy, PACMANSIZE, PACMANSIZE, 125, 270);
        setColor(Color.BLACK);
        fillArc(locationx + 15, locationy + 30, EYESIZE, EYESIZE, 0, 360);

    }

    public void drawOpendown() {
        setColor(Color.YELLOW);

        fillArc(locationx, locationy + STEPSIZE, PACMANSIZE, PACMANSIZE, 270, 340);
        setColor(Color.BLACK);
        fillArc(locationx + 15, locationy + 70, EYESIZE, EYESIZE, 0, 360);

    }

    public void drawOpenright() {

        setColor(Color.YELLOW);

        fillArc(locationx + STEPSIZE, locationy, PACMANSIZE, PACMANSIZE, 45, 270);
        setColor(Color.BLACK);
        fillArc(locationx + 45, locationy + 20, EYESIZE, EYESIZE, 0, 360);

    }

    public void drawOpenleft() {
        setColor(Color.YELLOW);

        fillArc(locationx, locationy, PACMANSIZE, PACMANSIZE, 225, 270);
        setColor(Color.BLACK);
        fillArc(locationx + 45, locationy + 20, EYESIZE, EYESIZE, 0, 360);

    }

    public void erasePacman() {
        setColor(Color.WHITE);

        fillArc(locationx, locationy, PACMANSIZE + 10, PACMANSIZE + 10, 0, 360);

    }

    public void pacmanDelay() {
        try {
            Thread.sleep(400);
        } catch (Exception e) {

        }
    }

    public void keyPressed(KeyEvent e) {
        int keyPressed = e.getKeyCode();
        switch (keyPressed) {
            case KeyEvent.VK_UP:
                erasePacman();
                locationy = locationy - STEPSIZE;

                System.out.println("UP");

                drawOpenup();
                break;
            case KeyEvent.VK_DOWN:
                erasePacman();
                locationy = locationy + STEPSIZE;

                System.out.println("D0WN");
                drawOpendown();
                break;
            case KeyEvent.VK_RIGHT:
                erasePacman();
                locationx = locationx + STEPSIZE;

                System.out.println("RIGHT");
                drawOpenright();
                break;
            case KeyEvent.VK_LEFT:
                erasePacman();
                locationx = locationx - STEPSIZE;

                System.out.println("LEFT");
                drawOpenleft();

        }

    }

}
