package com.twu.biblioteca;

import com.twu.biblioteca.database.MediaLibrary;
import com.twu.biblioteca.exceptions.InvalidOptionException;
import com.twu.biblioteca.interfaces.Option;
import com.twu.biblioteca.interfaces.GenericMessage;
import com.twu.biblioteca.messages.WelcomeMessage;
import com.twu.biblioteca.services.MenuOptions;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {

        GenericMessage welcome = new WelcomeMessage();
        MediaLibrary mediaLibrary = new MediaLibrary();


        System.out.println(welcome.printMessageToUser());


        boolean continueOption = true;

        boolean[] isLoggedIn = {false};

        while (continueOption) {
            System.out.print("\n");

            MenuOptions menuOptions = new MenuOptions(mediaLibrary,isLoggedIn);

            Scanner scan = new Scanner(System.in);
            menuOptions.printMenuOptionsInterface();
            int userInputRead = scan.nextInt();

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
