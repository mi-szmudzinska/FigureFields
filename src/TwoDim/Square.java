package TwoDim;

import Enums.FigureType;
import Figure.Figures;

public class Square extends Figures {

    public Square(double d) {
        super(d*d);
        this.d=d;
        this.type= FigureType.TwoD;
    }

    public double getD() {

        return d;
    }

    private double d;
}