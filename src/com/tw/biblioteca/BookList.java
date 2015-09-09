//to get column headers and a library of books
package com.tw.biblioteca;

import java.util.ArrayList;

public class BookList {

    private ArrayList<String> books;

    BookList(ArrayList<String> books) {
        this.books = books;
    }

    public BookList() {
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