package com.twu.biblioteca;

import com.twu.biblioteca.exceptions.InvalidOptionException;
import com.twu.biblioteca.interfaces.Option;
import com.twu.biblioteca.interfaces.Welcome;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {

        Welcome welcome = new WelcomeImpl();
        MenuOptions menuOptions = new MenuOptions();

        System.out.println(welcome.welcomeMessage());


        Scanner scan = new Scanner(System.in);
        int userInputRead;

        do {
            System.out.print("\n");
            menuOptions.printMenuOptions();
            userInputRead = scan.nextInt();
            try {
                Option optionSelected = menuOptions.choseOption(userInputRead);
                optionSelected.optionAction();

            } catch (InvalidOptionException ex) {
                System.out.println(ex.getMessage());
            }
        } while (userInputRead !=  0 );
    }
}
