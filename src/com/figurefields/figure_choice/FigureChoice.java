package com.figurefields.figure_choice;
import java.util.InputMismatchException;
import java.util.Scanner;
import com.figurefields.Constants;
import com.figurefields.figures.Figure;
/*
    Klasa abstrakcyjna, ktora odpowiada za wprowadzanie danych przez uzytkownika dla odpowieniej figury.
    Klasy dziedziczace po tej klasie odpowiadaja za wprowadzanie danych i wypisaywanie wynik dla odpowieniej figury,
    np. SquareChoice wczytuje dane dla kwadratu i wypisuje wynik
 */
public abstract class FigureChoice {

    protected InputValidator inputValidator;

    protected Scanner scanner;

    public FigureChoice(InputValidator inputValidator, Scanner scanner) {
        this.inputValidator = inputValidator;
        this.scanner = scanner;
    }

    public void showFigureInputDetails() {
        System.out.println("****************************************");
        String description = String.format("Wybrana figura: %s", pobierzNazweFigury());
        System.out.println(description);
        System.out.println("****************************************");

        //try {
            zaladujeParametryWejsciowe();
            if (czyParametryWejsciowePoprawne()) {
                wypiszPoprawneDane();
            } else {
                throw new InputMismatchException();
                //wypiszDaneNiepoprawne();
            }
//        } catch (InputMismatchException e) {
//            scanner.nextLine();
//            wypiszDaneNiepoprawne();
//        }
        System.out.println("****************************************");
    }

    protected abstract String pobierzNazweFigury();

    protected abstract void zaladujeParametryWejsciowe();

    protected abstract boolean czyParametryWejsciowePoprawne();

    public boolean jestPoprawna(){
        return czyParametryWejsciowePoprawne();
    }

    protected abstract Figure stworzFigure();

    public void wypiszDaneNiepoprawne() {
        System.out.println(Constants.BLEDNE_DANE);
    }

    private void wypiszPoprawneDane(){
        Figure figure = stworzFigure();
        String result = String
                .format("Pole figury %s wynosi: %.2f[%s]", pobierzNazweFigury().toLowerCase(), figure.getArea(),
                        figure.getFigureUnit());
        System.out.println(result);
    }

}
