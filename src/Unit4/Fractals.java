/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit4;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author 1adeolatam
 */
public class Fractals extends JPanel {

    public Fractals() {

    }

    public void drawTriangle(Graphics g, int xloc, int yloc, int sideLength) {
        int radius = sideLength / 9;
        g.setColor(Color.RED);
        g.fillOval((xloc + sideLength / 2) - 2 * radius, (yloc + sideLength / 2) + radius, radius, radius);
        g.setColor(Color.BLACK);
        g.fillOval((xloc + sideLength / 2) - 2 * radius, (yloc + sideLength / 2) + radius, radius / 2, radius / 2);

        if (sideLength > 1) {
            g.setColor(Color.BLACK);
            g.drawLine(xloc, yloc + sideLength, xloc + sideLength, yloc + sideLength);
            g.drawLine(xloc, yloc, xloc, yloc + sideLength);
            g.drawLine(xloc, yloc, xloc + sideLength, yloc + sideLength);

            drawTriangle(g, xloc, yloc, sideLength / 2);
            drawTriangle(g, xloc, yloc + sideLength / 2, sideLength / 2);
            drawTriangle(g, xloc + sideLength / 2, yloc + sideLength / 2, sideLength / 2);
        }

    }

    @Override
    protected void paintComponent(Graphics g) {

        g.setColor(Color.black);

        drawTriangle(g, 0, 0, 1000);

    }

}
