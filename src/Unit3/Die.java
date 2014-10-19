/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit3;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author 1adeolatam
 */
public class Die extends JPanel {

    final static int WIDTH = 100;
    final static int RADIUS = (int) WIDTH / 6;

    int SIZE_FACTOR = 1;
    int value;

    public Die() {
        this.setSize(100, 100);
        this.setBackground(Color.orange);

    }

    public Die(int number) {
        super();
        value = number;
    }

    public void setColour() {

    }

    public void setSizeFactor(int sizeFactor) {

        SIZE_FACTOR = sizeFactor;

    }

    public void setValue(int valueOfdie) {
        value = valueOfdie;
    }

    public void setPosition() {

    }

    private void dotsetter(Graphics g) {

        
        if ((value %2) == 1) {
            this.dot(g,1,1);
        }
        if (value > 1) {
            this.dot(g, 0, 0);
            this.dot(g, 2, 2);
        }
        if(value > 3){
            this.dot(g,2,0);
            this.dot(g, 0, 2);
        }
        if(value ==6){
             this.dot(g, 0, 1);
            this.dot(g, 2, 1);
        }
        
    }

    private void dot(Graphics g, int row, int col) {
        g.setColor(Color.GREEN);
        g.fillOval(10 + (row * 30), 10 + (col * 30), RADIUS, RADIUS);
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics g2d = (Graphics) grphcs;
        g2d.setColor(Color.BLACK);
        grphcs.fillRect(0, 0, WIDTH * SIZE_FACTOR, WIDTH * SIZE_FACTOR);
        dotsetter(g2d);

    }

}
