package com.tw.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;

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

        ArrayList<Book> availableBooks = new ArrayList<>();
        Book book = new Book("Dracula", "Bram Stoker", 1920);
        availableBooks.add(book);
        ArrayList<Book> checkedOutBooks = new ArrayList<>();
        BookLibrary bookLibrary = new BookLibrary(availableBooks, checkedOutBooks);
        InputInterpreter inputInterpreter = new InputInterpreter(bookLibrary);
        inputInterpreter.interpret("1");
        String lineDivider = "\n-------------------------------------------------------\n";

        assertEquals((lineDivider + String.format("%-20s%-20s%-20s", "Title", "Author", "Year Of Publish") + lineDivider + "\n" + String.format("%-20s%-20s%-20s", "Dracula", "Bram Stoker", 1920) + "\n"), outContent.toString());
    }


    @Test
    public void shouldNotifyTheUserWithAMessageWhenAnInvalidOptionIsEntered() {

        Book book = new Book("Dracula", "Bram Stoker", 1920);
        ArrayList<Book> availableBooks = new ArrayList<>();
        availableBooks.add(book);
        ArrayList<Book> checkedOutBooks = new ArrayList<>();
        BookLibrary bookLibrary = new BookLibrary(availableBooks, checkedOutBooks);
        InputInterpreter inputInterpreter = new InputInterpreter(bookLibrary);
        inputInterpreter.interpret("0");

        assertEquals("\nSelect a valid option!\n", outContent.toString());
    }


    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    @Test
    public void shouldPerformASystemExitWhenUserChoosesOptionNumberThreeToQuitApplication() {

        Book book = new Book("Dracula", "Bram Stoker", 1920);
        ArrayList<Book> availableBooks = new ArrayList<>();
        availableBooks.add(book);
        ArrayList<Book> checkedOutBooks = new ArrayList<>();
        BookLibrary bookLibrary = new BookLibrary(availableBooks, checkedOutBooks);
        InputInterpreter inputInterpreter = new InputInterpreter(bookLibrary);

        exit.expectSystemExit();
        inputInterpreter.interpret("3");
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}
