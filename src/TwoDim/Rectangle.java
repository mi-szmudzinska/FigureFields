package TwoDim;

import Enums.FigureType;
import Figure.Figures;

public class Rectangle extends Figures {

    private double a;
    private double b;

    public Rectangle(double a, double b) {
        super(a*b);
        this.a=a;
        this.b=b;
        this.type= FigureType.TwoD;
    }

    public double getA() {

        return a;
    }

    public double getB() {

        return b;
    }

}