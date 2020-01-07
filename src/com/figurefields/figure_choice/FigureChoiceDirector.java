package com.figurefields.figure_choice;

import com.figurefields.Constants;
import com.figurefields.figure_choice.choices.*;

import java.util.Scanner;

import static java.lang.System.exit;

/*
  Klasa ktora opowiada za stworzenie odpowieniej instancji FigureInputChoice.
  Dzieje sie to na podstawie danych wprowadzonych przez uzytkownika zapisanych w zmiennej choice.
 */
public class FigureChoiceDirector {

    private InputValidator inputValidator;

    private Scanner scanner;

    public FigureChoiceDirector() {
        this.inputValidator = new InputValidator();
        this.scanner = new Scanner(System.in);
    }

    public void selectFigure(int choice) {

        switch (choice) {
            case 1:
                FigureChoice squareInputChoice = new SquareChoice(inputValidator, scanner);
                squareInputChoice.showFigureInputDetails();
                break;
            case 2:
                FigureChoice rectangleInputChoice = new RectangleChoice(inputValidator, scanner);
                rectangleInputChoice.showFigureInputDetails();
                break;

            case 3:
                FigureChoice triangleInputChoice = new TriangleChoice(inputValidator, scanner);
                triangleInputChoice.showFigureInputDetails();
                break;

            case 4:
                FigureChoice circleInputChoice = new CircleChoice(inputValidator, scanner);
                circleInputChoice.showFigureInputDetails();
                break;

            case 5:
                FigureChoice trapezeInputChoice = new TrapezeChoice(inputValidator, scanner);
                trapezeInputChoice.showFigureInputDetails();
                break;

            case 6:
                FigureChoice hexagonInputChoice = new HexagonChoice(inputValidator, scanner);
                hexagonInputChoice.showFigureInputDetails();
                break;

            case 7:
                FigureChoice cubeInputChoice = new CubeChoice(inputValidator, scanner);
                cubeInputChoice.showFigureInputDetails();
                break;

            case 8:
                FigureChoice rollerInputChoice = new RollerChoice(inputValidator, scanner);
                rollerInputChoice.showFigureInputDetails();
                break;

            case 9:
                exit(-1);

            default:
                System.out.println("****************************************");
                System.out.println(Constants.BLEDNE_DANE);
                System.out.println("****************************************");
        }
    }

}

