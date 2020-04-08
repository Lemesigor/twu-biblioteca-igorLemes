package com.twu.biblioteca;


import com.twu.biblioteca.interfaces.Option;

public class ListOfBooks implements Option {

    @Override
    public String showOptionName() {

        return "List of books";
    }
}
