//calls the method for displaying options for a guest user
package com.tw.biblioteca;

public class GuestLoginOption implements Operations {

    private GuestUserMenu guestUserMenu;
    private BookLibrary bookLibrary;
    private MovieLibrary movieLibrary;
    private Session session;

    public GuestLoginOption(BookLibrary bookLibrary, MovieLibrary movieLibrary, Session session) {
        guestUserMenu = new GuestUserMenu(session);
        this.bookLibrary = bookLibrary;
        this.movieLibrary = movieLibrary;
    }

    @Override
    public void performOperation() {
        guestUserMenu.displayOptionsForAGuestUser(bookLibrary, movieLibrary);
    }
}