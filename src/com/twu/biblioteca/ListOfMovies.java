package com.twu.biblioteca;

import com.twu.biblioteca.database.MediaLibrary;
import com.twu.biblioteca.interfaces.MediaList;
import com.twu.biblioteca.interfaces.Option;

public class ListOfMovies implements Option, MediaList {
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
        this.printAvaliableMedia();

    }

    @Override
    public boolean continueLoop() {
        return true;
    }

    @Override
    public void printAvaliableMedia() {
        for (int i = 0; i < mediaLibraryDatabase.avaliableMovies.size(); i++) {
            System.out.println(i + "-- " + mediaLibraryDatabase.avaliableMovies.get(i).toString());
        }
    }
}
