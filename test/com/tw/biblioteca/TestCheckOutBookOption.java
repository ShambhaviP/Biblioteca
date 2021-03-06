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
        User user = new User("111-1111", "password1", "CUSTOMER", "Elena Gilbert", "elena_gilbert@tvd.com", "+1 2345678901");
        Session session = new Session(user);
        BookLibrary bookLibrary = new BookLibrary(availableBooks, checkedOutBooks, session);
        CheckOutBookOption checkOutBookOption = new CheckOutBookOption(bookLibrary);
        ByteArrayInputStream inputStream = new ByteArrayInputStream("Harry Potter".getBytes());
        System.setIn(inputStream);
        checkOutBookOption.performOperation();

        assertEquals("Thank You! Enjoy the book.\n", outContent.toString());
    }

    @Test
    public void shouldPrintTheUnsuccessfulCheckOutMessageWhenABookIsNotCheckedOutSuccessfully() {
        Book book1 = new Book("Harry Potter", "J K Rowling", 1999);
        Book book2 = new Book("The KiteRunner", "Khaled Hosseini", 2005);
        ArrayList<Book> availableBooks = new ArrayList<>();
        availableBooks.add(book1);
        availableBooks.add(book2);
        ArrayList<Book> checkedOutBooks = new ArrayList<>();
        User user = new User("111-1111", "password1", "CUSTOMER", "Elena Gilbert", "elena_gilbert@tvd.com", "+1 2345678901");
        Session session = new Session(user);
        BookLibrary bookLibrary = new BookLibrary(availableBooks, checkedOutBooks, session);
        CheckOutBookOption checkOutBookOption = new CheckOutBookOption(bookLibrary);
        ByteArrayInputStream inputStream = new ByteArrayInputStream("Anna Karenina".getBytes());
        System.setIn(inputStream);
        checkOutBookOption.performOperation();

        assertEquals("That book is not available.\n", outContent.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setIn(System.in);
    }
}