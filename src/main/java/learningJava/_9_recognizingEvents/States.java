package learningJava._9_recognizingEvents;

import javax.swing.*;
import java.awt.event.*;

/**
 * Created by azmiks on 19/02/2017.
 */
class States extends JFrame implements ItemListener {
    JPanel pnl = new JPanel();

    String[] styles = {"Small", "Middle", "Large"};
    JComboBox<String> box = new JComboBox<String>(styles);
    JRadioButton rad1 = new JRadioButton("White");
    JRadioButton rad2 = new JRadioButton("Red");
    ButtonGroup wines = new ButtonGroup();
    JCheckBox chk = new JCheckBox("Margarita");
    JTextArea txtArea = new JTextArea(5, 38);

    public States() {

        super("Window Swing");
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(pnl);
        setVisible(true);

        wines.add(rad1);
        wines.add(rad2);
        pnl.add(rad1);
        pnl.add(rad2);
        pnl.add(chk);
        pnl.add(box);
        pnl.add(txtArea);

        rad1.addItemListener(this);
        rad2.addItemListener(this);
        chk.addItemListener(this);
        box.addItemListener(this);
    }

    public void itemStateChanged (ItemEvent event) {
        if (event.getItemSelectable() == rad1) {
            txtArea.setText("White wine is selected");
        }

        if (event.getItemSelectable() == rad2) {
            txtArea.setText("Red wine is selected");
        }

        if ((event.getItemSelectable() == chk) && (event.getStateChange() == ItemEvent.SELECTED)) {
            txtArea.append("\nMargarita is selected\n");
        }

        if ((event.getItemSelectable() == box) && (event.getStateChange() == ItemEvent.SELECTED)) {
            txtArea.append(event.getItem().toString() + " is selected");
        }
    }

    public static void main(String[] args) {

        States gui = new States();
    }
}
