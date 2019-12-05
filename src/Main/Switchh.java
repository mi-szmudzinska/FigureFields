package Main;
import ThreeDim.Cube;
import ThreeDim.Roller;
import TwoDim.*;
import Figure.Figures;

import java.util.Scanner;

import static java.lang.Math.PI;
import static java.lang.System.exit;

public class Switchh {

   // private float area;

    public Switchh(){
        Scanner wybor = new Scanner(System.in);
        int xx = wybor.nextInt();

            switch (xx) {
                case 1:
                    System.out.println("****************************************");
                    System.out.println("Wybrana figura: KWADRAT");
                    System.out.println("****************************************");
                    System.out.println("Podaj długość boku:___[cm]");
                    Scanner dlugosc = new Scanner(System.in);
                    Float a = dlugosc.nextFloat();
 //                   new Check(a);
                    if (a < 0) {
                        System.out.println("Błędnie wprowadzone dane!");
                    }
                    else {
                        Square s1 = new Square(a);
                        System.out.printf("Pole kwadratu wynosi: %.2f[cm2]%n", s1.getArea());
                    }
                    break;

                case 2:
                    System.out.println("****************************************");
                    System.out.println("Wybrana figura: PROSTOKĄT");
                    System.out.println("****************************************");
                    System.out.println("Podaj wysokość:___[cm]");
                    Scanner wysokosc = new Scanner(System.in);
                    Float w = wysokosc.nextFloat();
                    System.out.println("Podaj szerokość:___[cm]");
                    Scanner szerokosc = new Scanner(System.in);
                    Float sz = szerokosc.nextFloat();
                    System.out.println("****************************************");
                    Rectangle p1 = new Rectangle(w, sz);
                    System.out.printf("Pole prosotkąta wynosi: %.2f[cm2]%n",p1.getArea());
                    break;

                case 3:
                    System.out.println("****************************************");
                    System.out.println("Wybrana figura: TROJKAT");
                    System.out.println("****************************************");
                    System.out.println("Podaj dlugość podstawy:___[cm]");
                    Scanner dlugoscpodst = new Scanner(System.in);
                    Float dlpod = dlugoscpodst.nextFloat();
                    System.out.println("Podaj wysokość trójkata:___[cm]");
                    Scanner wysokosctroj = new Scanner(System.in);
                    Float wytr = wysokosctroj.nextFloat();
                    System.out.println("****************************************");
                    Triangle t1 = new Triangle(dlpod, wytr);
                    System.out.printf("Pole trójkąta wynosi: %.2f[cm2]%n",t1.getArea());
                    break;

                case 4:
                    System.out.println("****************************************");
                    System.out.println("Wybrana figura: KOŁO");
                    System.out.println("****************************************");
                    System.out.println("Podaj dlugość promienia:___[cm]");
                    Scanner dlugoscprom = new Scanner(System.in);
                    Float dlprom = dlugoscprom.nextFloat();
                    System.out.println("****************************************");
                    Circle c1 = new Circle(dlprom, PI);
                    System.out.printf("Pole koła wynosi: %.2f[cm2]%n",c1.getArea());
                    break;

                case 5:
                    System.out.println("****************************************");
                    System.out.println("Wybrana figura: TRAPEZ");
                    System.out.println("****************************************");
                    System.out.println("Podaj dlugości podstaw:___[cm]");
                    Scanner dlpo1 = new Scanner(System.in);
                    Float dp1 = dlpo1.nextFloat();
                    Scanner dlpo2 = new Scanner(System.in);
                    Float dp2 = dlpo2.nextFloat();
                    System.out.println("Podaj wysokość trapezu:___[cm]");
                    Scanner wystrap = new Scanner(System.in);
                    Float wtrap = wystrap.nextFloat();
                    System.out.println("****************************************");
                    Trapeze tr1 = new Trapeze(dp1, dp2, wtrap);
                    System.out.printf("Pole trapezu wynosi: %.2f[cm2]%n",tr1.getArea());
                    break;

                case 6:
                    System.out.println("****************************************");
                    System.out.println("Wybrana figura: SZEŚCIOKĄT");
                    System.out.println("****************************************");
                    System.out.println("Podaj dlugość 1 z boków:___[cm]");
                    Scanner dszesc = new Scanner(System.in);
                    Float dsz = dszesc.nextFloat();
                    System.out.println("****************************************");
                    Hexagon sze = new Hexagon(dsz);
                    System.out.printf("Pole sześciokąta wynosi: %.2f[cm2]%n",sze.getArea());
                    break;

                case 7:
                    System.out.println("****************************************");
                    System.out.println("Wybrana figura: SZEŚCIAN");
                    System.out.println("****************************************");
                    System.out.println("Podaj dlugość podstawy:___[cm]");
                    Scanner dlszescian = new Scanner(System.in);
                    Float dszes = dlszescian.nextFloat();
                    System.out.println("****************************************");
                    Cube sz1 = new Cube(dszes);
                    System.out.printf("Pole sześcianu wynosi: %.2f[cm2]%n",sz1.getArea());
                    break;

                case 8:
                    System.out.println("****************************************");
                    System.out.println("Wybrana figura: WALEC");
                    System.out.println("****************************************");
                    System.out.println("Podaj wysokość walca:___[cm]");
                    Scanner dwalca = new Scanner(System.in);
                    Float dwal = dwalca.nextFloat();
                    System.out.println("Podaj promień podstawy:___[cm]");
                    Scanner promwalca = new Scanner(System.in);
                    Float prwal = promwalca.nextFloat();
                    System.out.println("****************************************");
                    Roller ro1 = new Roller(dwal, prwal, PI);
                    System.out.printf("Pole walca wynosi: %.2f[cm2]%n",ro1.getArea());
                    break;

                case 9:
                    exit(-1);

            default:
                System.out.println("****************************************");
                System.out.println("Błędnie wybrana figura lub opcja");
                System.out.println("****************************************");
            }
        }

}

