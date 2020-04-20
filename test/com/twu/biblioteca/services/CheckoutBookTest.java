package com.twu.biblioteca.services;

import com.twu.biblioteca.Book;
import com.twu.biblioteca.database.MediaLibrary;
import com.twu.biblioteca.services.CheckoutBook;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class CheckoutBookTest {
    CheckoutBook checkoutBook;
    MediaLibrary library;

    @Before
    public void setUp(){
        library = new MediaLibrary();
        checkoutBook = new CheckoutBook(library);
    }


    @Test
    public void checkoutBookTest(){
        int bookIndex = 1;
        checkoutBook.checkoutMedia(bookIndex);
        assertThat(library.avaliableBooks.isEmpty(), is(false));

    }

    @Test
    public void isBookCheckouted(){
        checkoutBook.checkoutMedia(1);
        Book book = library.avaliableBooks.get(1);
        assertThat(checkoutBook.isBookAvaliable(book), is(false));
    }
    @Test
    public void getABookFromDatabase(){
        int bookIndex = 1;
        assertThat(checkoutBook.getABookFromDatabase(bookIndex), is(instanceOf(Book.class)));
    }

}
