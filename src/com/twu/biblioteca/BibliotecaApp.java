package com.twu.biblioteca;

import com.twu.biblioteca.database.BooksLibrary;
import com.twu.biblioteca.exceptions.InvalidOptionException;
import com.twu.biblioteca.interfaces.Option;
import com.twu.biblioteca.interfaces.Welcome;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {

        Welcome welcome = new WelcomeImpl();
        BooksLibrary booksLibrary = new BooksLibrary();
        MenuOptions menuOptions = new MenuOptions(booksLibrary);

        CheckoutBook checkoutBook = new CheckoutBook(booksLibrary);

        System.out.println(welcome.welcomeMessage());



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
