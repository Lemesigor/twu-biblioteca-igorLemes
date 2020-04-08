package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class BookTest {

    Book bookTest;
    String toStringResult;

    @Before
    public void setUp() {
        bookTest = new Book("Sandman", "Neil Gaiman", "1995");
        toStringResult = "Sandman | Neil Gaiman | 1995";
    }

    @Test
    public void toStringTest(){
        assertThat(bookTest.toString(), is(equalTo(toStringResult)));
    }
}
