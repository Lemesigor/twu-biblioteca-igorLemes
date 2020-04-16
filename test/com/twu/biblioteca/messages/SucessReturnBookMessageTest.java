package com.twu.biblioteca.messages;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SucessReturnBookMessageTest {

    SucessReturnBookMessage sucessReturnBookMessage;

    @Before
    public void setUp() throws Exception {
        sucessReturnBookMessage = new SucessReturnBookMessage();
    }

    @Test
    public void printMessageToUser() {
        assertThat(sucessReturnBookMessage.printMessageToUser(), is(equalTo(SucessReturnBookMessage.message)));
    }
}