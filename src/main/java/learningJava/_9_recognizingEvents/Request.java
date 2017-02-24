package learningJava._9_recognizingEvents;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by azmiks on 19/02/2017.
 */
class Request extends JFrame implements ActionListener {

    JPanel pnl = new JPanel();

    JTextField field = new JTextField(38);
    JButton btn1 = new JButton("Confirmation request");
    JButton btn2 = new JButton("Input request");

    public Request() {

        super("Window Swing");
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(pnl);
        setVisible(true);

        pnl.add(field);
        pnl.add(btn1);
        pnl.add(btn2);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
    }

    public void actionPerformed (ActionEvent event) {

        if (event.getSource() == btn1) {

            int n = JOptionPane.showConfirmDialog(this, "Please confirm", "Confirmation dialog",
                    JOptionPane.YES_NO_CANCEL_OPTION);
            switch(n) {
                case 0: field.setText("Yes"); break;
                case 1: field.setText("No"); break;
                case 2: field.setText("Cancel"); break;
            }
        }

        if (event.getSource() == btn2) {
            field.setText(JOptionPane.showInputDialog(this, "Comment", "Input dialog",
                    JOptionPane.PLAIN_MESSAGE));
        }
    }

    public static void main(String[] args) {
        Request gui = new Request();
    }
}
