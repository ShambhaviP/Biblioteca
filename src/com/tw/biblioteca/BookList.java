//displays a pre-defined book-list
package com.tw.biblioteca;

import java.util.ArrayList;

public class BookList {

    private ArrayList<String> listOfBooks = new ArrayList<>();

    BookList(ArrayList<String> listOfBooks) {
        this.listOfBooks = listOfBooks;
    }

    BookList() {

    }

    public String displayColumnHeaders() {
        String lineDivider = "\n-------------------------------------------------------\n";
        return lineDivider + String.format("%-20s%-20s%-20s", "Title", "Author", "Year Of Publish") + lineDivider;
    }

    public void displayPredefinedBookList() {
        for (String books : listOfBooks)
            System.out.println(books);
    }
}