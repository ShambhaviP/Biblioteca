////performs the operation corresponding to the choice input by a registered customer after she has logged in
package com.tw.biblioteca;

public class RegisteredCustomerInputInterpreter implements InputInterpreter {

    private ListBookOption listBookOption;
    private CheckOutBookOption checkOutBookOption;
    private ReturnBookOption returnBookOption;
    private ListMoviesOption listMoviesOption;
    private CheckOutMovieOption checkOutMovieOption;
    private LogoutOption logoutOption;
    private MainMenu mainMenu;

    public RegisteredCustomerInputInterpreter(BookLibrary bookLibrary, MovieLibrary movieLibrary, Session session) {
        listBookOption = new ListBookOption(bookLibrary);
        checkOutBookOption = new CheckOutBookOption(bookLibrary);
        returnBookOption = new ReturnBookOption(bookLibrary);
        listMoviesOption = new ListMoviesOption(movieLibrary);
        checkOutMovieOption = new CheckOutMovieOption(movieLibrary);
        logoutOption = new LogoutOption(session);
        mainMenu = new MainMenu(bookLibrary, movieLibrary);
    }

    @Override
    public void interpret(String choice) {
        switch (choice) {
            case "1":
                listBookOption.performOperation();
                break;
            case "2":
                System.out.println("Please enter the name of the book you want to check out");
                checkOutBookOption.performOperation();
                break;
            case "3":
                System.out.println("Please enter the name of the book you want to return");
                returnBookOption.performOperation();
                break;
            case "4":
                listMoviesOption.performOperation();
                break;
            case "5":
                System.out.println("Please enter the name of the movie you want to check out");
                checkOutMovieOption.performOperation();
                break;
            case "6":
                logoutOption.performOperation();
                mainMenu.displayMainMenu();
                break;
            case "7":
                System.exit(0);
                break;
            default:
                System.out.println("\nSelect a valid option!");
                break;
        }
    }
}
