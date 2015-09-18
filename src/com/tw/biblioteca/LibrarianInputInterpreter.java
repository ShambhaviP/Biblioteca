//performs the operation corresponding to the choice input by the librarian after a librarian is logged in
package com.tw.biblioteca;

public class LibrarianInputInterpreter implements InputInterpreter{

    private ListBookOption listBookOption;
    private CheckOutBookOption checkOutBookOption;
    private ReturnBookOption returnBookOption;
    private ListMoviesOption listMoviesOption;
    private CheckOutMovieOption checkOutMovieOption;
    private ViewCheckedOutBookDetails viewCheckedOutBookDetails;
    private ViewUserDetails viewUserDetails;
    private LogoutOption logoutOption;
    private MainMenu mainMenu;

    public LibrarianInputInterpreter(BookLibrary bookLibrary, MovieLibrary movieLibrary, Session session) {
        listBookOption = new ListBookOption(bookLibrary);
        checkOutBookOption = new CheckOutBookOption(bookLibrary);
        returnBookOption = new ReturnBookOption(bookLibrary);
        listMoviesOption = new ListMoviesOption(movieLibrary);
        checkOutMovieOption = new CheckOutMovieOption(movieLibrary);
        viewCheckedOutBookDetails = new ViewCheckedOutBookDetails(bookLibrary);
        viewUserDetails = new ViewUserDetails(session);
        logoutOption = new LogoutOption(session);
        mainMenu = new MainMenu(bookLibrary, movieLibrary, session);
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
                viewCheckedOutBookDetails.performOperation();
                break;
            case "7":
                viewUserDetails.performOperation();
                break;
            case "8":
                logoutOption.performOperation();
                mainMenu.displayMainMenu();
                break;
            case "9":
                System.exit(0);
                break;
            default:
                System.out.println("\nSelect a valid option!");
                break;
        }
    }
}