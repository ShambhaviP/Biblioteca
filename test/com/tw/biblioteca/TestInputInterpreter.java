package com.tw.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestInputInterpreter {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldDisplayListOfBooksWhenUserEntersOneAsTheChoice() {
        InputInterpreter inputInterpreter = new InputInterpreter();
        ArrayList<String> listOfBooks = new ArrayList<>();
        Book book = new Book("Dracula", "Bram Stoker", 1920);
        listOfBooks.add(book.getFormattedBookDetails());
        BookList bookList = new BookList(listOfBooks);
        ListBookOption listBookOption = new ListBookOption(bookList);
        listBookOption.performOperation();
        String lineDivider = "\n-------------------------------------------------------\n";

        assertEquals((lineDivider + String.format("%-20s%-20s%-20s", "Title", "Author", "Year Of Publish") + lineDivider + "\n" + String.format("%-20s%-20s%-20s", "Dracula", "Bram Stoker", 1920) + "\n"), outContent.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}
