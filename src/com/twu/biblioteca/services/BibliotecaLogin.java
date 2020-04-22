package com.twu.biblioteca.services;

import com.twu.biblioteca.User;
import com.twu.biblioteca.database.UserRepository;
import com.twu.biblioteca.interfaces.Login;
import com.twu.biblioteca.interfaces.Option;


import java.util.Scanner;

public class BibliotecaLogin implements Login, Option {
    String USERNAME_MODEL_REGEX = "(\\d{3})[-](\\d{4})";
    public UserRepository userRepository = new UserRepository();
    boolean[] isLogged;
    User[] currentUser;

    public BibliotecaLogin() {
    }

    public BibliotecaLogin(boolean [] isLogged, User[] user){
        this.isLogged = isLogged;
        this.currentUser = user;
    }

    @Override
    public boolean authenticateUser(String libraryID, String password) {
        if (this.validateLibraryIDRegex(libraryID)){
            return checkCredentials(libraryID,password);
        }
        return false;
    }
    public boolean checkCredentials(String libraryID, String password){
        return isPasswordValid(getUserById(libraryID),password);
    }
    @Override
    public boolean validateLibraryIDRegex(String libraryID) {

        return libraryID.matches(this.USERNAME_MODEL_REGEX);
    }

    @Override
    public User getUserById(String libraryID) {

        return userRepository.findByLibraryId(libraryID);
    }

    @Override
    public boolean isPasswordValid(User userFound, String password)  {
        if(userFound != null) {
            this.currentUser[0] = userFound;
            System.out.println(this.currentUser[0].getName());
            return userFound.getPassword().equals(password);
        } else {
            return false;
        }
    }

    public String[] getUserInputCredentials(){
        Scanner  scan = new Scanner(System.in);
        System.out.println("Biblioteca id: ");
        String id = scan.nextLine();
        System.out.println("Password: ");
        String password = scan.nextLine();

        String[]  responses = {id,password};
        return responses;
    }
    @Override
    public String showOptionName() {
        return "Login";
    }

    @Override
    public void optionAction() {
        boolean canLogin;
        String[] responses = getUserInputCredentials();
        canLogin = authenticateUser(responses[0],responses[1]);
        this.isLogged[0] = canLogin;
    }

    @Override
    public boolean continueLoop() {
        return true;
    }
}
