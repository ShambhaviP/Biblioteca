package com.tw.biblioteca;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestBookList {

    @Test
    public void shouldReturnColumnHeadersForBookDetails() {
        BookList bookList = new BookList();

        assertEquals(("\n-------------------------------------------------------\n" + String.format("%-20s%-20s%-20s", "Title", "Author", "Year Of Publish") + "\n-------------------------------------------------------\n"), bookList.getColumnHeaders());
    }

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void shouldReturnALibraryOfBooks() {
        Book book1 = new Book("Twilight", "Stephanie Meyer", 2006);
        Book book2 = new Book("Wuthering Heights", "Emily Bronte", 1777);
        ArrayList<String> books = new ArrayList<>();
        books.add(book1.getFormattedBookDetails());
        books.add(book2.getFormattedBookDetails());
        BookList bookList = new BookList(books);

        assertEquals(books, bookList.getALibraryOfBooks());
    }
}