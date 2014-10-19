/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit3;

import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JComponent;

/**
 *
 * @author 1adeolatam
 */
public class Dietester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Graphics g;
        JFrame Board = new JFrame("Dice holder 1");
          Board.setSize(1000, 1000);
          Board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Board.setVisible(true);
        
        Die die = new Die();

        die.setVisible(true);
        die.setValue((int)(Math.random() * 5) + 1);

        
        Board.add(die);
        
        
        
        
    }

}
