package TwoDim;

import Enums.FigureType;
import Figure.Figures;

public class Triangle extends Figures {
    private float a;
    private float h;

    public Triangle(float a, float h) {
        super(0.5F * (double)a * (double)h);
        this.a = a;
        this.h = h;
        this.type = FigureType.TwoD;
    }

    public float getA() {
        return this.a;
    }

    public float getH() {
        return this.h;
    }
}