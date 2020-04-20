package com.twu.biblioteca.services;

import com.twu.biblioteca.database.MediaLibrary;
import com.twu.biblioteca.services.ListOfMovies;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ListOfMoviesTest {
    ListOfMovies listOfMovies;
    MediaLibrary mediaLibrary;

    @Before
    public void setUp(){
        mediaLibrary = new MediaLibrary();
        listOfMovies = new ListOfMovies(mediaLibrary);
    }

    @Test
    public void showOptionNameTest() {
        assertThat(listOfMovies.showOptionName(), is(instanceOf(String.class)));
    }
    @Test
    public void continueLoopTest(){
        assertThat(listOfMovies.continueLoop(), is(true));
    }
}
