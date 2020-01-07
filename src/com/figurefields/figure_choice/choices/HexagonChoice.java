package com.figurefields.figure_choice.choices;

import java.util.Scanner;

import com.figurefields.figure_choice.FigureChoice;
import com.figurefields.figure_choice.InputValidator;
import com.figurefields.figures.Figure;
import com.figurefields.figures.two_dim.Hexagon;

public class HexagonChoice extends FigureChoice {

    private float dlugoscBoku;

    public HexagonChoice(InputValidator inputValidator, Scanner scanner) {
        super(inputValidator, scanner);
    }

    @Override
    protected String pobierzNazweFigury() {
        return "SZEŚCIOKĄT";
    }

    @Override
    protected void zaladujeParametryWejsciowe() {
        System.out.println("Podaj dlugość 1 z boków:___[cm]");
        dlugoscBoku = scanner.nextFloat();
    }

    @Override
    protected boolean czyParametryWejsciowePoprawne() {
        return inputValidator.isValid(dlugoscBoku);
    }

    @Override
    protected Figure stworzFigure() {
        return new Hexagon(dlugoscBoku);
    }
}
