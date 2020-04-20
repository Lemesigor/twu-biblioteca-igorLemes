package com.twu.biblioteca.services;

import com.twu.biblioteca.services.ListOfBooks;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class ListOfBooksTest {

    ListOfBooks listOfBooksOption;

    @Before
    public void setUp() {
        listOfBooksOption = new ListOfBooks();
    }

    @Test
    public void showOptionNameTest() {
        assertThat(listOfBooksOption.showOptionName(), is(instanceOf(String.class)));
    }

    @Test
    public void continueLoopTest(){
        assertThat(listOfBooksOption.continueLoop(), is(true));
    }

}
