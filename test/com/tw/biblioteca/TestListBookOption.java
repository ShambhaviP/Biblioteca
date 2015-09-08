package com.tw.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;


public class TestListBookOption {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldDisplayColumnHeaders() {
        BookList bookList = new BookList();
        ListBookOption listBookOption = new ListBookOption(bookList);
        listBookOption.performOperation();
        String lineDivider = "\n-------------------------------------------------------\n";

        assertEquals((lineDivider+String.format("%-20s%-20s%-20s", "Title", "Author", "Year Of Publish")+lineDivider+"\n"), outContent.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}