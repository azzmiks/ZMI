package learningJava._8_buildingInterfaces;

import javax.swing.*;

/**
 * Created by azmiks on 18/02/2017.
 */
class Radios extends JFrame {
    JPanel pnl = new JPanel();

    JRadioButton rad1 = new JRadioButton("Red", true);
    JRadioButton rad2 = new JRadioButton("Pink");
    JRadioButton rad3 = new JRadioButton("White");

    ButtonGroup wines = new ButtonGroup();

    public Radios() {

        super("Window Swing");
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(pnl);
        setVisible(true);

        wines.add(rad1);
        wines.add(rad2);
        wines.add(rad3);

        pnl.add(rad1);
        pnl.add(rad2);
        pnl.add(rad3);
    }

    public static void main(String[] args) {

        Radios gui = new Radios();
    }
}
