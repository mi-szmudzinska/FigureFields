package com.figurefields.figures.two_dim;

import com.figurefields.figures.FigureType;
import com.figurefields.figures.Figure;

public class Triangle extends Figure {

    private float a;

    private float h;

    public Triangle(float a, float h) {
        super(0.5 * a * h);
        this.a = a;
        this.h = h;
        this.type = FigureType.TwoD;
    }

    public float getA() {
        return a;
    }

    public float getH() {
        return h;
    }

}