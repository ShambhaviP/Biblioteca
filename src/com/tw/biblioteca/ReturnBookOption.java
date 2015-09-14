//performs the operation of returning a book
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
        if(bookLibrary.returnBook(bookToReturn)) {
            System.out.println("Thank You for returning the book.");
        }
        else {
            System.out.println("That is not a valid book.");
        }
    }
}
