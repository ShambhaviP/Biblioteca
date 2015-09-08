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
    public void shouldDisplayColumnHeadersForBookDetails() {
        BookList bookList = new BookList();

        assertEquals(("\n-------------------------------------------------------\n"+String.format("%-20s%-20s%-20s", "Title", "Author", "Year Of Publish")+"\n-------------------------------------------------------\n"), bookList.displayColumnHeaders());
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
        ArrayList<String> listOfBooks = new ArrayList<>();
        listOfBooks.add(book1.getFormattedBookDetails());
        listOfBooks.add(book2.getFormattedBookDetails());
        BookList bookList = new BookList(listOfBooks);
        bookList.displayPredefinedBookList();

        assertEquals((String.format("%-20s%-20s%-20d", "Twilight", "Stephanie Meyer", 2006))+"\n"+(String.format("%-20s%-20s%-20d", "Wuthering Heights", "Emily Bronte", 1777))+"\n", outContent.toString());
    }



    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}