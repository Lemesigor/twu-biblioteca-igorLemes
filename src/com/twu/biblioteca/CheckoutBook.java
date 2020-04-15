package com.twu.biblioteca;

import com.twu.biblioteca.database.BooksLibrary;
import com.twu.biblioteca.interfaces.Option;
import com.twu.biblioteca.messages.BookNotAvaliableMessage;
import com.twu.biblioteca.messages.SucessCheckoutMessage;

import java.util.Scanner;

public class CheckoutBook implements Option {

    BooksLibrary booksLibraryDatabase;
    SucessCheckoutMessage sucessMessage = new SucessCheckoutMessage();
    BookNotAvaliableMessage errorMessage = new BookNotAvaliableMessage();

    public CheckoutBook() {

    }

    public CheckoutBook(BooksLibrary listOfBooks) {
        this.booksLibraryDatabase = listOfBooks;
    }


    @Override
    public String showOptionName() {
        return "Checkout a book";
    }

    @Override
    public void optionAction() {

        System.out.println("Type the book code: ");
        bookChoosed();
    }

    public int readUserInput() {
        Scanner scan = new Scanner(System.in);
        int userInputRead = scan.nextInt();
        return userInputRead;

    }

    public void bookChoosed() {
        try {
            checkoutBook(this.readUserInput());
        } catch (Exception ex) {
            System.out.println(errorMessage.printMessageToUser());
        }
    }

    @Override
    public boolean continueLoop() {
        return true;
    }

    public void checkoutBook(int bookIndex) {
        Book book = getABookFromDatabase(bookIndex);
        if (isBookAvaliable(book)) {
            this.booksLibraryDatabase.checkoutBooks.add(book);
            System.out.println(sucessMessage.printMessageToUser());
        } else {
            System.out.println(errorMessage.printMessageToUser());
        }
    }

    public Book popCheckoutBookFromList(int bookIndex) {
        Book book = this.booksLibraryDatabase.avaliableBooks.get(bookIndex);
        this.booksLibraryDatabase.avaliableBooks.remove(bookIndex);
        return book;
    }

    public boolean isBookAvaliable(Book book) {
        if (this.booksLibraryDatabase.checkoutBooks.contains(book)) {
            return false;
        } else {
            return true;
        }

    }


    public Book getABookFromDatabase(int bookIndex) {
        return this.booksLibraryDatabase.avaliableBooks.get(bookIndex);
    }
}
