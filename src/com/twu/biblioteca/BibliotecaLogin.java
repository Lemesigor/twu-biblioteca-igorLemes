package com.twu.biblioteca;

import com.twu.biblioteca.interfaces.Login;

public class BibliotecaLogin implements Login {
    @Override
    public boolean authenticateUser() {
        return false;
    }

    @Override
    public boolean validateUsernameRegex() {
        return false;
    }

    @Override
    public boolean validateUsername() {
        return false;
    }

    @Override
    public boolean validatePassword() {
        return false;
    }
}
