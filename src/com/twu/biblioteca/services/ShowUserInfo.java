package com.twu.biblioteca.services;

import com.twu.biblioteca.User;
import com.twu.biblioteca.interfaces.Option;

public class ShowUserInfo implements Option {

    User[] user;

    public ShowUserInfo(User[]user) {
        this.user = user;
    }

    @Override
    public String showOptionName() {
        return "Show my infos";
    }

    @Override
    public void optionAction() {
        this.printUserInfo();
    }

    @Override
    public boolean continueLoop() {
        return true;
    }

    public void printUserInfo(){
        System.out.println("Your information is: ");
        System.out.println("-> Name = " + this.user[0].getName());
        System.out.println("-> Email = " + this.user[0].getEmail());
        System.out.println("-> Cellphone = " + this.user[0].getCellphone());
    }
}
