package learningJava.recognizingEvents;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * Created by azmiks on 19/02/2017.
 */
class Mouse extends JFrame implements MouseListener, MouseMotionListener{

    JPanel pnl = new JPanel();

    JTextArea txtArea = new JTextArea(8, 38);
    int x, y;


    public Mouse() {

        super ("Window Swing");
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(pnl);
        setVisible(true);

        pnl.add(txtArea);
        txtArea.addMouseListener(this);
        txtArea.addMouseMotionListener(this);
    }

    public void mouseMoved (MouseEvent event) {
        x = event.getX();
        y = event.getY();
    }

    public void mouseDragged (MouseEvent event) {
    }

    public void mouseEntered (MouseEvent event) {
        txtArea.setText("Mouse button is clicked");
    }

    public void mousePressed (MouseEvent event) {
        txtArea.append("\nMouse button is clicked when points the position X: " + x + " Y: " + y);
    }

    public void mouseReleased (MouseEvent event) {
        txtArea.append("\nMouse button is released");
    }

    public void mouseClicked (MouseEvent event) {
    }

    public void mouseExited (MouseEvent event) {
    }

    public static void main(String[] args) {
        Mouse gui = new Mouse();
    }
}
