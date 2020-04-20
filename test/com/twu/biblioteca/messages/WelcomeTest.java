package com.twu.biblioteca.messages;

import com.twu.biblioteca.messages.WelcomeMessage;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class WelcomeTest {

    WelcomeMessage welcome;

    @Before
    public void setUp(){
        welcome = new WelcomeMessage();
    }

    @Test
    public void welcomeMessageTest(){
        assertThat(welcome.printMessageToUser(), is(equalTo(WelcomeMessage.message)));
    }


}
