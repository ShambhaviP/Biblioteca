//performs login of a user
package com.tw.biblioteca;

public class LoginOption implements Operations {

    private UserAccountAuthenticator userAccountAuthenticator;
    private LibrarianMenu librarianMenu;
    private RegisteredCustomerMenu registeredCustomerMenu;
    private BookLibrary bookLibrary;
    private MovieLibrary movieLibrary;

    LoginOption(BookLibrary bookLibrary, MovieLibrary movieLibrary) {
        userAccountAuthenticator = new UserAccountAuthenticator();
        librarianMenu = new LibrarianMenu();
        registeredCustomerMenu = new RegisteredCustomerMenu();
        this.bookLibrary = bookLibrary;
        this.movieLibrary = movieLibrary;
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
            Session session = new Session(user);
            session.setCurrentUser(user);
            if (user.getRole().equals("LIBRARIAN")) {
                librarianMenu.displayOptionsForLibrarian(bookLibrary, movieLibrary);
            } else if (user.getRole().equals("CUSTOMER")) {
                registeredCustomerMenu.displayOptionsForARegisteredCustomer(bookLibrary, movieLibrary);
            }
        }
    }
}
