package com.twu.biblioteca.database;

import com.twu.biblioteca.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public  class UserRepository {
    public List <User> bibliotecaUsers = new ArrayList<User>(Arrays.asList(
            new User("888-8888","test","Kevin Gardner","kevin@gardner.com","99937899"),
            new User("123-4567","123","Laura Palmer", "laura_palmer@gmaik.com","87675423")
    ));

    public User findByLibraryId(String libraryId){
        for (User u : this.bibliotecaUsers){
            if( u.getLibraryId().equals(libraryId)) {
                return u;
            }
        }
        return null;
    }

}
