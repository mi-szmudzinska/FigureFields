package com.figurefields.figure_choice.choices;

import com.figurefields.figure_choice.FigureChoice;
import com.figurefields.figure_choice.InputValidator;
import com.figurefields.figures.Figure;
import com.figurefields.figures.tree_dim.Roller;

import java.util.Scanner;

import static java.lang.Math.PI;

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
        System.out.println("Podaj wysoko�� walca:___[cm]");
        wysokoscWalca = scanner.nextFloat();
        System.out.println("Podaj promie� podstawy:___[cm]");
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
