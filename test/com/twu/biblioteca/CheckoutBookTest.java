package com.twu.biblioteca;

import com.twu.biblioteca.database.BooksLibrary;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class CheckoutBookTest {
    CheckoutBook checkoutBook;
    BooksLibrary library;

    @Before
    public void setUp(){
        library = new BooksLibrary();
        checkoutBook = new CheckoutBook(library);
    }

    @Test
    public void popCheckoutBookFromListTest(){
        int bookIndex = 1;
        int sizeOfTheAvaliableBooksBeforeCheckout = library.getAvaliableBooks().size();
        checkoutBook.popCheckoutBookFromList(bookIndex);
        assertThat((library.getAvaliableBooks().size()), is(equalTo(sizeOfTheAvaliableBooksBeforeCheckout -1)));
    }

    @Test
    public void getAPopedBookFromListTest(){
        int bookIndex = 1;
        Book book = library.getAvaliableBooks().get(bookIndex);
        assertThat((checkoutBook.popCheckoutBookFromList(bookIndex)), is(equalTo(book)));
    }

    @Test
    public void checkoutBookTest(){
        int bookIndex = 1;
        checkoutBook.checkoutBook(bookIndex);
        assertThat(library.getCheckoutBooks().isEmpty(), is(false));

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
