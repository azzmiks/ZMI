package learningJava.recognizingEvents;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by azmiks on 19/02/2017.
 */
class Sound extends JFrame implements ActionListener {

    JPanel pnl = new JPanel();

    ClassLoader ldr = this.getClass().getClassLoader();
    java.applet.AudioClip audio = JApplet.newAudioClip(ldr.getResource("FifthElement.wav"));
    JButton playBtn = new JButton("Play");
    JButton stopBtn = new JButton("Stop");

    public Sound() {

        super("Window Swing");
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(pnl);
        setVisible(true);

        pnl.add(playBtn);
        pnl.add(stopBtn);
        playBtn.addActionListener(this);
        stopBtn.addActionListener(this);
    }

    public void actionPerformed (ActionEvent event) {

        if (event.getSource() == playBtn) {
            audio.play();
        }

        if (event.getSource() == stopBtn) {
            audio.stop();
        }
    }

    public static void main(String[] args) {

        Sound gui = new Sound();
    }
}
