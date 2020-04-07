package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {

        Welcome welcome = new WelcomeImpl();
        MenuOptions menuOptions = new MenuOptions();

        System.out.println(welcome.welcomeMessage());
        System.out.println(menuOptions.showMenu());
    }
}
