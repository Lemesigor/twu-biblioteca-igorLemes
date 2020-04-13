package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
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

    @Test
    public void continueLoopTest(){
        assertThat(listOfBooksOption.continueLoop(), is(true));
    }

    @Test
    public void popCheckoutBookFromListTest(){
        int bookIndex = 1;
        int sizeOfTheAvaliableBooksBeforeCheckout = listOfBooksOption.getAvaliableBooks().size();
        listOfBooksOption.popCheckoutBookFromList(bookIndex);
        assertThat((listOfBooksOption.getAvaliableBooks().size()), is(equalTo(sizeOfTheAvaliableBooksBeforeCheckout -1)));
    }

    @Test
    public void getAPopedBookFromListTest(){
        int bookIndex = 1;
        Book book = listOfBooksOption.getAvaliableBooks().get(bookIndex);
        assertThat((listOfBooksOption.popCheckoutBookFromList(bookIndex)), is(equalTo(book)));
    }

    @Test
    public void checkoutBookTest(){
        int bookIndex = 1;
        listOfBooksOption.checkoutBook(bookIndex);
        assertThat(listOfBooksOption.getCheckoutBooks().isEmpty(), is(false));

    }

}
