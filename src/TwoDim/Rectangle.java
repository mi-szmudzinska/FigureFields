package TwoDim;

import Enums.FigureType;
import Figure.Figures;

public class Rectangle extends Figures {
    private float a;
    private float b;

    public Rectangle(float a, float b) {
        super((double)(a * b));
        this.a = a;
        this.b = b;
        this.type = FigureType.TwoD;
    }

    public float getA() {
        return this.a;
    }

    public float getB() {
        return this.b;
    }
}