package Unit3;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class PriceIsSometimesRightGame extends JFrame implements ActionListener, MouseListener {

    private JPanel middlePanel;
    private JPanel topDicePanel;
    private JPanel midDicePanel;
    private JPanel botDicePanel;
    private Die[][] dice;
    private String carPrice = "65613";
    public int rolledNumber;
    public JPanel showedDice = new JPanel();
    private JPanel leftrirst;
    private int totalDie = 3;
    private int currentdice = 0;

    public PriceIsSometimesRightGame() {
        init();
    }

    public void init() {

        // MAIN WINDOW; The Price is Righta
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("The Price is Right!");

        // WINDOW; Border Layout
        this.setLayout(new BorderLayout());
        this.setSize(800, 400);

        // PARENT PANEL
        this.middlePanel = new JPanel();
        this.middlePanel.setLayout(new BoxLayout(this.middlePanel, BoxLayout.PAGE_AXIS));
        this.middlePanel.setBorder(BorderFactory.createLineBorder(Color.YELLOW));

        // TOP DICE; HIGH
        this.topDicePanel = new JPanel();
        this.topDicePanel.setBorder(BorderFactory.createLineBorder(Color.BLUE));

        // BOT DICE; ROLLed
        this.midDicePanel = new JPanel();
        this.midDicePanel.setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
        this.midDicePanel.setLayout(new BoxLayout(this.midDicePanel, BoxLayout.LINE_AXIS));

        // BOT DICE; LOW
        this.botDicePanel = new JPanel();
        this.botDicePanel.setBorder(BorderFactory.createLineBorder(Color.BLUE));

        this.showedDice.setLayout(new BoxLayout(this.showedDice, BoxLayout.PAGE_AXIS));

        //1st digit of price
        this.leftrirst = new JPanel();
        this.leftrirst.setLayout(new BoxLayout(this.leftrirst, BoxLayout.LINE_AXIS));

        // GENERATE DIE, put them in TOP/BOT Dice Panel
        this.dice = new Die[3][4];
        initDice();

        // TOP / BOT Dice Panel
        this.middlePanel.add(showedDice);

        // ADD ITEMS TO middlePanel
        this.add(middlePanel, BorderLayout.CENTER);
        this.add(new JLabel("PAGE_START"), BorderLayout.PAGE_START);
        this.add(leftrirst, BorderLayout.LINE_START);
        this.add(new JLabel("LINE_END"), BorderLayout.LINE_END);
        this.add(new JLabel("PAGE_END"), BorderLayout.PAGE_END);
        //this.pack();

    }

    private void initDice() {
        Die die;
        Dimension d = new Dimension(100, 100);
        Die firstNumber;
        JPanel firstpanel = new JPanel();
        firstNumber = new Die((Integer.parseInt(carPrice.substring(0, 1))));
        firstNumber.setPreferredSize(d);

        firstpanel.add(firstNumber);

        for (int row = 0; row < dice.length; row++) {
            for (int col = 0; col < dice[row].length; col++) {
               // Die scored = new Die((Integer.parseInt(carPrice.substring(, ))));
                die = new Die();
                die.setPreferredSize(d);
                die.setSize(d);
                die.setName(row + "-" + col);
                die.addMouseListener((MouseListener) this);

                if (row == 0 || row == 2) {

                    //this.dice[row][col] = scored;

                } else if (row == 2) {
                    this.botDicePanel.add(this.dice[row][col]);
                }

                if (row == 0) {
                    this.topDicePanel.add(this.dice[row][col]);
                } else if (row == 1) {
                    this.midDicePanel.add(this.dice[row][col]);
                } else {
                    this.botDicePanel.add(this.dice[row][col]);
                }
            }
        }

        this.showedDice.add(topDicePanel);

        this.showedDice.add(midDicePanel);
        this.showedDice.add(botDicePanel);
        this.leftrirst.add(firstpanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // BUTTON PRESSED!!
        System.out.println("DO SOMETHING?");

    }

    @Override
    public void mouseClicked(MouseEvent e) {

        System.out.println("Mouse Clicked on " + e.getComponent().getName());

        // Moves through the 4 dice
        if (e.getComponent().getName().substring(0, 2).equalsIgnoreCase("0-")) {
            System.out.println("Higher!");
            this.dice[0][currentdice].setColour(Color.RED, Color.yellow);
            currentdice++;
        } else if (e.getComponent().getName().substring(0, 2).equalsIgnoreCase("2-")) {

            System.out.println("Lower!");
            this.dice[2][currentdice].setColour(Color.RED, Color.yellow);
            currentdice++;
        }
        repaint();

    }

    @Override
    public void mousePressed(MouseEvent e) {
        // DO NOTHING
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // DO NOTHING
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // DO NOTHING
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // DO NOTHING
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new PriceIsSometimesRightGame().setVisible(true);
            }
        }
        );

    }

}
