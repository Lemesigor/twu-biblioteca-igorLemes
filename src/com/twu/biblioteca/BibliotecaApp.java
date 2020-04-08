package com.twu.biblioteca;

import com.twu.biblioteca.exceptions.InvalidOptionException;
import com.twu.biblioteca.interfaces.Welcome;

public class BibliotecaApp {

    public static void main(String[] args) {

        Welcome welcome = new WelcomeImpl();
        MenuOptions menuOptions = new MenuOptions();

        System.out.println(welcome.welcomeMessage());
        System.out.println(menuOptions.showMenu());

        System.out.print("\n");

        try{
            menuOptions.choseOption("1");
        } catch (InvalidOptionException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
