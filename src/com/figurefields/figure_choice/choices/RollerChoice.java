package com.figurefields.figure_choice.choices;

import static java.lang.Math.PI;

import java.util.Scanner;

import com.figurefields.figure_choice.FigureChoice;
import com.figurefields.figure_choice.InputValidator;
import com.figurefields.figures.Figure;
import com.figurefields.figures.tree_dim.Roller;

public class RollerChoice extends FigureChoice {

    private float wysokoscWalca;

    private float promienWalca;

    public RollerChoice(InputValidator inputValidator, Scanner scanner) {
        super(inputValidator, scanner);
    }

    @Override
    protected String pobierzNazweFigury() {
        return "WALEC";
    }

    @Override
    protected void zaladujeParametryWejsciowe() {
        System.out.println("Podaj wysokość walca:___[cm]");
        wysokoscWalca = scanner.nextFloat();
        System.out.println("Podaj promień podstawy:___[cm]");
        promienWalca = scanner.nextFloat();
    }

    @Override
    protected boolean czyParametryWejsciowePoprawne() {
        return inputValidator.isValid(wysokoscWalca) && inputValidator.isValid(promienWalca);
    }

    @Override
    protected Figure stworzFigure() {
        return new Roller(wysokoscWalca, promienWalca, PI);
    }
}
