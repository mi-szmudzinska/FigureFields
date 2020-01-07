package com.figurefields.figures.two_dim;

import com.figurefields.figures.Figure;
import com.figurefields.figures.FigureType;

import static java.lang.StrictMath.sqrt;

public class Hexagon extends Figure {

    private float a;

    public Hexagon(float a) {
        super(0.25 * a * a * sqrt(3) * 6);
        this.a = a;
        this.type = FigureType.TwoD;
    }

    public float getA() {
        return a;
    }

}
