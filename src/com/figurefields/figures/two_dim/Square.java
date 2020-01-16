package com.figurefields.figures.two_dim;

import com.figurefields.figures.Figure;
import com.figurefields.figures.FigureType;

public class Square extends Figure {

    private float a;

    public Square(float a) {
        super(a * a);
        this.a = a;
        this.type = FigureType.TwoD;
    }

    public float getA() {

        return a;
    }

}