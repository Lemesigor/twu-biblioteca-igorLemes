package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {

        Welcome welcome = new WelcomeImpl();

        System.out.println(welcome.welcomeMessage());
    }
}
