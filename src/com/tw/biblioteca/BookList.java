//displays a pre-defined book-list
package com.tw.biblioteca;

import java.util.ArrayList;

public class BookList {

    private String columnHeaderForBookTitle;
    private String columnHeaderForAuthor;
    private String columnHeaderForYearOfPublish;
    private ArrayList<String> booksAvailable = new ArrayList<>();

    BookList() {
        columnHeaderForBookTitle = "Title";
        columnHeaderForAuthor = "Author";
        columnHeaderForYearOfPublish = "Year Of Publish";
    }

    public ArrayList<String> createBookList(Book book) {
        booksAvailable.add(book.bookDetails());
        return booksAvailable;
    }

    public void displayColumnHeaders() {
        System.out.println(columnHeaderForBookTitle+"        "+columnHeaderForAuthor+"        "+columnHeaderForYearOfPublish);
    }

    public void displayPredefinedBookList() {
        for (String books : booksAvailable)
            System.out.println(books);
    }
}