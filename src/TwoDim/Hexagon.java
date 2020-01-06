package TwoDim;

import Enums.FigureType;
import Figure.Figures;

public class Hexagon extends Figures {
    private float a;

    public Hexagon(float a) {
        super(0.25D * (double)a * (double)a * StrictMath.sqrt(3.0D) * 6.0D);
        this.a = a;
        this.type = FigureType.TwoD;
    }

    public float getA() {
        return this.a;
    }
}