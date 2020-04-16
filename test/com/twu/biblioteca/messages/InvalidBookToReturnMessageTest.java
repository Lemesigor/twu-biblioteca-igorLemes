package com.twu.biblioteca.messages;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class InvalidBookToReturnMessageTest {

    @Test
    public void printMessageToUser() {
        InvalidBookToReturnMessage invalidBookToReturnMessage = new InvalidBookToReturnMessage();
        assertThat(invalidBookToReturnMessage.printMessageToUser(), is(equalTo(InvalidBookToReturnMessage.message)));
    }
}