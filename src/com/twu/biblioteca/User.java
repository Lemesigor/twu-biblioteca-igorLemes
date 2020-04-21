package com.twu.biblioteca;

public class User {
    private String libraryId;
    private String password;
    private String name;
    private String email;
    private String cellphone;

    public User(String libraryId, String password, String name, String email, String cellphone) {
        this.libraryId = libraryId;
        this.password = password;
        this.name = name;
        this.email = email;
        this.cellphone = cellphone;
    }

    public String getLibraryId() {
        return libraryId;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getCellphone() {
        return cellphone;
    }
}
