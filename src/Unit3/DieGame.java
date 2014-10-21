/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit3;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author 1adeolatam
 */
public class DieGame extends JFrame implements ActionListener {

    Die die = new Die();

    Die die2 = new Die();
    public Graphics Graphics;
    Graphics g2d = (Graphics);

    @Override
    public void actionPerformed(ActionEvent evt) {

        die.roll();
        die2.roll();
        this.repaint();

    }

    public DieGame(String string) throws HeadlessException {
        super(string);

        Dimension d = new Dimension(400, 600);
        this.setSize(d);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button = new JButton("Roll-oll");
        button.addActionListener(this);

        die.setValue((int) (Math.random() * 6) + 1);
        die2.setValue((int) (Math.random() * 6) + 1);

        JPanel panel = new JPanel(new FlowLayout());

        panel.setSize(400, 400);
        panel.add(die);
        panel.add(die2);

        this.setLayout(new FlowLayout());
        this.add(panel);
        this.add(button);

        this.pack();
        setVisible(true);
        if (die.value == die2.value) {
            System.out.println("YOU WIN");
           
        } else if ((die.getValue() + die2.getValue()) == 7) {
            System.out.println("YOU LOSE");
          
        }
    }

}
