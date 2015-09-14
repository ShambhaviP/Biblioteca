package com.tw.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestCheckOutBookOption {

    @Test
    public void shouldReturnTheBookNameEnteredByTheUser() {
        ReadUserInput readUserInput = new ReadUserInput();
        ByteArrayInputStream inputStream = new ByteArrayInputStream("Harry Potter".getBytes());
        System.setIn(inputStream);
        String input = readUserInput.read();

        assertEquals("Harry Potter", input);
    }

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldPrintTheSuccessfulCheckOutMessageWhenABookIsCheckedOutSuccessfully() {
        Book book1 = new Book("Harry Potter", "J K Rowling", 1999);
        Book book2 = new Book("The KiteRunner", "Khaled Hosseini", 2005);
        ArrayList<Book> availableBooks = new ArrayList<>();
        availableBooks.add(book1);
        availableBooks.add(book2);
        ArrayList<Book> checkedOutBooks = new ArrayList<>();
        BookLibrary bookLibrary = new BookLibrary(availableBooks, checkedOutBooks);
        CheckOutBookOption checkOutBookOption = new CheckOutBookOption(bookLibrary);
        ByteArrayInputStream inputStream = new ByteArrayInputStream("Harry Potter".getBytes());
        System.setIn(inputStream);
        checkOutBookOption.performOperation();

        assertEquals("Thank You! Enjoy the book.\n", outContent.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setIn(System.in);
    }
}
