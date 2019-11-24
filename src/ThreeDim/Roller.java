package ThreeDim;

import Enums.FigureType;
import Figure.Figures;

public class Roller extends Figures {

    private double H,r;
    private final double PIi=3.1415;

    public Roller(double H, double r, double PIi) {
        super(2*r*r*PIi+H*2*PIi*r);
        this.r=r;
        this.H=H;
        this.type= FigureType.ThreeD;
    }

    public double getH() {

        return H;
    }

    public double getR() {

        return r;
    }

}
