package Main;
import Main.Main;
import TwoDim.Square;
import java.util.Scanner;

public class Switchh {

    public Switchh(){
        Scanner wybor = new Scanner(System.in);
        int xx = wybor.nextInt();

        switch(xx){
            case 1:
                System.out.println("***************************************");
                System.out.println("Wybrana figura KWADRAT");
                System.out.println("***************************************");
                System.out.println("Podaj długość boku:    [cm]");
                Scanner dlugosc = new Scanner(System.in);
                Double a = dlugosc.nextDouble();
                System.out.println("***************************************");
                Square s1 = new Square((double) a);
                System.out.println("Pole kwadratu wynosi: "+s1.getArea());

            case 2:
            case 3:
//            case 4:
//            case 5:
//            case 6:
//            case 7:
//            case 8:
//            case 9:
            default:


        }
    }
    private int number;


}