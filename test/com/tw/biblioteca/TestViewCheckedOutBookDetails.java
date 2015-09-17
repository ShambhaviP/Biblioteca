package com.tw.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class TestViewCheckedOutBookDetails {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldDisplayWhichBookWasCheckedOutByWhichUser() {
        Book book1 = new Book("Harry Potter", "J K Rowling", 1999);
        Book book2 = new Book("The KiteRunner", "Khaled Hosseini", 2005);
        ArrayList<Book> availableBooks = new ArrayList<>();
        availableBooks.add(book1);
        availableBooks.add(book2);
        ArrayList<Book> checkedOutBooks = new ArrayList<>();
        User user = new User("111-1111", "password1", "CUSTOMER");
        Session session = new Session(user);
        BookLibrary bookLibrary = new BookLibrary(availableBooks, checkedOutBooks, session);
        bookLibrary.checkOutBooks("Harry Potter");
        HashMap<Book, User> bookUserHashMap = new HashMap<>();
        bookUserHashMap.put(book1, user);

        ViewCheckedOutBookDetails viewCheckedOutBookDetails = new ViewCheckedOutBookDetails(bookLibrary);
        viewCheckedOutBookDetails.DisplayDetailsOfCheckedOutBooks();

        assertEquals(String.format("%-20s%-20s%-20s%-20s", "CHECKED-OUT BOOK", "AUTHOR", "YEAR OF PUBLISH", "USER") + "\n" + String.format("%-20s%-20s%-20s%-20s", "Harry Potter", "J K Rowling", 1999, "111-1111            "+"\n"), outContent.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setIn(System.in);
    }
}
