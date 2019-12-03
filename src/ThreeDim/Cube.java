package ThreeDim;

import Enums.FigureType;
import Figure.Figures;

public class Cube extends Figures {

    private float a;

    public Cube(float a) {
        super(6*a*a);
        this.a=a;
        this.type= FigureType.ThreeD;
    }

    public float getA() {

        return a;
    }

}
