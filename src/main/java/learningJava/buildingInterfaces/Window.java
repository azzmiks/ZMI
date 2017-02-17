package learningJava.buildingInterfaces;

import javax.swing.*;

/**
 * Created by Myroslava_Zubach on 17.02.2017.
 */

class Window extends JFrame {

    JPanel pnl = new JPanel();

    public Window() {

        super("Window Swing");
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(pnl);
        setVisible(true);
    }

    public static void main(String[] args) {

        Window gui = new Window();
    }
}

