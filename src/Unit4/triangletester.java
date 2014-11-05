/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit4;

import java.awt.Dimension;
import java.awt.HeadlessException;
import javax.swing.JFrame;

/**
 *
 * @author 1adeolatam
 */
public class triangletester extends JFrame {

    Fractals fractal = new Fractals();
    Dimension d = new Dimension(800, 600);

    public triangletester() throws HeadlessException {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(d);
        this.setPreferredSize(d);
        this.add(fractal);
        this.setVisible(true);
    }

    public static void main(String[] args) {

        triangletester test = new triangletester();

    }

}
