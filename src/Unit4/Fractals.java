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

    int xloc1, xloc2, yloc1, yloc2;
    int n;
    int sidelength = 100;

    public Fractals() {
           Dimension d = new Dimension(600, 500);
        this.setSize(d);
        this.xloc1 = 100;
        this.yloc1 = 400;
        this.xloc2 = xloc1 + sidelength;
        this.yloc2 = yloc2 + sidelength;

    }

    public void drawL(Graphics g, int xloc1, int yloc1, int xloc2, int yloc2) {
        
        g.fillRect(xloc1 , yloc1, sidelength, sidelength);
        g.setColor(Color.white);
        g.fillRect(xloc1 + (sidelength / 2), yloc1 + (sidelength / 2), sidelength/2, sidelength/2);
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.black);
        drawL(g, xloc1, yloc1, xloc2, yloc2);

    }

    

}
