package com.twu.biblioteca;

import com.twu.biblioteca.database.BooksLibrary;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ReturnBookTest {

    ReturnBook returnBook;
    BooksLibrary booksLibrary;

    @Before
    public void setUp()  {
        booksLibrary = new BooksLibrary();
        returnBook = new ReturnBook(booksLibrary);
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
        booksLibrary.checkoutBooks.add(new Book("Test", "Test", "Test"));
        assertThat(returnBook.isABookChecked(), is(true));

    }

    @Test
    public void isABookNotCheckedTest(){
        assertThat(returnBook.isABookChecked(), is(true));
    }

    @Test
    public void removeBookFromCheckoutTest() {
        booksLibrary.checkoutBooks.add(new Book("Test", "Test", "Test"));
        returnBook.removeBookFromCheckout(0);
        assertThat(booksLibrary.checkoutBooks.isEmpty(), is(true));
    }
    @Test
    public void returnABookTest(){

    }
}