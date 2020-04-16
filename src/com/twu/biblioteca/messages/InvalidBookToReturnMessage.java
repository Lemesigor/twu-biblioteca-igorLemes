package com.twu.biblioteca.messages;

import com.twu.biblioteca.interfaces.GenericMessage;
import com.twu.biblioteca.interfaces.Option;

public class InvalidBookToReturnMessage implements GenericMessage {
    public final static String message = "This is not a valid book to return";
    @Override
    public String printMessageToUser() {
        return message;
    }
}
