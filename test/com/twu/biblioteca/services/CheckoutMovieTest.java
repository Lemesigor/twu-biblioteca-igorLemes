package com.twu.biblioteca.services;

import com.twu.biblioteca.Movie;
import com.twu.biblioteca.services.CheckoutMovie;
import com.twu.biblioteca.database.MediaLibrary;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CheckoutMovieTest {
    CheckoutMovie checkoutMovie;
    MediaLibrary library;

    @Before
    public void setUp(){
        library = new MediaLibrary();
        checkoutMovie = new CheckoutMovie(library);
    }
    @Test
    public void getAMovieFromDatabase(){
        int bookIndex = 0;
        assertThat(checkoutMovie.getAMovieFromDatabase(bookIndex), is(instanceOf(Movie.class)));
    }
    @Test
    public void checkoutMovie(){
        int bookIndex = 0;
        checkoutMovie.checkoutMedia(bookIndex);
        assertThat(library.checkoutMovies.isEmpty(), is(false));
    }
    @Test
    public void checkoutMovieEmptyList(){
        assertThat(library.checkoutMovies.isEmpty(),is(true));
    }
    @Test
    public void isMovieCheckouted(){
        checkoutMovie.checkoutMedia(1);
        Movie movie = library.avaliableMovies.get(1);
        assertThat(checkoutMovie.isMovieAvaliable(movie), is(false));
    }
    @Test
    public void isMovieNotCheckout(){
        Movie movie = library.avaliableMovies.get(1);
        assertThat(checkoutMovie.isMovieAvaliable(movie), is(true));
    }
}
