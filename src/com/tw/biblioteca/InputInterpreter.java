//performs the operation corresponding to the choice input by the user
package com.tw.biblioteca;

public class InputInterpreter {

    private ListBookOption listBookOption;
    private CheckOutBookOption checkOutBookOption;
    private ReturnBookOption returnBookOption;

    public InputInterpreter(BookLibrary bookLibrary) {
        listBookOption = new ListBookOption(bookLibrary);
        checkOutBookOption = new CheckOutBookOption(bookLibrary);
        returnBookOption = new ReturnBookOption(bookLibrary);
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
            case "4":
                System.exit(0);
                break;
            default:
                System.out.println("\nSelect a valid option!");
                break;
        }
    }
}