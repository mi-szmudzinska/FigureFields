package TwoDim;

import Enums.FigureType;
import Figure.Figures;

import static java.lang.StrictMath.sqrt;

public class Hexagon extends Figures {

    private double a;

    public Hexagon(double a) {
        super(0.5*a*a*sqrt(3)*6);
        this.a=a;
        this.type= FigureType.TwoD;
    }

    public double getA() {

        return a;
    }

}
