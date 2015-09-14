//reads the book name entered by user for checkout and performs the checkout
package com.tw.biblioteca;

public class CheckOutBookOption implements Operations {

    private BookLibrary bookLibrary;

    CheckOutBookOption(BookLibrary bookLibrary) {
        this.bookLibrary = bookLibrary;
    }

    @Override
    public void performOperation() {

        ReadUserInput readUserInput = new ReadUserInput();
        String bookToCheckOut = readUserInput.read();
        bookLibrary.checkOutBooks(bookToCheckOut);
    }
}
