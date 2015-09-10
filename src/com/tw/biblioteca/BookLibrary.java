//to get column headers and a library of books
package com.tw.biblioteca;

import java.util.ArrayList;

public class BookLibrary {

    private ArrayList<Book> availableBooks;

    public BookLibrary(ArrayList<Book> availableBooks) {
        this.availableBooks = availableBooks;
    }

    public BookLibrary() {
        availableBooks = new ArrayList<>();
    }

    public String getColumnHeaders() {
        String lineDivider = "\n-------------------------------------------------------\n";
        return lineDivider + String.format("%-20s%-20s%-20s", "Title", "Author", "Year Of Publish") + lineDivider;
    }

    public ArrayList<String> getALibraryOfBooks() {

        ArrayList<String> formattedLibraryOfBooks = new ArrayList<>();
        for (Book aBook : availableBooks)
            formattedLibraryOfBooks.add(aBook.getFormattedBookDetails());
        return formattedLibraryOfBooks;
    }
}
