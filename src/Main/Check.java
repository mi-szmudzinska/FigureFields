package Main;
import Main.Switchh;
import TwoDim.Square;

public class Check {

    private Double a;

    public Check(double a) {

            if ((a < 0) || (a > 10000)) {
                System.out.println("Błędnie wprowadzone dane!");
            } else {
                System.out.println("***************************************");

            }
    }

    public Check() {
    }
}