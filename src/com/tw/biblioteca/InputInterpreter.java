//performs the operation corresponding to the choice input by the user
package com.tw.biblioteca;

public class InputInterpreter {

    private int choice;
    private BookList bookList;
    private ListBookOption listBookOption;

    InputInterpreter(BookList bookList) {
        this.bookList = bookList;
        listBookOption = new ListBookOption(bookList);
    }

    public void interpret(int choice) {

        switch (choice) {
            case 1 : listBookOption.performOperation();
        }
    }
}