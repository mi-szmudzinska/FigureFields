package ThreeDim;

import Enums.FigureType;
import Figure.Figures;

public class Roller extends Figures {

    private float H,r;

    public Roller(float H, float r, double PI) {
        super(2*r*r*PI+H*2*PI*r);
        this.r=r;
        this.H=H;
        this.type= FigureType.ThreeD;
    }

    public float getH() {

        return H;
    }

    public float getR() {

        return r;
    }

}
