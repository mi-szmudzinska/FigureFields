package TwoDim;

import Enums.FigureType;
import Figure.Figures;

public class Circle extends Figures {
    private float r;

    public Circle(float r, double PI) {
        super((double)(r * r) * PI);
        this.r = r;
        this.type = FigureType.TwoD;
    }

    public float getR() {
        return this.r;
    }
}