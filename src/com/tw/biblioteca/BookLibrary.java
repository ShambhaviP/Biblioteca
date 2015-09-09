//to get column headers and a library of books
package com.tw.biblioteca;

import java.util.ArrayList;

public class BookLibrary {

    private ArrayList<String> books;

    BookLibrary(ArrayList<String> books) {
        this.books = books;
    }

    public BookLibrary() {
        books = new ArrayList<>();
    }

    public String getColumnHeaders() {
        String lineDivider = "\n-------------------------------------------------------\n";
        return lineDivider + String.format("%-20s%-20s%-20s", "Title", "Author", "Year Of Publish") + lineDivider;
    }

    public ArrayList<String> getALibraryOfBooks() {
        return books;
    }
}