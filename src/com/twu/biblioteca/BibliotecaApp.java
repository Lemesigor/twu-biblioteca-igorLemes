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

        System.out.print("\n");

        Scanner scan = new Scanner(System.in);
        int lineRead;

        do {
            lineRead = scan.nextInt();
            try {
                Option optionSelected = menuOptions.choseOption(lineRead);

            } catch (InvalidOptionException ex) {
                System.out.println(ex.getMessage());
            }
        } while (lineRead !=  0 );
    }
}
