package com.twu.biblioteca;

import com.twu.biblioteca.interfaces.GenericMessage;

public class SucessCheckoutMessage implements GenericMessage {
    public static final String sucessMessage = "Thank you! Enjoy the book";

    @Override
    public String printMessageToUser() {
        return sucessMessage;
    }
}
