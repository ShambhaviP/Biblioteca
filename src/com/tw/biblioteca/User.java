//instantiates user credentials for a user
package com.tw.biblioteca;

public class User {

    private String libraryNumber;
    private String password;
    private String role;

    public User(String libraryNumber, String password, String role) {
        this.libraryNumber = libraryNumber;
        this.password = password;
        this.role = role;
    }

    public String getRole() {
        return role;
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

    @Override
    public int hashCode() {
        return libraryNumber != null ? libraryNumber.hashCode() : 0;
    }
}