//displays a pre-defined book-list
package com.tw.biblioteca;

import java.util.ArrayList;

public class BookList {

    private ArrayList<String> booksAvailable = new ArrayList<>();

    public ArrayList<String> createBookList(Book book) {
        booksAvailable.add(book.bookDetails());
        return booksAvailable;
    }

    public void displayPredefinedBookList() {
        for (String books : booksAvailable)
            System.out.println(books);
    }
}
