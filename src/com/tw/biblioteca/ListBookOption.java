package com.tw.biblioteca;

public class ListBookOption implements Operations {

    private BookList bookList;

    ListBookOption(BookList bookList) {
        this.bookList = bookList;
    }

    @Override
    public void performOperation() {
        System.out.println(bookList.displayColumnHeaders());
        bookList.displayPredefinedBookList();
    }
}

