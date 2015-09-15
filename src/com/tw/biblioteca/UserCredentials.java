//instantiates user credentials for a user
package com.tw.biblioteca;

public class UserCredentials {

    private String libraryNumber;
    private String password;

    public UserCredentials(String libraryNumber, String password) {
        this.libraryNumber = libraryNumber;
        this.password = password;
    }

    public String getLibraryNumber() {
        return libraryNumber;
    }
}