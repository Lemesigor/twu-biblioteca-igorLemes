package com.twu.biblioteca;

public class Book {
    private String bookName;
    private String authorName;
    private String yearOfBook;

    public Book(String bookName, String authorName, String yearOfBook) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.yearOfBook = yearOfBook;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getYearOfBook() {
        return yearOfBook;
    }

    public void setYearOfBook(String yearOfBook) {
        this.yearOfBook = yearOfBook;
    }

    @Override
    public String toString() {
        return bookName + " | " + authorName + " | " + yearOfBook;
    }
}
