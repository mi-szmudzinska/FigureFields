package TwoDim;

import Enums.FigureType;
import Figure.Figures;

public class Square extends Figures {

    private double a;

    public Square(double a) {
        super(a*a);
        this.a=a;
        this.type= FigureType.TwoD;
    }

    public double getA() {

        return a;
    }
    private boolean checkifSquare(double a) {
        try {
            if (a<0 && a>1000)
                throw new ArithmeticException("This is not a square");
            else
                return true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
}