package com.twu.biblioteca.interfaces;

public interface Login {
    boolean authenticateUser(String username, String password);
    boolean validateUsernameRegex(String username);
    boolean validateUsername(String username);
    boolean validatePassword(String password);
}
