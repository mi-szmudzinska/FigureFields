package ThreeDim;

import Enums.FigureType;
import Figure.Figures;

public class Roller extends Figures {
    private float H;
    private float r;

    public Roller(float H, float r, double PI) {
        super((double)(2.0F * r * r) * PI + (double)(H * 2.0F) * PI * (double)r);
        this.r = r;
        this.H = H;
        this.type = FigureType.ThreeD;
    }

    public float getH() {
        return this.H;
    }

    public float getR() {
        return this.r;
    }
}