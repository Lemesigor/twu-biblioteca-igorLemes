package com.twu.biblioteca;

import com.twu.biblioteca.interfaces.Login;

public class BibliotecaLogin implements Login {
    String USERNAME_MODEL_REGEX = "(\\d{3})[-](\\d{4})";

    @Override
    public boolean authenticateUser(String libraryID, String password) {
        return false;
    }

    @Override
    public boolean validateUsernameRegex(String libraryID) {
        return false;
    }

    @Override
    public boolean validateUsername(String libraryID) {
        return false;
    }

    @Override
    public boolean validatePassword(String password) {
        return false;
    }
}
