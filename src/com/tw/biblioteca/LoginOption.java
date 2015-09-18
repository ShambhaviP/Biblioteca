//performs login of a user
package com.tw.biblioteca;

public class LoginOption implements Operations {

    private UserAccountAuthenticator userAccountAuthenticator;
    private LibrarianMenu librarianMenu;
    private RegisteredCustomerMenu registeredCustomerMenu;
    private BookLibrary bookLibrary;
    private MovieLibrary movieLibrary;
    private Session session;

    LoginOption(BookLibrary bookLibrary, MovieLibrary movieLibrary, Session session) {
        userAccountAuthenticator = new UserAccountAuthenticator();
        librarianMenu = new LibrarianMenu();
        registeredCustomerMenu = new RegisteredCustomerMenu();
        this.bookLibrary = bookLibrary;
        this.movieLibrary = movieLibrary;
        this.session = session;
    }

    @Override
    public void performOperation() {
        ReadUserInput readUserInput = new ReadUserInput();
        System.out.println("Enter Library Number :");
        String libraryNumber = readUserInput.read();
        System.out.println("Enter Password :");
        String password = readUserInput.read();
        User user = userAccountAuthenticator.authenticateUser(libraryNumber, password);
        if (user.getRole() != "GUEST") {
            session.setCurrentUser(user);
            if (user.getRole().equals("LIBRARIAN")) {
                librarianMenu.displayOptionsForLibrarian(bookLibrary, movieLibrary, session);
            } else if (user.getRole().equals("CUSTOMER")) {
                registeredCustomerMenu.displayOptionsForARegisteredCustomer(bookLibrary, movieLibrary, session);
            }
        }
    }
}
