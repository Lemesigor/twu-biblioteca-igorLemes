package com.twu.biblioteca;

public class MenuOptions {

    public ListOfBooks listOfBooks = new ListOfBooks();

    public String showMenu(){
        return listOfBooks.showOptionName();
    }
}
