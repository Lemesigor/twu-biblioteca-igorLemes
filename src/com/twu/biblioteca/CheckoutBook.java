package com.twu.biblioteca;

import com.twu.biblioteca.database.BooksLibrary;
import com.twu.biblioteca.interfaces.Option;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CheckoutBook implements Option {

    BooksLibrary booksLibraryDatabase;
    SucessCheckoutMessage sucessMessage = new SucessCheckoutMessage();

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

        System.out.println("Type the book code: ");
        bookChoosed();
        System.out.println(sucessMessage.printMessageToUser());
    }

    public int readUserInput(){
        Scanner scan = new Scanner(System.in);
        int userInputRead = scan.nextInt();
        return userInputRead;

    }

    public void bookChoosed(){
        checkoutBook(this.readUserInput());
    }

    @Override
    public boolean continueLoop() {
        return true;
    }

    public void checkoutBook(int bookIndex) {
        Book book = this.booksLibraryDatabase.avaliableBooks.get(bookIndex);
        this.booksLibraryDatabase.checkoutBooks.add(book);
    }

    public Book popCheckoutBookFromList(int bookIndex){
        Book book = this.booksLibraryDatabase.avaliableBooks.get(bookIndex);
        this.booksLibraryDatabase.avaliableBooks.remove(bookIndex);
        return book;
    }
}
