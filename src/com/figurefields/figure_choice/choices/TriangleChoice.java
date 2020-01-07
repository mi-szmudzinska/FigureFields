package com.figurefields.figure_choice.choices;

import com.figurefields.figure_choice.FigureChoice;
import com.figurefields.figure_choice.InputValidator;
import com.figurefields.figures.Figure;
import com.figurefields.figures.two_dim.Triangle;

import java.util.Scanner;

public class TriangleChoice extends FigureChoice {

    private float dlugoscPodstawy;
    private float wysokoscTrojkata;

    public TriangleChoice(InputValidator inputValidator, Scanner scanner) {
        super(inputValidator, scanner);
    }

    @Override
    protected String pobierzNazweFigury() {
        return "TROJK�T";
    }

    @Override
    protected void zaladujeParametryWejsciowe() {
        System.out.println("Podaj dlugo�� podstawy:___[cm]");
        dlugoscPodstawy = scanner.nextFloat();
        System.out.println("Podaj wysoko�� tr�jkata:___[cm]");
        wysokoscTrojkata = scanner.nextFloat();
    }

    @Override
    protected boolean czyParametryWejsciowePoprawne() {
        return inputValidator.isValid(dlugoscPodstawy) && inputValidator.isValid(wysokoscTrojkata);
    }

    @Override
    protected Figure stworzFigure() {
        return new Triangle(dlugoscPodstawy, wysokoscTrojkata);
    }
}
