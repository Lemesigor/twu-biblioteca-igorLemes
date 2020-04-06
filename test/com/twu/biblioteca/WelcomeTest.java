package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class WelcomeTest {

    WelcomeImpl welcome;

    @Before
    public void setUp(){
        welcome = new WelcomeImpl();
    }

    @Test
    public void welcomeMessageTest(){
        assertThat(welcome.welcomeMessage(), is(equalTo(welcome.message)));
    }
}
