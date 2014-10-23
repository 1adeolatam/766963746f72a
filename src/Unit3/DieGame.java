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
import javax.swing.JLabel;
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
    JLabel outcome = new JLabel();
    JPanel panel = new JPanel(new FlowLayout());
    JButton button = new JButton("Roll-oll");

    @Override
    public void actionPerformed(ActionEvent evt) {

        die.roll();
        die2.roll();

        if (die.value == die2.value) {
            outcome.setText("YOU WIN");
            button.setText("Roll again please");

        } else if ((die.value + die2.value) == 7) {
            outcome.setText("YOU LOSE");
            button.setText("Roll again please");
        }else{
            outcome.setText("");
            button.setText("Roll-oll");
        }

        this.repaint();

    }

    public DieGame(String string) throws HeadlessException {
        super(string);

        Dimension d = new Dimension(600, 800);
        this.setSize(d);
        this.setPreferredSize(d);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button.addActionListener(this);

        die.setValue((int) (Math.random() * 6) + 1);
        die2.setValue((int) (Math.random() * 6) + 1);

        panel.setSize(400, 400);
        panel.add(die);
        panel.add(die2);

        this.setLayout(new FlowLayout());
        this.add(panel);
        this.add(outcome);
        this.add(button);

        this.pack();
        setVisible(true);

    }

}
