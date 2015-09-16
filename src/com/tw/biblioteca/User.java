//instantiates user credentials for a user
package com.tw.biblioteca;

public class User {

    private String libraryNumber;
    private String password;

    public User(String libraryNumber, String password) {
        this.libraryNumber = libraryNumber;
        this.password = password;
    }

    public String getLibraryNumber() {
        return libraryNumber;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object that) {
        if (that != null && that.getClass() == this.getClass()) {
            User thatUser = (User) that;
            if (this == thatUser || this.libraryNumber.equals(thatUser.libraryNumber)) {
                if (this.password.equals(thatUser.password)) {
                    return true;
                }
            }
        }
        return false;
    }
}
