package com.twu.biblioteca;

import com.twu.biblioteca.interfaces.GenericMessage;

public class WelcomeMessage implements GenericMessage {

    public static final String message = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";

    @Override
    public String printMessageToUser() {
        return message;
    }

}
