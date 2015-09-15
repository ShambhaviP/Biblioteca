//performs the operation corresponding to the choice input by the user
package com.tw.biblioteca;

public class InputInterpreter {

    private ListBookOption listBookOption;
    private CheckOutBookOption checkOutBookOption;
    private ReturnBookOption returnBookOption;
    private ListMoviesOption listMoviesOption;

    public InputInterpreter(BookLibrary bookLibrary,MovieLibrary movieLibrary) {
        listBookOption = new ListBookOption(bookLibrary);
        checkOutBookOption = new CheckOutBookOption(bookLibrary);
        returnBookOption = new ReturnBookOption(bookLibrary);
        listMoviesOption = new ListMoviesOption(movieLibrary);
    }

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
                listMoviesOption.performOperation();break;
            case "5":
                System.exit(0);
                break;
            default:
                System.out.println("\nSelect a valid option!");
                break;
        }
    }
}