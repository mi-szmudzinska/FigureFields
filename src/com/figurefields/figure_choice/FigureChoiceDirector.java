package com.figurefields.figure_choice;

import static java.lang.System.exit;

import java.util.Scanner;

import com.figurefields.Constants;
import com.figurefields.figure_choice.choices.CircleChoice;
import com.figurefields.figure_choice.choices.CubeChoice;
import com.figurefields.figure_choice.choices.HexagonChoice;
import com.figurefields.figure_choice.choices.RectangleChoice;
import com.figurefields.figure_choice.choices.RollerChoice;
import com.figurefields.figure_choice.choices.SquareChoice;
import com.figurefields.figure_choice.choices.TrapezeChoice;
import com.figurefields.figure_choice.choices.TriangleChoice;

/*
  Klasa ktora opowiada za stworzenie odpowieniej instancji FigureInputChoice.
  Dzieje sie to na podstawie danych wprowadzonych przez uzytkownika zapisanych w zmiennej choice.
 */
public class FigureChoiceDirector {

    private InputValidator inputValidator;
    private boolean test = false;
    private Scanner scanner;

    public FigureChoiceDirector() {
        this.inputValidator = new InputValidator();
        this.scanner = new Scanner(System.in);
    }
    public FigureChoiceDirector(boolean TT) {
        test=true;
    }

    public boolean selectFigure(int choice) {

        switch (choice) {
            case 1:
                if(test==true) return true;
                FigureChoice squareInputChoice = new SquareChoice(inputValidator, scanner);
                squareInputChoice.showFigureInputDetails();
                break;
            case 2:
                if(test==true) return true;
                FigureChoice rectangleInputChoice = new RectangleChoice(inputValidator, scanner);
                rectangleInputChoice.showFigureInputDetails();
                break;

            case 3:
                if(test==true) return true;
                FigureChoice triangleInputChoice = new TriangleChoice(inputValidator, scanner);
                triangleInputChoice.showFigureInputDetails();
                break;

            case 4:
                if(test==true) return true;
                FigureChoice circleInputChoice = new CircleChoice(inputValidator, scanner);
                circleInputChoice.showFigureInputDetails();
                break;

            case 5:
                if(test==true) return true;
                FigureChoice trapezeInputChoice = new TrapezeChoice(inputValidator, scanner);
                trapezeInputChoice.showFigureInputDetails();
                break;

            case 6:
                if(test==true) return true;
                FigureChoice hexagonInputChoice = new HexagonChoice(inputValidator, scanner);
                hexagonInputChoice.showFigureInputDetails();
                break;

            case 7:
                if(test==true) return true;
                FigureChoice cubeInputChoice = new CubeChoice(inputValidator, scanner);
                cubeInputChoice.showFigureInputDetails();
                break;

            case 8:
                if(test==true) return true;
                FigureChoice rollerInputChoice = new RollerChoice(inputValidator, scanner);
                rollerInputChoice.showFigureInputDetails();
                break;

            case 9:
                if(test==true) return false;
                exit(-1);

            default:
                System.out.println("****************************************");
                System.out.println(Constants.BLEDNE_DANE);
                System.out.println("****************************************");
                return false;
        }
        return true;
    }

}

