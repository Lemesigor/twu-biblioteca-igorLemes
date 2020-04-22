package com.twu.biblioteca.interfaces;

import com.twu.biblioteca.User;

public interface Login {
    boolean authenticateUser(String username, String password);
    boolean validateLibraryIDRegex(String username);
    User getUserById(String username);
    boolean isPasswordValid(User userFound,String password);
}
