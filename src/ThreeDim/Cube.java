package ThreeDim;

import Enums.FigureType;
import Figure.Figures;

public class Cube extends Figures {
    private float a;

    public Cube(float a) {
        super((6.0F * a * a));
        this.a = a;
        this.type = FigureType.ThreeD;
    }

    public float getA() {
        return this.a;
    }
}