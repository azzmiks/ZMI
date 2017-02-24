package learningJava._8_buildingInterfaces;

import javax.swing.*;
import java.awt.*;
/**
 * Created by azmiks on 18/02/2017.
 */
class Layout extends JFrame {
    JPanel pnl = new JPanel();

    Container contentPane = getContentPane();
    JPanel grid = new JPanel(new GridLayout(2, 2));

    public Layout() {

        super("Window Swing");
        setSize(500, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(pnl);
        setVisible(true);

        pnl.add(new JButton("Yes"));
        pnl.add(new JButton("No"));
        pnl.add(new JButton("Cancel"));
        grid.add(new JButton("1"));
        grid.add(new JButton("2"));
        grid.add(new JButton("3"));
        grid.add(new JButton("4"));

        contentPane.add("North", pnl);
        contentPane.add("Center", grid);
        contentPane.add("West", new JButton("West"));
    }

    public static void main(String[] args) {

        Layout gui = new Layout();
    }

}

/*
BorderLayout - Вверху, внизу, справа, слева и в центре (используется по умолчанию)
BoxLayout - В одну строку или столбец
CardLayout - Поочередно в указанной области
FlowLayout - В строке слева направо с возможностью переноса (используется по умолчанию для JPanel)
GridBagLayout - В сетке ячеек (могут их растягивать)
GridLayout - В таблице по строкам и столбцам
GroupLayout - Горизонтально и вертикально
SpringLayout - С привязкой к границам компонентов
 */