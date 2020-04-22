package com.twu.biblioteca.services;

import com.twu.biblioteca.database.MediaLibrary;
import com.twu.biblioteca.exceptions.InvalidOptionException;
import com.twu.biblioteca.interfaces.Option;
import com.twu.biblioteca.services.MenuOptions;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertThat;

public class MenuOptionsTest {

    MenuOptions menu;
    MediaLibrary mediaLibrary;

    @Before
    public void setUp() {
        mediaLibrary = new MediaLibrary();
        boolean[]canLogin = {true};
        menu = new MenuOptions(mediaLibrary,canLogin);
    }

    @Test
    public void showMenuTest() {
        String stringTest = "List of books";
        assertThat(menu.listOfOptions.get(0).showOptionName(), is(equalTo(stringTest)));
    }

    @Test
    public void choseOptionTest() throws InvalidOptionException {
        int optionChoose = 1;
        assertThat(menu.choseOption(optionChoose), is(instanceOf((Option.class))));
    }

    @Test(expected = InvalidOptionException.class)
    public void choseInvalidOptionTest() throws InvalidOptionException {
        int optionChoose = 100;
        menu.choseOption(optionChoose);
    }

    @Test
    public void initializeOptionsListTest(){
        boolean[]canLogin = {true};
        menu.initializeOptions(canLogin);

        assertThat(menu.listOfOptions.isEmpty(), is(not(true)));


    }

}

