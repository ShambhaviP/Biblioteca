//performs the operation corresponding to the choice input by the user
package com.tw.biblioteca;

public class InputInterpreter {

    private ListBookOption listBookOption;

    InputInterpreter(BookList bookList) {
        listBookOption = new ListBookOption(bookList);
    }

    public void interpret(String choice) {

        switch (choice) {
            case "1":
                listBookOption.performOperation();
                break;
            case "2":
                System.exit(0);
            default:
                System.out.println("\nSelect a valid option!");
        }
    }
}