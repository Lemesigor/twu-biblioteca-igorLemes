package com.twu.biblioteca;

import com.twu.biblioteca.database.MediaLibrary;
import com.twu.biblioteca.interfaces.Option;
import com.twu.biblioteca.messages.InvalidBookToReturnMessage;
import com.twu.biblioteca.messages.SucessReturnBookMessage;

import java.util.Scanner;

public class ReturnBook implements Option {

    MediaLibrary mediaLibrary;
    SucessReturnBookMessage sucessReturnBookMessage = new SucessReturnBookMessage();
    InvalidBookToReturnMessage invalidBookToReturnMessage = new InvalidBookToReturnMessage();

    public ReturnBook(MediaLibrary mediaLibrary) {
        this.mediaLibrary = mediaLibrary;

    }

    public ReturnBook() {
    }

    public void returnABook() {
        if (this.isABookChecked()) {
            printCheckoutedBooks();
            try {
                removeBookFromCheckout(getUserInput());
            } catch (Exception ex) {
                System.out.println(invalidBookToReturnMessage.printMessageToUser());
            }
        } else {
            System.out.println("You have no book to return");
        }
    }

    public void removeBookFromCheckout(int bookIndex) {
        if (this.isABookChecked()) {

            this.mediaLibrary.checkoutBooks.remove(bookIndex);

            System.out.println(sucessReturnBookMessage.printMessageToUser());
        } else {
            System.out.println("You have no book to return");
        }
    }

    public int getUserInput() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt() - 1;
    }

    public void printCheckoutedBooks() {
        System.out.println("Select the code of the book you want to return:");
        for (int i = 0; i < mediaLibrary.checkoutBooks.size(); i++) {
            System.out.println((i + 1) + " - " + mediaLibrary.checkoutBooks.get(i));
        }
        System.out.println("Book code: ");
    }

    public boolean isABookChecked() {
        return !mediaLibrary.checkoutBooks.isEmpty();

    }

    @Override
    public String showOptionName() {
        return "Return a book";
    }

    @Override
    public void optionAction() {
        this.returnABook();
    }

    @Override
    public boolean continueLoop() {
        return true;
    }
}
