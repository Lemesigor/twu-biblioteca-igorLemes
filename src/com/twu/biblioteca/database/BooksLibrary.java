package com.twu.biblioteca.database;

import com.twu.biblioteca.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BooksLibrary {
    public List<Book> getAvaliableBooks() {
        return avaliableBooks;
    }

    public void setAvaliableBooks(List<Book> avaliableBooks) {
        this.avaliableBooks = avaliableBooks;
    }

    public List<Book> getCheckoutBooks() {
        return checkoutBooks;
    }

    public void setCheckoutBooks(List<Book> checkoutBooks) {
        this.checkoutBooks = checkoutBooks;
    }

    public List<Book> avaliableBooks = new ArrayList<Book>(Arrays.asList(
            new Book("The Godfather", "Francis Ford Coppola", "1972"),
            new Book("Pulp Fiction", "Quentin Tarantino", "1994"),
            new Book("Schindlers List", "Steven Spielberg", "1994"),
            new Book("The Dark Knight", "Christopher Nolan", "2008"),
            new Book("The Lord of the Rings: The Return of the King", "Peter Jackson", "2003"),
            new Book("Star Wars", "George Lucas", "1977"),
            new Book("The Matrix", "The Wachowski Brothers", "1999"),
            new Book("Forrest Gump", "Robert Zemeckis", "1994"),
            new Book("Monty Python and the Holy Grail", " Terry Gilliam & Terry Jones", "1975"),
            new Book("2001: A Space Odyssey", "Stanley Kubrick", "1968"),
            new Book("Back to the Future", "Robert Zemeckis", "1989"),
            new Book("Monsters Inc", "Pete Docter & David Silverman", "2001"),
            new Book("Jurassic Park", "Steven Spielberg", "1993"),
            new Book("The Empire Strikes Back", "Irvin Kershner", "1980"),
            new Book("Return of the Jedi", "Richard Marquand", "1983"),
            new Book("GoldenEye", "Martin Campbell", "1995"),
            new Book("The World Is Not Enough", "Michael Apted", "1999"),
            new Book("Die Another Day", "Lee Tamahori", "2003"),
            new Book("Tomorrow Never Dies", "Roger Spottiswoode", "1998"),
            new Book("Skyfall", "Sam Mendes", "2012"),
            new Book("Casino Royale", "Martin Campbell", "2006")
    ));

    public List<Book> checkoutBooks = new ArrayList<Book>();

}