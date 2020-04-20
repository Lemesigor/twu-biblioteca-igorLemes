package com.twu.biblioteca.interfaces;

public interface MediaReturn {
    void returnAMedia();
    void removeMediaFromCheckout(int mediaIndex);
    int getUserInput();
    boolean isAMediaChecked();
    void printCheckoutedMedia();
}
