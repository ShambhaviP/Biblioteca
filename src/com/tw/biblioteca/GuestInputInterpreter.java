//performs operations as per the input given by a guest user
package com.tw.biblioteca;

public class GuestInputInterpreter implements InputInterpreter {

    private ListBookOption listBookOption;
    private ListMoviesOption listMoviesOption;
    private CheckOutMovieOption checkOutMovieOption;

    public GuestInputInterpreter(BookLibrary bookLibrary, MovieLibrary movieLibrary) {
        listBookOption = new ListBookOption(bookLibrary);
        listMoviesOption = new ListMoviesOption(movieLibrary);
        checkOutMovieOption = new CheckOutMovieOption(movieLibrary);
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
                System.exit(0);
                break;
            default:
                System.out.println("\nSelect a valid option!");
                break;
        }
    }
}