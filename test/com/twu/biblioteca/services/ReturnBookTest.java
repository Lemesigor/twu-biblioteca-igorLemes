package com.twu.biblioteca.services;

import com.twu.biblioteca.Book;
import com.twu.biblioteca.database.MediaLibrary;
import com.twu.biblioteca.services.ReturnBook;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ReturnBookTest {

    ReturnBook returnBook;
    MediaLibrary mediaLibrary;

    @Before
    public void setUp()  {
        mediaLibrary = new MediaLibrary();
        returnBook = new ReturnBook(mediaLibrary);
    }

    @Test
    public void showOptionName() {
        assertThat(returnBook.showOptionName(), is(equalTo("Return a book")));
    }

    @Test
    public void optionAction() {
    }

    @Test
    public void continueLoop() {
        assertThat(returnBook.continueLoop(), is(true));
    }

    @Test
    public void isABookCheckedTest(){
        mediaLibrary.checkoutBooks.add(new Book("Test", "Test", "Test"));
        assertThat(returnBook.isAMediaChecked(), is(true));

    }

    @Test
    public void isABookNotCheckedTest(){
        assertThat(returnBook.isAMediaChecked(), is(false));
    }

    @Test
    public void removeBookFromCheckoutTest() {
        mediaLibrary.checkoutBooks.add(new Book("Test", "Test", "Test"));
        returnBook.removeMediaFromCheckout(0);
        assertThat(mediaLibrary.checkoutBooks.isEmpty(), is(true));
    }
    @Test
    public void returnABookTest(){

    }
}