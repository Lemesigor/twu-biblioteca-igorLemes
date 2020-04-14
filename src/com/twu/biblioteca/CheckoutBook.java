package com.twu.biblioteca;

import com.twu.biblioteca.database.BooksLibrary;
import com.twu.biblioteca.interfaces.Option;

public class CheckoutBook implements Option {

    BooksLibrary booksLibraryDatabase;

    public CheckoutBook(){

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

    }

    @Override
    public boolean continueLoop() {
        return true;
    }

    public void checkoutBook(int bookIndex) {
        Book book = this.popCheckoutBookFromList(bookIndex);
        this.booksLibraryDatabase.checkoutBooks.add(book);
    }

    public Book popCheckoutBookFromList(int bookIndex){
        Book book = this.booksLibraryDatabase.avaliableBooks.get(bookIndex);
        this.booksLibraryDatabase.avaliableBooks.remove(bookIndex);
        return book;
    }
}
