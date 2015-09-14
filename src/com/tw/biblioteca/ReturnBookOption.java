package com.tw.biblioteca;

public class ReturnBookOption implements Operations {

    private BookLibrary bookLibrary;

    ReturnBookOption(BookLibrary bookLibrary) {
        this.bookLibrary = bookLibrary;
    }

    @Override
    public void performOperation() {
        ReadUserInput readUserInput = new ReadUserInput();
        String bookToReturn = readUserInput.read();

        bookLibrary.returnBook(bookToReturn);
    }
}
