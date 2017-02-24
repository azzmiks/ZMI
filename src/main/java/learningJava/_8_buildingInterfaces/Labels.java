package learningJava._8_buildingInterfaces;

import javax.swing.*;

/**
 * Created by Myroslava_Zubach on 17.02.2017.
 */
class Labels extends JFrame {
    JPanel pnl = new JPanel();

//    ClassLoader ldr = this.getClass().getClassLoader();
//    ImageIcon duke = new ImageIcon(ldr.getResource("C:\\Users\\Myroslava_Zubach\\IdeaProjects\\ZMI\\src\\main\\resources\\duke.png"));

//    ImageIcon duke = new ImageIcon("C:\\Users\\Myroslava_Zubach\\IdeaProjects\\ZMI\\src\\main\\resources\\duke.png");

    ImageIcon duke = new ImageIcon("duke.png");

    JLabel lbl1 = new JLabel(duke);
    JLabel lbl2 = new JLabel("Duke, the Java Mascot");
    JLabel lbl3 = new JLabel("Duke", duke, JLabel.CENTER);

    public Labels() {

        super("Window Swing");
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(pnl);
        setVisible(true);

        lbl1.setToolTipText("Duke, the Java Mascot");
        lbl3.setHorizontalTextPosition(JLabel.CENTER);
        lbl3.setVerticalTextPosition(JLabel.BOTTOM);

        pnl.add(lbl1);
        pnl.add(lbl2);
        pnl.add(lbl3);
    }

    public static void main(String[] args) {

        Labels gui = new Labels();
    }
}
