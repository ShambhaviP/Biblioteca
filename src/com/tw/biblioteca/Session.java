//keeps track of the user currently logged in
package com.tw.biblioteca;

public class Session {

    private User currentUser;

    Session(User currentUser) {
        this.currentUser = currentUser;
    }

    public User getCurrentUser() {
        return currentUser;
    }
}
