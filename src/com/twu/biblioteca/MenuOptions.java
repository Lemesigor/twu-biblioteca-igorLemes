package com.twu.biblioteca;

import com.twu.biblioteca.interfaces.Option;
import com.twu.biblioteca.exceptions.InvalidOptionException;
import com.twu.biblioteca.ListOfBooks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MenuOptions {

    List<Option> listOfOptions = new ArrayList<Option>(Arrays.asList(

             new ListOfBooks()
    ));

    public void showMenu(){

    }


    public Option choseOption(int optionChoose) throws InvalidOptionException{
        if (optionChoose  == 1) {
            return listOfOptions.get(optionChoose - 1);
        } else {
            throw new InvalidOptionException("Please select a valid option!");
        }
    }
}
