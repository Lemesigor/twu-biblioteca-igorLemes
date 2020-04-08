package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
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
}
