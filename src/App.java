import javax.swing.*;
import java.awt.*;

public class App {

    private JTabbedPane tabbedPane1;
    private JPanel panel1;


    public static void main(String[] args) {
        JFrame f = new JFrame();//creating instance of JFrame

        JButton b = new JButton("Policz");//creating instance of JButton
        b.setBounds(150, 300, 100, 40);//x axis, y axis, width, height

        f.add(b);//adding button in JFrame

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JTabbedPane tp = new JTabbedPane();
        tp.setBounds(0, 0,400,400);
        tp.add("Kwadrat", panel1);
        tp.add("Prostokąt", panel2);
        tp.add("Koło", panel3);
        f.add(tp);



        f.setSize(400, 400);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible
        f.setResizable(false);
    }
}
