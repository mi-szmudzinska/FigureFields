package com.figurefields.figures.two_dim;
import com.figurefields.figures.Figure;
import com.figurefields.figures.FigureType;

public class Circle extends Figure {

    private float r;

    public Circle(float r, double PI) {
        super(r * r * PI);
        this.r = r;
        this.type = FigureType.TwoD;
    }

    public float getR() {
        return r;
    }

}