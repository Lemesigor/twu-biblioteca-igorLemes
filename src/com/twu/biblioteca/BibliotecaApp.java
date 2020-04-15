package com.twu.biblioteca;

import com.twu.biblioteca.database.BooksLibrary;
import com.twu.biblioteca.exceptions.InvalidOptionException;
import com.twu.biblioteca.interfaces.Option;
import com.twu.biblioteca.interfaces.GenericMessage;
import com.twu.biblioteca.messages.WelcomeMessage;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {

        GenericMessage welcome = new WelcomeMessage();
        BooksLibrary booksLibrary = new BooksLibrary();
        MenuOptions menuOptions = new MenuOptions(booksLibrary);


        System.out.println(welcome.printMessageToUser());


        boolean continueOption = true;

        while (continueOption) {
            System.out.print("\n");

            Scanner scan = new Scanner(System.in);
            menuOptions.printMenuOptionsInterface();
            int userInputRead = scan.nextInt();
//            scan.close();

            try {
                Option optionSelected = menuOptions.choseOption(userInputRead);
                menuOptions.executeOptionAction(optionSelected);
                continueOption = menuOptions.loopingController(optionSelected);
            } catch (InvalidOptionException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
