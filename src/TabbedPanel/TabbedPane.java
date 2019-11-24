package TabbedPanel;

import javax.swing.*;

public class TabbedPane {
        JFrame f;

        public TabbedPane() {
            JPanel panel1 = new JPanel();
            JPanel panel2 = new JPanel();
            JPanel panel3 = new JPanel();
            JTabbedPane tp = new JTabbedPane();
            tp.setBounds(0, 0,400,400);
            tp.add("Kwadrat", panel1);
            tp.add("Prostokąt", panel2);
            tp.add("Koło", panel3);
            f.add(tp);
        }
}
