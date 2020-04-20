package com.twu.biblioteca.services;


import com.twu.biblioteca.Book;
import com.twu.biblioteca.database.MediaLibrary;
import com.twu.biblioteca.interfaces.MediaList;
import com.twu.biblioteca.interfaces.MediaReturn;
import com.twu.biblioteca.interfaces.Option;

import java.util.ArrayList;
import java.util.List;

public class ListOfBooks implements Option, MediaList {

    private MediaLibrary library;
    private List<Book> avaliableBooks;

    private List<Book> checkoutBooks = new ArrayList<Book>();

    public ListOfBooks(MediaLibrary mediaLibrary) {
        this.library = mediaLibrary;
        this.avaliableBooks = library.avaliableBooks;
    }

    public ListOfBooks() {
    }

    @Override
    public String showOptionName() {

        return "List of books";
    }

    @Override
    public void optionAction() {
        this.printAvaliableMedia();
    }

    @Override
    public boolean continueLoop() {
        return true;
    }



    @Override
    public void printAvaliableMedia() {
        for (int i = 0; i < avaliableBooks.size(); i++) {
            System.out.println(i + "-- " + avaliableBooks.get(i).toString());
        }
    }
}
