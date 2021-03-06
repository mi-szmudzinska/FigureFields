package com.figurefields.figure_choice.choices;

import java.util.Scanner;

import com.figurefields.figure_choice.FigureChoice;
import com.figurefields.figure_choice.InputValidator;
import com.figurefields.figures.Figure;
import com.figurefields.figures.two_dim.Rectangle;

public class RectangleChoice extends FigureChoice {

    private float szerokosc;

    private float wysokosc;

    public RectangleChoice(InputValidator inputValidator, Scanner scanner) {

        super(inputValidator, scanner);
    }

    @Override
    protected String pobierzNazweFigury() {
        return "PROSTOKĄT";
    }

    @Override
    protected void zaladujeParametryWejsciowe() {
        System.out.println("Podaj wysokość:___[cm]");
        this.wysokosc = scanner.nextFloat();
        System.out.println("Podaj szerokość:___[cm]");
        this.szerokosc = scanner.nextFloat();
    }

    @Override
    protected boolean czyParametryWejsciowePoprawne() {
        return inputValidator.isValid(wysokosc) && inputValidator.isValid(szerokosc);
    }

    @Override
    protected Figure stworzFigure() {
        return new Rectangle(wysokosc, szerokosc);
    }
}
