package learningJava._9_recognizingEvents;

import javax.swing.*;
import java.awt.event.*;

/**
 * Created by azmiks on 19/02/2017.
 */
class Actions extends JFrame implements ActionListener {

    JPanel pnl = new JPanel();

    JButton btn1 = new JButton("Button 1");
    JButton btn2 = new JButton( "Button 2");
    JTextArea txtArea = new JTextArea(5, 28);


    public Actions() {

        super("Window Swing");
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(pnl);
        setVisible(true);

        pnl.add(btn1);
        pnl.add(btn2);
        pnl.add(txtArea);

        btn2.setEnabled(false);
        txtArea.setText("Button 2 is disabled");

        btn1.addActionListener(this);
        btn2.addActionListener(this);
    }

    public void actionPerformed (ActionEvent event) {

        txtArea.setText(event.getActionCommand() + " was clicked and disabled");

        if (event.getSource() == btn1) {
            btn2.setEnabled(true);
            btn1.setEnabled(false);
        }

        if (event.getSource() == btn2) {
            btn1.setEnabled(true);
            btn2.setEnabled(false);
        }
    }

    public static void main(String[] args) {

        Actions gui = new Actions();
    }
}

/*
ActionListener - распознает события действия, которые происходят при нажатии или освобождении кнопки;
ItemListener - распознает события элемента, которые происходят при выборе элемента или отмене выбора;
KeyListener - распознает события клавиатуры, которые происходят, когда пользователь нажимает или отпускает клавишу;
MouseListener - распознает события кнопок мыши, которые происходят, когда пользователь нажимает или отпускает кнопку мыши
либо когда указатель мыши входит в область компонента или покидает ее;
MouseMotionListener - распознает события движения указателя мыши, которые происходят, когда пользователь двигает мышью
 */