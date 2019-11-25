//import Main.Main;
//
//import javax.swing.*;
//import java.awt.*;
//
//
//public class App extends Main {
//
//    private JTabbedPane tabbedPane1;
//    private javax.swing.JPanel panel;
//    private JTextArea TextAreaKwadrat;
//    private JTextArea textArea2;
//    private JTextArea textArea3;
//    private JTextArea textArea4;
//    private JTextField textField1;
//
//
//    public static void main(String[] args) {
//        JFrame f = new JFrame();
//
//        //System.out.println("Circle: ");
//
//        JButton b = new JButton("Policz");//creating instance of JButton
//        b.setBounds(200, 150, 100, 40);//x axis, y axis, width, height
//
//        f.add(b);                   //adding button in JFrame
//
//
//        String[] tab = new String[]{"Kwadrat","Prostokąt","Trójkąt","Koło","Trapez","Sześciokąt","Sześcian","Walec"};
//            for (int i = 0; i < 8; i++) {
//                JLabel tx = new JLabel("Program obliczający pole figury: " + tab[0]); //zmienic
//                i++;
//                tx.setFont(new Font("Calabri", Font.CENTER_BASELINE, 15));
//                tx.setBounds(100, 50, 530, 20);
//                f.add(tx);
//            }
//
//
//
//        JTabbedPane tp = new JTabbedPane();
//        tp.setBounds(0, 0,530,300);
//
//
//        JPanel panel1 = new JPanel();
//        tp.add("Kwadrat", panel1);
//        JTextField tx1 = new JTextField();
//        tx1.setBounds(295, 100, 55, 20);
//        f.add(tx1);
//        JLabel tx0 = new JLabel("Podaj długość podstawy:                cm");
//        tx0.setFont(new Font("Calabri", Font.CENTER_BASELINE, 15));
//        tx0.setBounds(100, 100, 530, 20);
//        f.add(tx0);
//
//        JPanel panel2 = new JPanel();
//        tp.add("Prostokąt", panel2);
//        JTextField tx2 = new JTextField();
//        tx1.setBounds(295, 100, 55, 20);
//        f.add(tx2);
//        JLabel tx3 = new JLabel("Podaj długość podstawy:                cm");
//        tx3.setFont(new Font("Calabri", Font.CENTER_BASELINE, 15));
//        tx3.setBounds(100, 100, 530, 20);
//        f.add(tx3);
//
//        JPanel panel3 = new JPanel();
//        tp.add("Trójkąt", panel3);
//        JTextField tx4 = new JTextField();
//        tx1.setBounds(295, 100, 55, 20);
//        f.add(tx4);
//        JLabel tx5 = new JLabel("Podaj długość podstawy:                cm");
//        tx5.setFont(new Font("Calabri", Font.CENTER_BASELINE, 15));
//        tx5.setBounds(100, 100, 530, 20);
//        f.add(tx5);
//        JLabel tx6 = new JLabel("Podaj wysokość:                cm");
//        tx6.setFont(new Font("Calabri", Font.CENTER_BASELINE, 15));
//        tx6.setBounds(100, 100, 530, 20);
//        f.add(tx6);
//
//
//        JPanel panel4 = new JPanel();
//        tp.add("Koło", panel4);
//
//
//        JPanel panel5 = new JPanel();
//        tp.add("Trapez", panel5);
//
//
//        JPanel panel6 = new JPanel();
//        JPanel panel7 = new JPanel();
//        JPanel panel8 = new JPanel();
//
//
//
//
//        tp.add("Sześciokąt", panel6);
//        tp.add("Sześcian", panel7);
//        tp.add("Walec", panel8);
//        f.add(tp);
//
//
//
//        f.setSize(535, 300);//400 width and 500 height
//        f.setLayout(null);//using no layout managers
//        f.setVisible(true);//making the frame visible
//        f.setResizable(false);
//    }
//
//
//}
