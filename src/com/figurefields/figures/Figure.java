package com.figurefields.figures;

public class Figure {

    private double area;

    protected FigureType type;

    public Figure(double area) {

        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public String getFigureUnit() {
        if (type.equals(FigureType.TwoD)) {
            return "cm";
        }
        return "cm2";
    }

}
