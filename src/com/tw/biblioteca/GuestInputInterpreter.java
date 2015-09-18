//performs operations as per the input given by a guest user
package com.tw.biblioteca;

public class GuestInputInterpreter implements InputInterpreter {

    private ListBookOption listBookOption;
    private ListMoviesOption listMoviesOption;
    private CheckOutMovieOption checkOutMovieOption;
    private MainMenu mainMenu;
    private Session session;

    public GuestInputInterpreter(BookLibrary bookLibrary, MovieLibrary movieLibrary, Session session) {
        listBookOption = new ListBookOption(bookLibrary);
        listMoviesOption = new ListMoviesOption(movieLibrary);
        checkOutMovieOption = new CheckOutMovieOption(movieLibrary);
        mainMenu = new MainMenu(bookLibrary, movieLibrary, session);
    }

    @Override
    public void interpret(String choice) {
        switch (choice) {
            case "1":
                listBookOption.performOperation();
                break;
            case "2":
                listMoviesOption.performOperation();
                break;
            case "3":
                System.out.println("Please enter the name of the movie you want to check out");
                checkOutMovieOption.performOperation();
                break;
            case "4":
                mainMenu.displayMainMenu();
                break;
            case "5":
                System.exit(0);
                break;
            default:
                System.out.println("\nSelect a valid option!");
                break;
        }
    }
}
