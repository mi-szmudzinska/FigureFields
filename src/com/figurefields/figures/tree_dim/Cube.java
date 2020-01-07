package com.figurefields.figures.tree_dim;

import com.figurefields.figures.Figure;
import com.figurefields.figures.FigureType;

public class Cube extends Figure {

    private float a;

    public Cube(float a) {
        super(6 * a * a);
        this.a = a;
        this.type = FigureType.ThreeD;
    }

    public float getA() {
        return a;
    }

}
