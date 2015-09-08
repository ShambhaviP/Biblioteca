//performs the operation corresponding to the choice input by the user
package com.tw.biblioteca;

public class InputInterpreter {

    private int choice;
    private BookList bookList = new BookList();
    private ListBookOption listBookOption = new ListBookOption(bookList);

    public void interpret(int choice) {

        switch (choice) {
            case 1 : listBookOption.performOperation();
        }
    }
}