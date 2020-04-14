package com.twu.biblioteca;


import com.twu.biblioteca.database.BooksLibrary;
import com.twu.biblioteca.interfaces.Option;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfBooks implements Option {

    private BooksLibrary library;
    private List<Book> avaliableBooks;

    private List<Book> checkoutBooks = new ArrayList<Book>();

    public ListOfBooks(BooksLibrary mediaLibrary) {
        this.library = mediaLibrary;
        this.avaliableBooks = library.getAvaliableBooks();
    }

    public ListOfBooks() {
    }

    @Override
    public String showOptionName() {

        return "List of books";
    }

    @Override
    public void optionAction() {
        this.printBookList();
    }

    @Override
    public boolean continueLoop() {
        return true;
    }

    private void printBookList() {
        for (int i = 0; i < avaliableBooks.size(); i++) {
            System.out.println(i + "-- " + avaliableBooks.get(i).toString());
        }
    }


    public List<Book> getAvaliableBooks() {
        return avaliableBooks;
    }


    public List<Book> getCheckoutBooks() {
        return checkoutBooks;
    }


}
