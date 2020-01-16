package com.figurefields.figure_choice.choices;

import java.util.Scanner;
import com.figurefields.figure_choice.FigureChoice;
import com.figurefields.figure_choice.InputValidator;
import com.figurefields.figures.Figure;
import com.figurefields.figures.two_dim.Square;

public class SquareChoice extends FigureChoice {

    private float dlugoscBoku;

    public SquareChoice(InputValidator inputValidator, Scanner scanner) {

        super(inputValidator, scanner);
    }

    @Override
    protected String pobierzNazweFigury() {

        return "KWADRAT";
    }

    @Override
    protected void zaladujeParametryWejsciowe() {
        System.out.println("Podaj długość boku:___[cm]");
        dlugoscBoku = scanner.nextFloat();
    }

    @Override
    protected boolean czyParametryWejsciowePoprawne() {

        return inputValidator.isValid(dlugoscBoku);
    }

    @Override
    protected Figure stworzFigure() {
        return new Square(this.dlugoscBoku);
    }

}
