package TwoDim;

import Enums.FigureType;
import Figure.Figures;

import static java.lang.StrictMath.sqrt;

public class Hexagon extends Figures {

    private float a;

    public Hexagon(float a) {
        super(0.25*a*a*sqrt(3)*6);
        this.a=a;
        this.type= FigureType.TwoD;
    }

    public float getA() {

        return a;
    }

}
