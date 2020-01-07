package com.figurefields.figure_choice.choices;

import com.figurefields.figure_choice.FigureChoice;
import com.figurefields.figure_choice.InputValidator;
import com.figurefields.figures.Figure;
import com.figurefields.figures.two_dim.Trapeze;

import java.util.Scanner;

public class TrapezeChoice extends FigureChoice {

    private float dlugoscPod1;

    private float dlugoscPod2;

    private float wysokosc;

    public TrapezeChoice(InputValidator inputValidator, Scanner scanner) {
        super(inputValidator, scanner);
    }

    @Override
    protected String pobierzNazweFigury() {
        return "TRAPEZ";
    }

    @Override
    protected void zaladujeParametryWejsciowe() {
        System.out.println("Podaj dlugo�ci podstaw:___[cm]");
        dlugoscPod1 = scanner.nextFloat();
        dlugoscPod2 = scanner.nextFloat();
        System.out.println("Podaj wysoko�� trapezu:___[cm]");
        wysokosc = scanner.nextFloat();
    }

    @Override
    protected boolean czyParametryWejsciowePoprawne() {
        return inputValidator.isValid(dlugoscPod1) && inputValidator.isValid(dlugoscPod2) && inputValidator
                .isValid(wysokosc);
    }

    @Override
    protected Figure stworzFigure() {
        return new Trapeze(dlugoscPod1, dlugoscPod2, wysokosc);
    }
}
