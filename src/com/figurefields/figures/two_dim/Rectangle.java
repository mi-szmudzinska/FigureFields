package com.figurefields.figures.two_dim;

import com.figurefields.figures.Figure;
import com.figurefields.figures.FigureType;

public class Rectangle extends Figure {

    private float a;

    private float b;

    public Rectangle(float a, float b) {
        super(a * b);
        this.a = a;
        this.b = b;
        this.type = FigureType.TwoD;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

}