package com.twu.biblioteca.services;

import com.twu.biblioteca.interfaces.Option;
import com.twu.biblioteca.services.ExitOption;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ExitOptionTest {

    Option exit;


    @Before
    public void setUp(){
        exit = new ExitOption();
    }

    @Test
    public void showOptionNameTest(){
        assertThat(exit.showOptionName(),is(equalTo("Exit the application")));
    }
    @Test
    public void continueLoopTest(){
        assertThat(exit.continueLoop(),is(false));
    }
}
