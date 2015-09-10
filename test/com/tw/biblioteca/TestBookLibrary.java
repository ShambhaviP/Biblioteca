package com.tw.biblioteca;

import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestBookLibrary {

    @Test
    public void shouldReturnColumnHeadersForBookDetails() {
        BookLibrary bookLibrary = new BookLibrary();

        assertEquals(("\n-------------------------------------------------------\n" + String.format("%-20s%-20s%-20s", "Title", "Author", "Year Of Publish") + "\n-------------------------------------------------------\n"), bookLibrary.getColumnHeaders());
    }

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void shouldReturnALibraryOfBooks() {
        Book book1 = new Book("Twilight", "Stephanie Meyer", 2006);
        Book book2 = new Book("Wuthering Heights", "Emily Bronte", 1777);
        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        BookLibrary bookLibrary = new BookLibrary(books);
        ArrayList<String> booksWithFormattedDetails = new ArrayList<>();
        booksWithFormattedDetails.add(book1.getFormattedBookDetails());
        booksWithFormattedDetails.add(book2.getFormattedBookDetails());

        assertEquals(booksWithFormattedDetails, bookLibrary.getALibraryOfBooks());
    }
}