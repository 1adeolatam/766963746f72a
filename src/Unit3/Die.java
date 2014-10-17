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

  
    final static int RADIUS = 10;

    int SIZE_FACTOR = 1;
    int value;

    public Die() {
        this.setSize(100, 100);
        this.setBackground(Color.yellow);
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

    public void setValue() {

    }

    public void setPosition() {

    }

    public void dot(int rolledNumber) {
        
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        grphcs.fillRect(WIDTH, WIDTH, WIDTH, WIDTH);
    }

}
