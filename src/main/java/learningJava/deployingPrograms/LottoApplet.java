package learningJava.deployingPrograms;

import javax.swing.*;
import java.awt.event.*;

/**
 * Created by Myroslava_Zubach on 21.02.2017.
 */
public class LottoApplet extends JApplet implements ActionListener {

    //Components
    ClassLoader ldr = this.getClass().getClassLoader();
    java.net.URL iconURL = ldr.getResource("duke.png");
    ImageIcon icon = new ImageIcon(iconURL);
    JLabel img = new JLabel(icon);
    JTextField txt = new JTextField("", 18);
    JButton btn = new JButton("Show lucky numbers");
    JPanel pnl = new JPanel();

    //Applet entry point
    public void init() {

        pnl.add(img);
        pnl.add(txt);
        pnl.add(btn);
        btn.addActionListener(this);
        String bgStr = getParameter("BgColor");
        int bgHex = Integer.parseInt(bgStr, 16);
        pnl.setBackground(new java.awt.Color(bgHex));
        add(pnl);

    }

    //Event handler
    public void actionPerformed (ActionEvent event) {

        if (event.getSource() == btn) {

            int[] nums = new int[50];
            String str = " ";
            for (int i = 1; i < 50; i++) {
                nums[i] = i;
            }

            for (int i = 1; i < 50; i++) {
                int r = (int) (49 * Math.random()) + 1;
                int temp = nums[i];
                nums[i] = nums[r];
                nums[r] = temp;
            }

            for (int i = 1; i < 7; i++) {
                str += " " + Integer.toString(nums[i]) + " ";
            }
            txt.setText(str);
        }
    }

}
