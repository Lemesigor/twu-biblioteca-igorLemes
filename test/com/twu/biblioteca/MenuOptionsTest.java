package com.twu.biblioteca;

import com.twu.biblioteca.database.BooksLibrary;
import com.twu.biblioteca.exceptions.InvalidOptionException;
import com.twu.biblioteca.interfaces.Option;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertThat;

public class MenuOptionsTest {

    MenuOptions menu;
    BooksLibrary mediaLibrary;

    @Before
    public void setUp() {
        mediaLibrary = new BooksLibrary();
        menu = new MenuOptions(mediaLibrary);
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
        menu.initializeOptions();

        assertThat(menu.listOfOptions.isEmpty(), is(not(true)));


    }

}

