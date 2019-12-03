package TwoDim;

import Enums.FigureType;
import Figure.Figures;

public class Rectangle extends Figures {

    private float a;
    private float b;

    public Rectangle(float a, float b) {
        super(a*b);
        this.a=a;
        this.b=b;
        this.type= FigureType.TwoD;
    }

    public float getA() {

        return a;
    }

    public float getB() {

        return b;
    }

}