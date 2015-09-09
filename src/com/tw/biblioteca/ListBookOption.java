package com.tw.biblioteca;

public class ListBookOption implements Operations {

    private BookList books;

    ListBookOption(BookList books) {
        this.books = books;
    }

    @Override
    public void performOperation() {
        System.out.println(books.getColumnHeaders());
        for (String booklibrary : books.getALibraryOfBooks())
            System.out.println(booklibrary);
    }
}

