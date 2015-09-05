//displays a pre-defined book-list
package com.tw.biblioteca;

import java.util.ArrayList;

public class BookList {

    private ArrayList<String> booksAvailable;

    BookList() {
        booksAvailable = new ArrayList<>();
        booksAvailable.add("Twilight");
        booksAvailable.add("Wuthering Heights");
        booksAvailable.add("Gone With The Wind");
        booksAvailable.add("Oliver Twist");
    }

    public void displayPredefinedBookList() {
        System.out.println(booksAvailable);
    }
}
