package com.twu.biblioteca.messages;

import com.twu.biblioteca.interfaces.GenericMessage;

public class SucessReturnBookMessage implements GenericMessage {
    public final static String message = "Thank you for returning the book";
    @Override
    public String printMessageToUser() {
        return message;
    }
}
