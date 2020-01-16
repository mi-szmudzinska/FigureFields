package com.figurefields;
import com.figurefields.figure_choice.FigureChoiceDirector;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Program obliczający pola figur");

        FigureChoiceDirector figureChoiceDirector = new FigureChoiceDirector();
        do {
            System.out.println("****************************************");
            System.out.println("Wybierz figurę której chcesz policzyć pole:");
            System.out.println("[1] Kwadrat");
            System.out.println("[2] Prostokąt");
            System.out.println("[3] Trójkąt");
            System.out.println("[4] Koło");
            System.out.println("[5] Trapez");
            System.out.println("[6] Sześciokąt");
            System.out.println("[7] Sześcian");
            System.out.println("[8] Walec");
            System.out.println("[9] Zakończ program");
            System.out.println("****************************************");

            Scanner scanner = new Scanner(System.in);
            try {
                int choice = scanner.nextInt();
                figureChoiceDirector.selectFigure(choice);
            } catch (InputMismatchException e) {
                System.out.println("****************************************");
                System.out.println(Constants.BLEDNE_DANE);
                System.out.println("****************************************");
            }
        } while (true);
    }
}