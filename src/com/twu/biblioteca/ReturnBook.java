package com.twu.biblioteca;

import com.twu.biblioteca.database.BooksLibrary;
import com.twu.biblioteca.interfaces.Option;
import com.twu.biblioteca.messages.SucessReturnBookMessage;

import java.util.Scanner;

public class ReturnBook implements Option {

    BooksLibrary booksLibrary;
    SucessReturnBookMessage sucessReturnBookMessage = new SucessReturnBookMessage();

    public ReturnBook(BooksLibrary booksLibrary) {
        this.booksLibrary = booksLibrary;

    }

    public ReturnBook() {
    }

    public void returnABook(){
        printCheckoutedBooks();
        removeBookFromCheckout(getUserInput());
    }

    public void removeBookFromCheckout(int bookIndex){
        this.booksLibrary.checkoutBooks.remove(bookIndex);
        System.out.println(sucessReturnBookMessage.printMessageToUser());
    }

    public int getUserInput(){
        Scanner scan = new Scanner(System.in);
        return scan.nextInt() - 1;
    }

    public void printCheckoutedBooks() {
        System.out.println("Select the code of the book you want to return:");
        for (int i = 0; i < booksLibrary.checkoutBooks.size(); i++) {
            System.out.println((i + 1) + " - " + booksLibrary.checkoutBooks.get(i));
        }
        System.out.println("Book code: ");
    }

    public boolean isABookChecked() {
        return !booksLibrary.avaliableBooks.isEmpty();
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
