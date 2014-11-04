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
    int passes = 1;
    int sidelength = 10;

    public Fractals() {
        Dimension d = new Dimension(600, 500);
        this.setSize(d);
        this.xloc1 = 0;
        this.yloc1 = sidelength;

    }

    public void drawL(Graphics g, int xloc1, int yloc1) {
        g.setColor(Color.BLACK);
        g.fillRect(xloc1, yloc1, sidelength, sidelength);
        g.setColor(Color.white);
        g.fillRect(xloc1 + (sidelength / 2), yloc1, sidelength / 2, sidelength / 2);

    }

    public void recursion(Graphics g, int xloc, int yloc) {
        
        if(passes < 10){
        drawL(g, xloc, yloc);
        drawL(g, xloc + sidelength, yloc);
        drawL(g, xloc, yloc - sidelength);
        
       passes++;
        
        }
        
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.black);

        recursion(g, xloc1, yloc1);
        recursion(g, xloc1, yloc1 + 2 *sidelength);
        recursion(g, xloc1 + 2 * sidelength, yloc1 + 2 *sidelength);
   
           
    }
    

}
