package Main;
import ThreeDim.Cube;
import ThreeDim.Roller;
import TwoDim.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.io.PrintStream;
import java.util.Scanner;

import static java.lang.System.exit;

public class Switchh {

    public Switchh(){
        Scanner wybor = new Scanner(System.in);
        int xx = wybor.nextInt();

        final double PIi=3.1415;
            switch (xx) {
                case 1:
                    System.out.println("***************************************");
                    System.out.println("Wybrana figura: KWADRAT");
                    System.out.println("***************************************");
                    System.out.println("Podaj długość boku:    [cm]");
                    Scanner dlugosc = new Scanner(System.in);
                    Double a = dlugosc.nextDouble();
                    System.out.println("***************************************");
                    Square s1 = new Square(a);
                    System.out.printf("Pole kwadratu wynosi: %.2f[cm2]%n", s1.getArea());
                    break;

                case 2:
                    System.out.println("***************************************");
                    System.out.println("Wybrana figura: PROSTOKĄT");
                    System.out.println("***************************************");
                    System.out.println("Podaj wysokość:    [cm]");
                    Scanner wysokosc = new Scanner(System.in);
                    Double w = wysokosc.nextDouble();
                    System.out.println("Podaj szerokość:    [cm]");
                    Scanner szerokosc = new Scanner(System.in);
                    Double sz = szerokosc.nextDouble();
                    System.out.println("***************************************");
                    Rectangle p1 = new Rectangle(w, sz);
                    System.out.println("Pole prosotkąta wynosi: " + p1.getArea() + "[cm2]");

                case 3:
                    System.out.println("***************************************");
                    System.out.println("Wybrana figura: TROJKAT");
                    System.out.println("***************************************");
                    System.out.println("Podaj dlugość podstawy:    [cm]");
                    Scanner dlugoscpodst = new Scanner(System.in);
                    Double dlpod = dlugoscpodst.nextDouble();
                    System.out.println("Podaj wysokość trójkata:    [cm]");
                    Scanner wysokosctroj = new Scanner(System.in);
                    Double wytr = wysokosctroj.nextDouble();
                    System.out.println("***************************************");
                    Triangle t1 = new Triangle(dlpod, wytr);
                    System.out.println("Pole trójkąta wynosi: " + t1.getArea() + "[cm2]");
                case 4:
                    System.out.println("***************************************");
                    System.out.println("Wybrana figura: KOŁO");
                    System.out.println("***************************************");
                    System.out.println("Podaj dlugość promienia:    [cm]");
                    Scanner dlugoscprom = new Scanner(System.in);
                    Double dlprom = dlugoscprom.nextDouble();
                    System.out.println("***************************************");
                    Circle c1 = new Circle(dlprom, PIi);
                    System.out.println("Pole koła wynosi: " + c1.getArea() + "[cm2]");
                case 5:
                    System.out.println("***************************************");
                    System.out.println("Wybrana figura: TRAPEZ");
                    System.out.println("***************************************");
                    System.out.println("Podaj dlugości podstaw:    [cm]");
                    Scanner dlpo1 = new Scanner(System.in);
                    Double dp1 = dlpo1.nextDouble();
                    Scanner dlpo2 = new Scanner(System.in);
                    Double dp2 = dlpo2.nextDouble();
                    System.out.println("Podaj wysokość trapezu:    [cm]");
                    Scanner wystrap = new Scanner(System.in);
                    Double wtrap = wystrap.nextDouble();
                    System.out.println("***************************************");
                    Trapeze tr1 = new Trapeze(dp1, dp2, wtrap);
                    System.out.println("Pole trapezu wynosi: " + tr1.getArea() + "[cm2]");
                case 6:
                    System.out.println("***************************************");
                    System.out.println("Wybrana figura: SZEŚCIOKĄT");
                    System.out.println("***************************************");
                    System.out.println("Podaj dlugość 1 z boków:    [cm]");
                    Scanner dszesc = new Scanner(System.in);
                    Double dsz = dszesc.nextDouble();
                    System.out.println("***************************************");
                    Hexagon sze = new Hexagon(dsz);
                    System.out.println("Pole sześciokąta wynosi: %.2f%n" + sze.getArea() + "[cm2]");
                case 7:
                    System.out.println("***************************************");
                    System.out.println("Wybrana figura: SZEŚCIAN");
                    System.out.println("***************************************");
                    System.out.println("Podaj dlugość podstawy:    [cm]");
                    Scanner dlszescian = new Scanner(System.in);
                    Double dszes = dlszescian.nextDouble();
                    System.out.println("***************************************");
                    Cube sz1 = new Cube(dszes);
                    System.out.println("Pole sześcianu wynosi: " + sz1.getArea() + "[cm2]");
                case 8:
                    System.out.println("***************************************");
                    System.out.println("Wybrana figura: WALEC");
                    System.out.println("***************************************");
                    System.out.println("Podaj wysokość walca:    [cm]");
                    Scanner dwalca = new Scanner(System.in);
                    Double dwal = dwalca.nextDouble();
                    System.out.println("Podaj promień podstawy:    [cm]");
                    Scanner promwalca = new Scanner(System.in);
                    Double prwal = promwalca.nextDouble();
                    System.out.println("***************************************");
                    Roller ro1 = new Roller(dwal, prwal, PIi);
                    System.out.format("Pole walca wynosi: %.2f" + ro1.getArea() + "[cm2]");
                case 9:
                    exit(-1);

//            default: throw new ExceptionInInitializerError();
            }
    }

}