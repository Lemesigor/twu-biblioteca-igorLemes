package com.twu.biblioteca.interfaces;

public interface Login {
    boolean authenticateUser(String username, String password);
    boolean validateLibraryIDRegex(String username);
    boolean validateLibraryID(String username);
    boolean validatePassword(String password);
}
