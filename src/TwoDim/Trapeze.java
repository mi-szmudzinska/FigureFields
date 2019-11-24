package TwoDim;

import Enums.FigureType;
import Figure.Figures;

public class Trapeze extends Figures {

    private double a;
    private double b;
    private double h;

    public Trapeze(double a, double b, double h) {
        super(0.5*(a+b)*h);
        this.a=a;
        this.b=b;
        this.h=h;
        this.type= FigureType.TwoD;
    }

    public double getA() {

        return a;
    }
    
    public double getB() {

        return b;
    }

    public double getH() {

        return h;
    }

}