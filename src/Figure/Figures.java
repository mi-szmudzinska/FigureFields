package Figure;

import Enums.FigureType;


public class Figures {

    public Figures(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    private double area;
    protected FigureType type;
}