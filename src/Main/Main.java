package Main;

import javax.swing.*;
import java.util.Scanner;

public class Main extends Switchh{
    public static void main(String[] args) {

        System.out.println("Program obliczający pola figur");
        do{
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

            new Switchh();
        }while(true);
    }
}