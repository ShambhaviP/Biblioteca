package com.tw.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestBookList {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldDisplayAPreDefinedListOfBooks() {
        ArrayList<String> bookListTestArray = new ArrayList<>();
        bookListTestArray.add("Twilight");
        bookListTestArray.add("Wuthering Heights");
        bookListTestArray.add("Gone With The Wind");
        bookListTestArray.add("Oliver Twist");

        BookList bookList = new BookList();
        bookList.displayPredefinedBookList();

        assertEquals("Twilight\nWuthering Heights\nGone With The Wind\nOliver Twist\n", outContent.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}
