package learningJava.recognizingEvents;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by azmiks on 19/02/2017.
 */
class Messages extends JFrame implements ActionListener{

    JPanel pnl = new JPanel();

    JButton btn1 = new JButton("Show INFO message");
    JButton btn2 = new JButton("Show WARNING message");
    JButton btn3 = new JButton("Show ERROR message");

    public Messages() {

        super ("Window Swing");
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(pnl);
        setVisible(true);

        pnl.add(btn1);
        pnl.add(btn2);
        pnl.add(btn3);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
    }

    public void actionPerformed (ActionEvent event) {

        if (event.getSource() == btn1) {
            JOptionPane.showMessageDialog(this, "Info", "Dialog message", JOptionPane.INFORMATION_MESSAGE);
        }

        if (event.getSource() == btn2) {
            JOptionPane.showMessageDialog(this, "Warning", "Dialog message", JOptionPane.WARNING_MESSAGE);
        }

        if (event.getSource() == btn3) {
            JOptionPane.showMessageDialog(this, "Error", "Dialog message", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {

        Messages gui = new Messages();
    }
}
