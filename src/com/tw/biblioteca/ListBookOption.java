//performs the operation of printing available books in library with their details
package com.tw.biblioteca;

public class ListBookOption implements Operations {

    private BookLibrary books;

    public ListBookOption(BookLibrary books) {
        this.books = books;
    }

    @Override
    public void performOperation() {
        System.out.println(books.getColumnHeaders());
        for (String booklibrary : books.getALibraryOfBooks())
            System.out.println(booklibrary);
    }
}

