//performs the operation corresponding to the choice input by the user
package com.tw.biblioteca;

public class InputInterpreter {

    private ListBookOption listBookOption;

    public InputInterpreter(BookLibrary bookLibrary) {
        listBookOption = new ListBookOption(bookLibrary);
    }

    public void interpret(String choice) {

        switch (choice) {
            case "1":
                listBookOption.performOperation();
                break;
            case "2":
                System.exit(0);
                break;
            default:
                System.out.println("\nSelect a valid option!");
                break;
        }
    }
}