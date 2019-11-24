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
}