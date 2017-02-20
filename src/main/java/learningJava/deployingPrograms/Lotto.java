package learningJava.deployingPrograms;

import javax.swing.*;
import java.awt.event.*;
/**
 * Created by azmiks on 20/02/2017.
 */
public class Lotto extends JFrame implements ActionListener {

    //Components
    ClassLoader ldr = this.getClass().getClassLoader();
    java.net.URL iconURL = ldr.getResource("duke.png");
    ImageIcon icon = new ImageIcon(iconURL);
    JLabel img = new JLabel(icon);
    JTextField txt = new JTextField("", 18);
    JButton btn = new JButton("Show lucky numbers");
    JPanel pnl = new JPanel();

    //Constructor
    public Lotto() {

        super("Lotto application");
        setSize(260, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pnl.add(img);
        pnl.add(txt);
        pnl.add(btn);
        btn.addActionListener(this);
        add(pnl);
        setVisible(true);

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

    //Main method
    public static void main(String[] args) {
        Lotto lotto = new Lotto();
    }
}

/*
jar cf jar-file input_files - создание JAR-архива
jar cfe jar-file entry_point input files - создание JAR-архива с указанием точки входа в приложение
jar tf jar-file - просмотр содержимого JAR-архива
jar uf jar-file - обновление содержимого JAR-архива
jar ufm jar-file attributes_file - обновление содержимого манифеста JAR-архива с добавлением в него атрибутов
jar xf jar-file - извлечение содержимого JAR-архива
jar xf jar-file archive_file - извлечение определенного файла из содержимого JAR-архива

Ахивирование:
jar cfe Lotto.jar Lotto Lotto.class duke.png

Запуск:
java -jar Lotto.jar

Подписывание:
jarsigner -keystore certificate.pfx -storetype pkcs12 Lotto.jar "Mike McGrath"
 */
