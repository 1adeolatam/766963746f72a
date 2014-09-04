/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.ics3u.adeolatam.u3;

import hsa.Console;
import static java.lang.System.console;

/**
 *
 * @author 1adeolatam
 */
public class DigitalClock {

    /**
     * @param args the command line arguments
     */
    static Console c = new Console("New Window");
    final static int width = 40;
    final static int height = 135;
    final static int gap = 5;
    final static int xLocation = 50;
    final static int yLocation = 60;

    public static void main(String[] args) {

        int number = 0;

        //top bar
        c.drawRect(xLocation, yLocation, height, width);
        //top right
        c.drawRect(xLocation + height - width, yLocation + width + gap, width, height);
        // top left
        c.drawRect(xLocation, yLocation + width + gap, width, height);
        // mid bar
        c.drawRect(xLocation, yLocation + 2 * gap + height + width, height, width);
        // bot right
        c.drawRect(xLocation + height - width, yLocation + 2 * width + 3 * gap + height, width, height);
        // bot left
        c.drawRect(xLocation, yLocation + 2 * width + 3 * gap + height, width, height);
        // bot lane
        c.drawRect(xLocation, yLocation + 4 * gap + 2 * height + 2 * width, height, width);

        //FILLED
        if (number != 2) {
            // bot right
            c.fillRect(xLocation + height - width, yLocation + 2 * width + 3 * gap + height, width, height);
        }
        if (number != 6 && number != 5) {
            //top right
            c.fillRect(xLocation + height - width, yLocation + width + gap, width, height);
        }
        if (number != 1 && number != 4) {
            //top bar
            c.fillRect(xLocation, yLocation, height, width);
        }
        if (number != 4 && number != 1 && number != 7) {
            // bot lane
            c.fillRect(xLocation, yLocation + 4 * gap + 2 * height + 2 * width, height, width);
        }
        if ((number != 1 && number != 7) && number != 0) {
            // mid bar
            c.fillRect(xLocation, yLocation + 2 * gap + height + width, height, width);
        }
        if (number == 2 || number == 6 || number == 8 || number == 0) {

            // bot left
            c.fillRect(xLocation, yLocation + 2 * width + 3 * gap + height, width, height);
        }
        if (number != 1 && number != 2 && number != 3 && number != 7) {
            // top left
            c.fillRect(xLocation, yLocation + width + gap, width, height);
        }

    }

}
