package com.twu.biblioteca;

import com.twu.biblioteca.database.MediaLibrary;
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
    public void popCheckoutBookFromListTest(){
        int bookIndex = 1;
        int sizeOfTheAvaliableBooksBeforeCheckout = library.avaliableBooks.size();
        checkoutBook.popCheckoutBookFromList(bookIndex);
        assertThat((library.avaliableBooks.size()), is(equalTo(sizeOfTheAvaliableBooksBeforeCheckout -1)));
    }

    @Test
    public void getAPopedBookFromListTest(){
        int bookIndex = 1;
        Book book = library.avaliableBooks.get(bookIndex);
        assertThat((checkoutBook.popCheckoutBookFromList(bookIndex)), is(equalTo(book)));
    }

    @Test
    public void checkoutBookTest(){
        int bookIndex = 1;
        checkoutBook.checkoutBook(bookIndex);
        assertThat(library.avaliableBooks.isEmpty(), is(false));

    }

    @Test
    public void isBookCheckouted(){
        checkoutBook.checkoutBook(1);
        Book book = library.avaliableBooks.get(1);
        assertThat(checkoutBook.isBookAvaliable(book), is(false));
    }
    @Test
    public void getABookFromDatabase(){
        int bookIndex = 1;
        assertThat(checkoutBook.getABookFromDatabase(bookIndex), is(instanceOf(Book.class)));
    }

}
