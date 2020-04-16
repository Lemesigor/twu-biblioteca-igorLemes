package com.twu.biblioteca;

public class Movie {
    private String movieName;
    private String directorName;
    private String yearRealease;
    private String rating;

    public Movie(String movieName, String directorName, String yearRealease, String rating) {
        this.movieName = movieName;
        this.directorName = directorName;
        this.yearRealease = yearRealease;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return movieName + " | " + directorName + " | " + yearRealease + " | " + rating;
    }
}
