package TwoDim;

import Enums.FigureType;
import Figure.Figures;
import Main.Check;


public class Square extends Figures {

    private float a;

    public Square(float a) {
        super(a*a);
        this.a=a;
        //new Check(a);
        this.type= FigureType.TwoD;

    }

    public float getA() {

        return a;
    }



}