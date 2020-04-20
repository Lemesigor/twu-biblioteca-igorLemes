package com.twu.biblioteca;

import com.twu.biblioteca.database.MediaLibrary;
import com.twu.biblioteca.interfaces.MediaCheckout;
import com.twu.biblioteca.interfaces.Option;
import com.twu.biblioteca.messages.BookNotAvaliableMessage;
import com.twu.biblioteca.messages.SucessCheckoutMessage;

import java.util.Scanner;

public class CheckoutBook implements Option, MediaCheckout {

    MediaLibrary mediaLibraryDatabase;
    SucessCheckoutMessage sucessMessage = new SucessCheckoutMessage();
    BookNotAvaliableMessage errorMessage = new BookNotAvaliableMessage();

    public CheckoutBook() {

    }

    public CheckoutBook(MediaLibrary listOfBooks) {
        this.mediaLibraryDatabase = listOfBooks;
    }


    @Override
    public String showOptionName() {
        return "Checkout a book";
    }

    @Override
    public void optionAction() {

        System.out.println("Type the book code: ");
        mediaChoosed();
    }

    public int readUserInput() {
        Scanner scan = new Scanner(System.in);
        int userInputRead = scan.nextInt();
        return userInputRead;

    }

    public void mediaChoosed() {
        try {
            checkoutMedia(this.readUserInput());
        } catch (Exception ex) {
            System.out.println(errorMessage.printMessageToUser());
        }
    }

    @Override
    public boolean continueLoop() {
        return true;
    }

    public void checkoutMedia(int bookIndex) {
        Book book = getABookFromDatabase(bookIndex);
        if (isBookAvaliable(book)) {
            this.mediaLibraryDatabase.checkoutBooks.add(book);
            System.out.println(sucessMessage.printMessageToUser());
        } else {
            System.out.println(errorMessage.printMessageToUser());
        }
    }


    public boolean isBookAvaliable(Book book) {
        if (this.mediaLibraryDatabase.checkoutBooks.contains(book)) {
            return false;
        } else {
            return true;
        }

    }


    public Book getABookFromDatabase(int bookIndex) {
        return this.mediaLibraryDatabase.avaliableBooks.get(bookIndex);
    }
}
