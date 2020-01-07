package com.figurefields.figures.two_dim;

import com.figurefields.figures.Figure;
import com.figurefields.figures.FigureType;

public class Trapeze extends Figure {

    private float a;

    private float b;

    private float h;

    public Trapeze(float a, float b, float h) {
        super(0.5 * (a + b) * h);
        this.a = a;
        this.b = b;
        this.h = h;
        this.type = FigureType.TwoD;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getH() {
        return h;
    }

}