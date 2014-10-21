/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit3;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author 1adeolatam
 */
public class Dietester implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent evt){
          Die die = new Die();

       Die die2 = new Die();
    }
    public static void main(String[] args) {

        JFrame Board = new JFrame("Dice holder 1");
        Dimension d = new Dimension(400, 600);
        Board.setSize(d);
        Board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       Die die = new Die();

       Die die2 = new Die();
        JButton button = new JButton("Roll-oll");
       
      
        
        button.setActionCommand("1");

        die.setValue((int) (Math.random() * 6) + 1);
        die2.setValue((int) (Math.random() * 6) + 1);

        JPanel panel = new JPanel(new FlowLayout());

        panel.setSize(400, 400);
        panel.add(die);
        panel.add(die2);

        Board.setLayout(new FlowLayout());
        Board.add(panel);
        Board.add(button);

        Board.pack();
        Board.setVisible(true);

    }

}


