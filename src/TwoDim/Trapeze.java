package TwoDim;

import Enums.FigureType;
import Figure.Figures;

public class Trapeze extends Figures {
    private float a;
    private float b;
    private float h;

    public Trapeze(float a, float b, float h) {
        super(0.5F * (double)(a + b) * (double)h);
        this.a = a;
        this.b = b;
        this.h = h;
        this.type = FigureType.TwoD;
    }

    public float getA() {
        return this.a;
    }

    public float getB() {
        return this.b;
    }

    public float getH() {
        return this.h;
    }
}