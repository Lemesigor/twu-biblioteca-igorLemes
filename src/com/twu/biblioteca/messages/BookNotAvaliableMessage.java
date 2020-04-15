package com.twu.biblioteca.messages;

import com.twu.biblioteca.interfaces.GenericMessage;

public class BookNotAvaliableMessage implements GenericMessage {

    public static final String message = "Sorry, that book is not available";

    @Override
    public String printMessageToUser() {
        return message;
    }
}
