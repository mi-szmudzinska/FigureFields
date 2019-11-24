import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import java.awt.*;

public class App {

    private JTabbedPane tabbedPane1;
    private javax.swing.JPanel panel;
    private JTextArea textArea1;


    public static void main(String[] args) {
        JFrame f = new JFrame();//creating instance of JFrame

        //System.out.println("Circle: ");

        JButton b = new JButton("Policz");//creating instance of JButton
        b.setBounds(200, 150, 100, 40);//x axis, y axis, width, height

        f.add(b);                   //adding button in JFrame

        String[] tab = new String[]{"Kwadrat","Prostokąt","Trójkąt","Koło","Trapez","Sześciokąt","Sześcian","Walec"};
//        for (JPanel:
//             ) {
//
//        }
            for(int i=0;i<8;i++){
                JLabel tx = new JLabel("Program obliczający pole figury: "+tab[0]); //zmienic
                i++;
                tx.setFont(new Font("Calabri", Font.CENTER_BASELINE, 15));
                tx.setBounds(100,50,530,20);
                f.add(tx);
            }


        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
//        JPanel panel3 = new JPanel();
//        JPanel panel4 = new JPanel();
//        JPanel panel5 = new JPanel();
//        JPanel panel6 = new JPanel();
//        JPanel panel7 = new JPanel();
//        JPanel panel8 = new JPanel();
        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(0, 0,530,300);

        tp.add("Kwadrat", panel1);
        tp.add("Prostokąt", panel2);
//        tp.add("Trójkąt", panel3);
//        tp.add("Koło", panel4);
//        tp.add("Trapez", panel5);
//        tp.add("Sześciokąt", panel6);
//        tp.add("Sześcian", panel7);
//        tp.add("Walec", panel8);
        f.add(tp);



        f.setSize(535, 300);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible
        f.setResizable(false);
    }


}
