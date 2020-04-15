package com.twu.biblioteca;

import com.twu.biblioteca.interfaces.GenericMessage;
import com.twu.biblioteca.messages.SucessCheckoutMessage;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SucessCheckoutMessageTest {

    GenericMessage message;

    @Before
    public void setUp(){
        message = new SucessCheckoutMessage();

    }

    @Test
    public void printUserMessageTest(){
        assertThat(message.printMessageToUser(), is(equalTo(SucessCheckoutMessage.sucessMessage)));
    }

}
