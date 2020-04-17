package com.twu.biblioteca;

import com.twu.biblioteca.database.MediaLibrary;
import org.junit.Before;
import org.junit.Test;

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
    public void continueLoopTest(){
        assertThat(listOfMovies.continueLoop(), is(true));
    }
}
