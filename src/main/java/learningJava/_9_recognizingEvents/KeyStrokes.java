package learningJava._9_recognizingEvents;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by azmiks on 19/02/2017.
 */
class KeyStrokes extends JFrame implements KeyListener {

    JPanel pnl = new JPanel();

    JTextField field = new JTextField(38);
    JTextArea txtArea = new JTextArea(5, 38);


    public KeyStrokes() {

        super("Window Swing");
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(pnl);
        setVisible(true);

        pnl.add(field);
        pnl.add(txtArea);
        field.addKeyListener(this);
    }

    public void keyPressed (KeyEvent event) {
        txtArea.setText("Symbol is entered from keyboard");
    }

    public void keyTyped (KeyEvent event) {
        txtArea.append("\nSybmol: " + event.getKeyChar());
    }

    public void keyReleased (KeyEvent event) {
        int keyCode = event.getKeyCode();
        txtArea.append("\nKeyCode: " + event.getKeyCode());
        txtArea.append("\nKeyText: " + event.getKeyText(keyCode));
    }

    public static void main(String[] args) {

        KeyStrokes gui = new KeyStrokes();
    }
}
