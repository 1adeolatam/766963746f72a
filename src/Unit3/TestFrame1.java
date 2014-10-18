/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unit3;

import javax.swing.JFrame;

/**
 *
 * @author Tami
 */
public class TestFrame1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame // 4. a reference to the object
                = new JFrame("Test Frame 1");   // 3. construct a JFrame object
        frame.setSize(200, 100);             // 5. set it to 200 pixels wide by 100 high
        frame.setVisible(true);           // 6. ask it to become visible on the screen
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       // 7. say what the close button does
    }

}
