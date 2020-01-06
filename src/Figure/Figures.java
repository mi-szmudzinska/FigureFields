package Figure;

import Enums.FigureType;

public class Figures {
    private double area;
    protected FigureType type;

    public Figures(double area) {

        this.area = area;
    }

    public double getArea() {

        return this.area;
    }
}