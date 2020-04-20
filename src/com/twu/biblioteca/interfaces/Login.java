package com.twu.biblioteca.interfaces;

public interface Login {
    boolean authenticateUser();
    boolean validateUsernameRegex();
    boolean validateUsername();
    boolean validatePassword();
}
