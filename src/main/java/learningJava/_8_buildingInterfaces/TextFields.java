package learningJava._8_buildingInterfaces;

import javax.swing.*;

/**
 * Created by Myroslava_Zubach on 17.02.2017.
 */
class TextFields extends JFrame {

    JPanel pnl = new JPanel();

    JTextField txt1 = new JTextField(38);
    JTextField txt2 = new JTextField("Default text", 38);
    JTextArea txtArea = new JTextArea(5, 37);
    JScrollPane pane = new JScrollPane(txtArea);


    public TextFields() {

        super("Window Swing");
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(pnl);
        setVisible(true);

        txtArea.setLineWrap(true);
        txtArea.setWrapStyleWord(true);
        pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        pnl.add(txt1);
        pnl.add(txt2);
        pnl.add(pane);
    }

    public static void main(String[] args) {

        TextFields gui = new TextFields();
    }
}
