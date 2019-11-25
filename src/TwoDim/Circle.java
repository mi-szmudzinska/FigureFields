package TwoDim;

import Enums.FigureType;
import Figure.Figures;



public class Circle extends Figures {

//    public final double PIi=3.1415;
    private double r;

    public Circle(double r, double PIi) {
        super(r*r*PIi);
        this.r=r;
        this.type= FigureType.TwoD;
    }

    public double getR() {

        return r;
    }

}