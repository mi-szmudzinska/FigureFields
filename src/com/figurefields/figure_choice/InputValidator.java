package com.figurefields.figure_choice;

/*
   Klasa sprawdzajaca poprawnosc wprowadzonych przez uzytkownika danych
 */
public class InputValidator {

    public boolean isValid(float param) {
        if (param > 0 && param <= Float.MAX_VALUE) {
            return true;
        }
        return false;
    }
}
