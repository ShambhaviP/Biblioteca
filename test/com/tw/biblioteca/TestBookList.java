package com.tw.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestBookList {

    @Test
    public void shouldReturnAnArrayListOfBookObjects() {
        Book book1 = new Book("Twilight", "Stephanie Meyer", 2006);
        BookList bookList = new BookList();

        ArrayList<String> booksAvailable = new ArrayList<>();
        booksAvailable.add("Twilight        Stephanie Meyer        2006");

        assertEquals(booksAvailable, bookList.createBookList(book1));
    }

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldDisplayAPreDefinedListOfBooks() {
        Book book1 = new Book("Twilight", "Stephanie Meyer", 2006);
        Book book2 = new Book("Wuthering Heights", "Emily Bronte", 1777);
        BookList bookList = new BookList();

        bookList.createBookList(book1);
        bookList.createBookList(book2);
        bookList.displayPredefinedBookList();

        assertEquals("Twilight        Stephanie Meyer        2006\nWuthering Heights        Emily Bronte        1777\n", outContent.toString());
    }

    @Test
    public void shouldDisplayColumnHeadersForBookDetails() {
        BookList bookList = new BookList();
        bookList.displayColumnHeaders();

        assertEquals("Title        Author        Year Of Publish\n", outContent.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}