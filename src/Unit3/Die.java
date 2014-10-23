/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author 1adeolatam
 */
public class Die extends JPanel {

    final static int WIDTH = 100;
    final static int RADIUS = (int) WIDTH / 6;

    int SIZE_FACTOR = 1;
    int value;
    Graphics g;
    Color dieColor = Color.BLACK;
    Color dotColor = Color.GREEN;

    public Die() {
        this.setSize(100, 100);
        Dimension d = new Dimension(SIZE_FACTOR * 100, SIZE_FACTOR * 100);
        this.setPreferredSize(d);

    }

    public Die(int number) {
        super();
        value = number;
    }

    public void setColour(Color newDieColor, Color newdotColor) {
        dotColor = newdotColor;
        dieColor = newDieColor;

    }

    public void setSizeFactor(int sizeFactor) {
        this.setSize(100, 100);
        Dimension d = new Dimension(400 * SIZE_FACTOR, 300 * SIZE_FACTOR);
        this.setPreferredSize(d);
        SIZE_FACTOR = sizeFactor;

    }

    public void setValue(int valueOfdie) {
        value = valueOfdie;
    }

    public int getValue() {
        return value;
    }

    private void dotsetter(Graphics g) {

        if ((value % 2) == 1) {
            this.dot(g, 1, 1);
        }
        if (value > 1) {
            this.dot(g, 0, 0);
            this.dot(g, 2, 2);
        }
        if (value > 3) {
            this.dot(g, 2, 0);
            this.dot(g, 0, 2);
        }
        if (value == 6) {
            this.dot(g, 0, 1);
            this.dot(g, 2, 1);
        }

    }

    private void dot(Graphics g, int row, int col) {
        g.setColor(dotColor);
        g.fillOval((SIZE_FACTOR * (WIDTH / 10) + (row * 30)), (SIZE_FACTOR * (WIDTH / 10) + (col * 30)), (SIZE_FACTOR * RADIUS), (SIZE_FACTOR * RADIUS));
    }

    public void roll() {

        this.value = ((int) (Math.random() * 6) + 1);

    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics g2d = (Graphics) grphcs;
        g2d.setColor(dieColor);
        grphcs.fillRect(0, 0, WIDTH * SIZE_FACTOR, WIDTH * SIZE_FACTOR);
        dotsetter(g2d);

    }

}
