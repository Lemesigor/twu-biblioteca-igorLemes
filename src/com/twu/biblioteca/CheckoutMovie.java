package com.twu.biblioteca;

import com.twu.biblioteca.database.MediaLibrary;
import com.twu.biblioteca.interfaces.MediaCheckout;
import com.twu.biblioteca.interfaces.MediaReturn;
import com.twu.biblioteca.interfaces.Option;

import java.util.Scanner;

public class CheckoutMovie implements Option, MediaCheckout {

    MediaLibrary mediaLibrary;

    public CheckoutMovie(MediaLibrary mediaLibrary) {
        this.mediaLibrary = mediaLibrary;
    }



    @Override
    public String showOptionName() {
        return "Checkout a movie";
    }

    @Override
    public void optionAction() {
        System.out.println("Type the movie code: ");
        mediaChoosed();
    }

    @Override
    public boolean continueLoop() {
        return true;
    }

    public Movie getAMovieFromDatabase(int bookIndex) {
        return mediaLibrary.avaliableMovies.get(bookIndex);
    }

    public boolean isMovieAvaliable(Movie movie) {
        if (this.mediaLibrary.checkoutMovies.contains(movie)) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void checkoutMedia(int mediaIndex) {
        Movie movie = getAMovieFromDatabase(mediaIndex);
        if (isMovieAvaliable(movie)) {
            this.mediaLibrary.checkoutMovies.add(movie);
            System.out.println("Thank you for returning this movie");
        } else {
            System.out.println("Sorry, that movie is not available");
        }
    }

    @Override
    public int readUserInput() {
        Scanner scan = new Scanner(System.in);
        int userInputRead = scan.nextInt();
        return userInputRead;
    }

    @Override
    public void mediaChoosed() {
        try {
            checkoutMedia(this.readUserInput());
        } catch (Exception ex) {
            System.out.println("Sorry, that movie is not available");
        }
    }
}
