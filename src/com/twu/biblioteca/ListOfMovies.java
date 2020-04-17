package com.twu.biblioteca;

import com.twu.biblioteca.database.MediaLibrary;
import com.twu.biblioteca.interfaces.Option;

public class ListOfMovies implements Option {
    MediaLibrary mediaLibraryDatabase;

    public ListOfMovies(MediaLibrary mediaLibraryDatabase) {
        this.mediaLibraryDatabase = mediaLibraryDatabase;
    }

    @Override
    public String showOptionName() {
        return "List of Movies";
    }

    @Override
    public void optionAction() {

    }

    @Override
    public boolean continueLoop() {
        return true;
    }
}
