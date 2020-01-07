package com.figurefields.figure_choice.choices;

import java.util.Scanner;

import com.figurefields.figure_choice.FigureChoice;
import com.figurefields.figure_choice.InputValidator;
import com.figurefields.figures.Figure;
import com.figurefields.figures.tree_dim.Cube;

public class CubeChoice extends FigureChoice {

    private float dlugoscBoku;

    public CubeChoice(InputValidator inputValidator, Scanner scanner) {
        super(inputValidator, scanner);
    }

    @Override
    protected String pobierzNazweFigury() {
        return "SZEŚCIAN";
    }

    @Override
    protected void zaladujeParametryWejsciowe() {
        System.out.println("Podaj dlugość podstawy:___[cm]");
        dlugoscBoku = scanner.nextFloat();
    }

    @Override
    protected boolean czyParametryWejsciowePoprawne() {
        return inputValidator.isValid(dlugoscBoku);
    }

    @Override
    protected Figure stworzFigure() {
        return new Cube(dlugoscBoku);
    }
}
