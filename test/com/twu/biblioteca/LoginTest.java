package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class LoginTest {
    BibliotecaLogin bibliotecaLogin;

    @Before
    public void setUp(){
        bibliotecaLogin = new BibliotecaLogin();
    }

    @Test
    public void validateLibraryIDRegexTest(){
        String validID = "444-4444";
        assertThat(bibliotecaLogin.validateLibraryIDRegex(validID), is(true));
    }
    @Test
    public void invalidLibraryIDRegexTest(){
        String validID = "444444";
        assertThat(bibliotecaLogin.validateLibraryIDRegex(validID), is(false));
    }
}
