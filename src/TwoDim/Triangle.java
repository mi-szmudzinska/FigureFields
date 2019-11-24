package TwoDim;

import Enums.FigureType;
import Figure.Figures;

public class Triangle extends Figures {

    private double a;
    private double h;

    public Triangle(double a, double h) {
        super(0.5*a*h);
        this.a=a;
        this.h=h;
        this.type= FigureType.TwoD;
    }

    public double getA() {

        return a;
    }

    public double getH() {

        return h;
    }

}