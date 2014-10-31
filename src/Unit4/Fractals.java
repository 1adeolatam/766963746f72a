/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author 1adeolatam
 */
public class Fractals extends JPanel {

    JPanel panel;
    int sidelength;
    Color LineColor = Color.GREEN;
    int[] point1,point2;
    
    
    public Fractals() {
        // MAIN WINDOW; The Price is Righta
 
        panel = new JPanel();
        // WINDOW; Border Layout
        this.setLayout(new BorderLayout());
        this.setSize(1000, 400);
        this.add(panel);

    }
       @Override
    protected void paintComponent(Graphics g) {
        g.drawPolygon(this.point1, this.point2, 3);
        
    }
    
    

    public static void main(String[] args) {
        new Fractals().setVisible(true);
    }

}