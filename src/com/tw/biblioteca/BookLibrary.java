//handles all the tasks related to library
package com.tw.biblioteca;

import java.util.ArrayList;
import java.util.HashMap;

public class BookLibrary {

    private ArrayList<Book> availableBooks = new ArrayList<>();
    private ArrayList<Book> checkedOutBooks = new ArrayList<>();
    private HashMap<Book, User> bookUserMap;
    private Session session;

    public BookLibrary(ArrayList<Book> availableBooks, ArrayList<Book> checkedOutBooks, Session session) {
        this.availableBooks = availableBooks;
        this.checkedOutBooks = checkedOutBooks;
        bookUserMap = new HashMap<>();
        this.session = session;
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

    public boolean checkOutBooks(String bookNameForCheckOut) {
        Book bookToBeSearched = new Book(bookNameForCheckOut, null, 0);
        for (Book bookBeingMatched : availableBooks) {
            if (bookBeingMatched.equals(bookToBeSearched)) {
                checkedOutBooks.add(bookBeingMatched);
                bookUserMap.put(bookBeingMatched, session.getCurrentUser());
                availableBooks.remove(bookToBeSearched);
                return true;
            }
        }
        return false;
    }

    public boolean returnBook(String nameOfTheBookToBeReturned) {
        Book bookToBeReturned = new Book(nameOfTheBookToBeReturned, null, 0);
        for (Book bookBeingMatched : checkedOutBooks) {
            if (bookBeingMatched.equals(bookToBeReturned)) {
                availableBooks.add(bookBeingMatched);
                checkedOutBooks.remove(bookBeingMatched);
                return true;
            }
        }
        return false;
    }

    public HashMap<Book, User> getBookUserMap() {
        return bookUserMap;
    }
}