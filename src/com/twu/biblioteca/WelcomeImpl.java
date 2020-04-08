package com.twu.biblioteca;

import com.twu.biblioteca.interfaces.Welcome;

public class WelcomeImpl implements Welcome {

    public static final String message = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";

    @Override
    public String welcomeMessage() {
        return message;
    }

}
