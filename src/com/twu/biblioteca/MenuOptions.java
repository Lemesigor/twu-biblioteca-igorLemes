package com.twu.biblioteca;

import com.twu.biblioteca.interfaces.Option;
import com.twu.biblioteca.exceptions.InvalidOptionException;
import com.twu.biblioteca.ListOfBooks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MenuOptions {

    List<Option> listOfOptions = new ArrayList<Option>(Arrays.asList(

            new ListOfBooks(),
//            new CheckoutBook(),
            new ExitOption()
    ));

    public void printMenuOptionsInterface() {
        System.out.println("######## Select an option ########");
        this.printListOfOptions();

    }

    public void menuOptionsLoop(){

    }
    private void printListOfOptions() {
        for (int i = 0; i < this.listOfOptions.size(); i++) {
            System.out.println("(" + (i + 1) + ")  " + listOfOptions.get(i).showOptionName());
        }
    }

    public Option choseOption(int optionChoose) throws InvalidOptionException {
        if (optionChoose <= listOfOptions.size()) {
            return listOfOptions.get(optionChoose - 1);
        } else {
            throw new InvalidOptionException("Please select a valid option!");
        }
    }

    public void executeOptionAction(Option selectedOption) {
        selectedOption.optionAction();
    }

    public boolean loopingController(Option selectedOption){
        return selectedOption.continueLoop();
    }
}
