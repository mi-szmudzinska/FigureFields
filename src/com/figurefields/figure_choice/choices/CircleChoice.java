package com.figurefields.figure_choice.choices;

//import static java.lang.Math.PI;

import java.util.Scanner;

import com.figurefields.figure_choice.FigureChoice;
import com.figurefields.figure_choice.InputValidator;
import com.figurefields.figures.Figure;
import com.figurefields.figures.two_dim.Circle;

public class CircleChoice extends FigureChoice {

    private float dlugoscProm;

    public CircleChoice(InputValidator inputValidator, Scanner scanner) {
        super(inputValidator, scanner);
    }

    @Override
    protected String pobierzNazweFigury() {
        return "KOŁO";
    }

    @Override
    protected void zaladujeParametryWejsciowe() {

        System.out.println("Podaj dlugość promienia:___[cm]");
        dlugoscProm = scanner.nextFloat();
    }

    @Override
    protected boolean czyParametryWejsciowePoprawne() {
        return inputValidator.isValid(dlugoscProm);
    }

    @Override
    protected Figure stworzFigure() {

        return new Circle(dlugoscProm, Math.PI);
    }
}
