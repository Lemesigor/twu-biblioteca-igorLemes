package com.twu.biblioteca.services;

import com.twu.biblioteca.User;
import com.twu.biblioteca.database.MediaLibrary;
import com.twu.biblioteca.interfaces.Option;
import com.twu.biblioteca.exceptions.InvalidOptionException;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MenuOptions {
    MediaLibrary mediaLibrary;

    List<Option> listOfOptions;

    User[] currentUser;

    public MenuOptions(MediaLibrary mediaLibrary, boolean[] isUserLogged, User[] currentUser) {

        this.mediaLibrary = mediaLibrary;
        this.currentUser = currentUser;
        this.initializeOptions(isUserLogged);
    }

    public void printMenuOptionsInterface() {
        System.out.println("######## Select an option ########");
        System.out.println("You have to be logged in in order to checkout a media");
        this.printListOfOptions();

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

    public boolean loopingController(Option selectedOption) {
        return selectedOption.continueLoop();
    }

    public void initializeOptions(boolean[] isLogged) {
        if (isLogged[0]) {
            listOfOptions = new ArrayList<Option>(Arrays.asList(
                    new ShowUserInfo(this.currentUser),
                    new ListOfBooks(this.mediaLibrary),
                    new CheckoutBook(this.mediaLibrary),
                    new ReturnBook(this.mediaLibrary),
                    new ListOfMovies(this.mediaLibrary),
                    new CheckoutMovie(this.mediaLibrary),
                    new ExitOption()
            ));
        } else {
            listOfOptions = new ArrayList<Option>(Arrays.asList(
                    new BibliotecaLogin(isLogged, this.currentUser),
                    new ListOfBooks(this.mediaLibrary),
                    new ListOfMovies(this.mediaLibrary),
                    new ExitOption()
            ));
        }
    }
}
