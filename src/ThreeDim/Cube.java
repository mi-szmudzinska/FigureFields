package ThreeDim;

import Enums.FigureType;
import Figure.Figures;

public class Cube extends Figures {

    private double a;

    public Cube(double a) {
        super(6*a*a);
        this.a=a;
        this.type= FigureType.ThreeD;
    }

    public double getA() {

        return a;
    }

}
