//performs the operation corresponding to the choice input by a user
package com.tw.biblioteca;

public class MainInputInterpreter implements InputInterpreter {

    private LoginOption loginOption;
    private GuestLoginOption guestLoginOption;
    private Session session;

    MainInputInterpreter(BookLibrary bookLibrary, MovieLibrary movieLibrary, Session session) {
        this.session = session;
        loginOption = new LoginOption(bookLibrary, movieLibrary, this.session);
        guestLoginOption = new GuestLoginOption(bookLibrary, movieLibrary, session);
    }

    @Override
    public void interpret(String choice) {
        switch (choice) {
            case "1":
                loginOption.performOperation();
                break;
            case "2":
                guestLoginOption.performOperation();
                break;
            case "3":
                System.exit(0);
                break;
            default:
                System.out.println("\nSelect a valid option!");
                break;
        }
    }
}