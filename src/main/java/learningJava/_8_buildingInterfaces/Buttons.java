package learningJava._8_buildingInterfaces;

import javax.swing.*;

/**
 * Created by Myroslava_Zubach on 17.02.2017.
 */
class Buttons extends JFrame {
    JPanel pnl = new JPanel();

//    ClassLoader ldr = this.getClass().getClassLoader();
//    java.net.URL tickURL = ldr.getResource("C:\\Users\\Myroslava_Zubach\\IdeaProjects\\ZMI\\src\\main\\resources\\tick.png");
//    java.net.URL crossURL = ldr.getResource("C:\\Users\\Myroslava_Zubach\\IdeaProjects\\ZMI\\src\\main\\resources\\cross.png");
//
//    ImageIcon tick = new ImageIcon(tickURL);
//    ImageIcon cross = new ImageIcon(crossURL);

//    ImageIcon tick = new ImageIcon("C:\\Users\\Myroslava_Zubach\\IdeaProjects\\ZMI\\src\\main\\resources\\tick.png");
//    ImageIcon cross = new ImageIcon("C:\\Users\\Myroslava_Zubach\\IdeaProjects\\ZMI\\src\\main\\resources\\cross.png");

    ImageIcon tick = new ImageIcon("tick.png");
    ImageIcon cross = new ImageIcon("cross.png");


    JButton btn = new JButton("Click here");
    JButton tickBtn = new JButton(tick);
    JButton crossBtn = new JButton("Stop", cross);

    public Buttons() {

        super("Window Swing");
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(pnl);
        setVisible(true);

        pnl.add(btn);
        pnl.add(tickBtn);
        pnl.add(crossBtn);
    }

    public static void main(String[] args) {

        Buttons gui = new Buttons();
    }
}
