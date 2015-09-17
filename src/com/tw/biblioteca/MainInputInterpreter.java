//performs the operation corresponding to the choice input by a user
package com.tw.biblioteca;

public class MainInputInterpreter implements InputInterpreter {

    private LoginOption loginOption;
    private GuestLoginOption guestLoginOption;

    MainInputInterpreter(BookLibrary bookLibrary, MovieLibrary movieLibrary) {
        loginOption = new LoginOption(bookLibrary, movieLibrary);
        guestLoginOption = new GuestLoginOption(bookLibrary, movieLibrary);
    }

    @Override
    public void interpret(String choice) {
        switch (choice) {
            case "1" :
                loginOption.performOperation();
                break;
            case "2":
                guestLoginOption.performOperation();
                break;
            case "3" :
                System.exit(0);
                break;
            default:
                System.out.println("\nSelect a valid option!");
                break;
        }
    }
}