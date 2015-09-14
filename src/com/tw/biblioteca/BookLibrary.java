//handles all the tasks related to library
package com.tw.biblioteca;

import java.util.ArrayList;

public class BookLibrary {

    private ArrayList<Book> availableBooks = new ArrayList<>();
    private ArrayList<Book> checkedOutBooks = new ArrayList<>();

    public BookLibrary(ArrayList<Book> availableBooks, ArrayList<Book> checkedOutBooks) {
        this.availableBooks = availableBooks;
        this.checkedOutBooks = checkedOutBooks;
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

    public void checkOutBooks(String bookNameForCheckOut) {

        Book bookToBeSearched = new Book(bookNameForCheckOut, null, 0);
        Book bookFound = new Book(null, null, 0);
        for (Book bookBeingMatched : availableBooks) {
            if (bookBeingMatched.equals(bookToBeSearched)) {
                bookFound = bookBeingMatched;
                checkedOutBooks.add(bookBeingMatched);
                break;
            } else continue;
        }
        if(checkedOutBooks.contains(bookFound)) {
            availableBooks.remove(bookFound);
            System.out.println("Thank you! Enjoy the book.");
        }
        else {
            System.out.println("That book is not available.");
        }
    }

    public void returnBook(String nameOfTheBookToBeReturned) {

        Book bookToBeReturned = new Book(nameOfTheBookToBeReturned, null, 0);
        Book bookFoundInCheckedOutList = new Book(null, null, 0);
        for (Book bookBeingMatched : checkedOutBooks) {
            if (bookBeingMatched.equals(bookToBeReturned)) {
                bookFoundInCheckedOutList = bookBeingMatched;
                availableBooks.add(bookFoundInCheckedOutList);
                break;
            }
            else continue;
        }
        if(availableBooks.contains(bookFoundInCheckedOutList)) {
            checkedOutBooks.remove(bookFoundInCheckedOutList);
            System.out.println("Thank you for returning the book.");
        }
    }
}
