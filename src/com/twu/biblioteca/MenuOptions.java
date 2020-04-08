package com.twu.biblioteca;

import com.twu.biblioteca.interfaces.Option;
import com.twu.biblioteca.exceptions.InvalidOptionException;
import com.twu.biblioteca.ListOfBooks;

public class MenuOptions {
    public ListOfBooks listOfBooks = new ListOfBooks();

    public String showMenu(){
        return listOfBooks.showOptionName();
    }


    public Option choseOption(String optionChoose) throws InvalidOptionException{
        if (optionChoose.equals("1")) {
            return new ListOfBooks();
        } else {
            throw new InvalidOptionException("Please select a valid option!");
        }
    }
}
