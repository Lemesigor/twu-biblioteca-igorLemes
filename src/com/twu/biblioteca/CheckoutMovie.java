package com.twu.biblioteca;

import com.twu.biblioteca.database.MediaLibrary;
import com.twu.biblioteca.interfaces.MediaReturn;
import com.twu.biblioteca.interfaces.Option;

public class CheckoutMovie implements Option, MediaReturn {

    MediaLibrary mediaLibrary;

    public CheckoutMovie(MediaLibrary mediaLibrary) {
        this.mediaLibrary = mediaLibrary;
    }

    @Override
    public void returnAMedia() {

    }

    @Override
    public void removeMediaFromCheckout(int mediaIndex) {

    }

    @Override
    public int getUserInput() {
        return 0;
    }

    @Override
    public boolean isAMediaChecked() {
        return false;
    }

    @Override
    public void printCheckoutedMedia() {

    }

    @Override
    public String showOptionName() {
        return null;
    }

    @Override
    public void optionAction() {

    }

    @Override
    public boolean continueLoop() {
        return false;
    }
}
