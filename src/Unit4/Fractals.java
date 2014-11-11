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
 * * Name: Tami Adeola 
 * Version: 1.0 
 * Date: Monday, November 10th, 2014 
 * Purpose: The purpose of this program is to create a fractal, modelled after sierplinski's triangle
 * @author 1adeolatam
 */
public class Fractals extends JPanel {

    public Fractals() {

    }

    public void drawTriangle(Graphics g, int xloc, int yloc, int sideLength) {
        int radius = sideLength / 9;
        //draws the two inner circles of the fractal
        g.setColor(Color.RED);
        g.fillOval((xloc + sideLength / 2) - 2 * radius, (yloc + sideLength / 2) + radius, radius, radius);
        g.setColor(Color.BLACK);
        g.fillOval((xloc + sideLength / 2) - 2 * radius, (yloc + sideLength / 2) + radius, radius / 2, radius / 2);

        // Ensures that there is at least 1 pixel sidelenght for the triangle
        if (sideLength > 1) {
            g.setColor(Color.BLACK);
            g.drawLine(xloc, yloc + sideLength, xloc + sideLength, yloc + sideLength);
            g.drawLine(xloc, yloc, xloc, yloc + sideLength);
            g.drawLine(xloc, yloc, xloc + sideLength, yloc + sideLength);
//recursive part* Calls itself to draw the inner triangles.
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
