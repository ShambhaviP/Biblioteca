//instantiates user credentials for a user
package com.tw.biblioteca;

public class User {

    private String libraryNumber;
    private String password;
    private String role;
    private String name;
    private String email;
    private String phone;

    public User(String libraryNumber, String password, String role, String name, String email, String phone) {
        this.libraryNumber = libraryNumber;
        this.password = password;
        this.role = role;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getRole() {
        return role;
    }

    public String getLibraryNumber() {
        return libraryNumber;
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

    public String fetchUserInformation() {
        return String.format("%-20s%-20s%-20s%-20s", libraryNumber, name, email, phone);
    }
}