package TwoDim;

import Enums.FigureType;
import Figure.Figures;

public class Square extends Figures {
    private float a;

    public Square(float a) {
        super((double)(a * a));
        this.a = a;
        this.type = FigureType.TwoD;
    }

    public float getA() {
        return this.a;
    }
}