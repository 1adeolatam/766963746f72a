/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit3;

import java.awt.FlowLayout;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author 1adeolatam
 */
public class Dietester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        JFrame Board = new JFrame("Dice holder 1");
        Board.setSize(1000, 1000);
        Board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        Die die = new Die();
//        die.setSizeFactor( 20 );
//        Die die2 = new Die();
//        JButton button = new JButton("Roll-oll");
//
//        die.setValue((int) (Math.random() * 6) + 1);
//        die2.setValue((int) (Math.random() * 6) + 1);
//
        JPanel panel = new JPanel(new FlowLayout());    
        panel.setSize(200, 200 );
        panel.add(new Die((int) (Math.random() * 6) + 1));
        panel.add(new Die((int) (Math.random() * 6) + 1));
        
        
        Board.add( panel );

        Board.pack();
        Board.setVisible(true);
        //button.setVisible(true);

    }

}
