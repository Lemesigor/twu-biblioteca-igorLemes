package com.twu.biblioteca.database;

import com.twu.biblioteca.Book;
import com.twu.biblioteca.Movie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MediaLibrary {

    public List<Book> avaliableBooks = new ArrayList<Book>(Arrays.asList(
            new Book("Test-Driven Development by example", "Kent Beck", "2000"),
            new Book("Extreme Programming Explained", "Kent Beck", "1999"),
            new Book("Implementation Patterns", "Kent Beck", "1997"),
            new Book("Lavoura Arcaica","Raduan Nassar", "1975"),
            new Book("Feliz ano Novo", "Rubem Fonseca", "1975"),
            new Book("Grande Sertão: Veredas","Guimarães Rosa", "1956"),
            new Book("Educação pela Pedra", "João Cabral", "1965"),
            new Book("O Outro Pé da Sereia", "Mia Couto", "2006")
    ));


    public List<Movie> avaliableMovies = new ArrayList<Movie>(Arrays.asList(
            new Movie("The Godfather", "Francis Ford Coppola", "1972", "5"),
            new Movie("Pulp Fiction", "Quentin Tarantino", "1994", "3.8"),
            new Movie("Schindlers List", "Steven Spielberg", "1994", "4.5"),
            new Movie("The Dark Knight", "Christopher Nolan", "2008", "3.5"),
            new Movie("The Lord of the Rings: The Return of the King", "Peter Jackson", "2003", "4"),
            new Movie("Star Wars", "George Lucas", "1977", "3"),
            new Movie("The Matrix", "The Wachowski Brothers", "1999", "5"),
            new Movie("Forrest Gump", "Robert Zemeckis", "1994", "5"),
            new Movie("Monty Python and the Holy Grail", " Terry Gilliam & Terry Jones", "1975", "3.5"),
            new Movie("2001: A Space Odyssey", "Stanley Kubrick", "1968", "5"),
            new Movie("Back to the Future", "Robert Zemeckis", "1989", "3"),
            new Movie("Monsters Inc", "Pete Docter & David Silverman", "2001", "3.5"),
            new Movie("Jurassic Park", "Steven Spielberg", "1993", "2.5"),
            new Movie("The Empire Strikes Back", "Irvin Kershner", "1980", "4.5"),
            new Movie("Return of the Jedi", "Richard Marquand", "1983", "0.5"),
            new Movie("GoldenEye", "Martin Campbell", "1995", "3"),
            new Movie("The World Is Not Enough", "Michael Apted", "1999", "1.5"),
            new Movie("Die Another Day", "Lee Tamahori", "2003", "3.4"),
            new Movie("Tomorrow Never Dies", "Roger Spottiswoode", "1998", "3"),
            new Movie("Skyfall", "Sam Mendes", "2012", "3"),
            new Movie("Casino Royale", "Martin Campbell", "2006", "2")
    ));

    public List<Book> checkoutBooks = new ArrayList<Book>();
    public List<Movie> checkoutMovies = new ArrayList<Movie>();

}
