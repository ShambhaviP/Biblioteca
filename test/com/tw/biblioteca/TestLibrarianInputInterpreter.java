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

public class TestLibrarianInputInterpreter {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldDisplayListOfBooksWhenLibrarianEntersOneAsTheChoice() {
        ArrayList<Book> availableBooks = new ArrayList<>();
        Book book = new Book("Dracula", "Bram Stoker", 1920);
        availableBooks.add(book);
        ArrayList<Book> checkedOutBooks = new ArrayList<>();
        User user = new User("111-1111", "password1", "CUSTOMER", "Elena Gilbert", "elena_gilbert@tvd.com", "+1 2345678901");
        Session session = new Session(user);
        BookLibrary bookLibrary = new BookLibrary(availableBooks, checkedOutBooks, session);
        Movie movie1 = new Movie("Titanic", 1997, "James Cameron", "8.5");
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        MovieLibrary movieLibrary = new MovieLibrary(movies);
        LibrarianInputInterpreter librarianInputInterpreter = new LibrarianInputInterpreter(bookLibrary, movieLibrary, session);
        librarianInputInterpreter.interpret("1");
        String lineDivider = "\n-------------------------------------------------------\n";

        assertEquals((lineDivider + String.format("%-20s%-20s%-20s", "Title", "Author", "Year Of Publish") + lineDivider + "\n" + String.format("%-20s%-20s%-20s", "Dracula", "Bram Stoker", 1920) + "\n"), outContent.toString());
    }

    @Test
    public void shouldNotifyTheLibrarianWithAMessageWhenAnInvalidOptionIsEntered() {
        Book book = new Book("Dracula", "Bram Stoker", 1920);
        ArrayList<Book> availableBooks = new ArrayList<>();
        availableBooks.add(book);
        ArrayList<Book> checkedOutBooks = new ArrayList<>();
        User user = new User("111-1111", "password1", "CUSTOMER", "Elena Gilbert", "elena_gilbert@tvd.com", "+1 2345678901");
        Session session = new Session(user);
        BookLibrary bookLibrary = new BookLibrary(availableBooks, checkedOutBooks, session);
        Movie movie1 = new Movie("Titanic", 1997, "James Cameron", "8.5");
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        MovieLibrary movieLibrary = new MovieLibrary(movies);
        LibrarianInputInterpreter librarianInputInterpreter = new LibrarianInputInterpreter(bookLibrary, movieLibrary, session);
        librarianInputInterpreter.interpret("0");

        assertEquals("\nSelect a valid option!\n", outContent.toString());
    }

    @Test
    public void shouldDisplayACollectionOfMoviesWhenLibrarianChoosesOptionFour() {
        Book book = new Book("Dracula", "Bram Stoker", 1920);
        ArrayList<Book> availableBooks = new ArrayList<>();
        availableBooks.add(book);
        ArrayList<Book> checkedOutBooks = new ArrayList<>();
        User user = new User("111-1111", "password1", "CUSTOMER", "Elena Gilbert", "elena_gilbert@tvd.com", "+1 2345678901");
        Session session = new Session(user);
        BookLibrary bookLibrary = new BookLibrary(availableBooks, checkedOutBooks, session);
        Movie movie1 = new Movie("Titanic", 1997, "James Cameron", "8.5");
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        MovieLibrary movieLibrary = new MovieLibrary(movies);
        LibrarianInputInterpreter librarianInputInterpreter = new LibrarianInputInterpreter(bookLibrary, movieLibrary, session);
        librarianInputInterpreter.interpret("4");

        assertEquals((String.format("%-20s%-20s%-20s%-20s", "MOVIE", "YEAR OF RELEASE", "DIRECTOR", "RATING") + "\n" + String.format("%-20s%-20s%-20s%-20s", "Titanic", 1997, "James Cameron", "8.5") + "\n"), outContent.toString());
    }

    @Test
    public void shouldDisplayTheCheckedOutBookDetailsWhenLibrarianChoosesOptionNumberSix() {
        Book book = new Book("Dracula", "Bram Stoker", 1920);
        ArrayList<Book> availableBooks = new ArrayList<>();
        availableBooks.add(book);
        ArrayList<Book> checkedOutBooks = new ArrayList<>();
        User user = new User("111-1111", "password1", "CUSTOMER", "Elena Gilbert", "elena_gilbert@tvd.com", "+1 2345678901");
        Session session = new Session(user);
        BookLibrary bookLibrary = new BookLibrary(availableBooks, checkedOutBooks, session);
        Movie movie1 = new Movie("Titanic", 1997, "James Cameron", "8.5");
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        MovieLibrary movieLibrary = new MovieLibrary(movies);
        bookLibrary.checkOutBooks("Dracula");
        LibrarianInputInterpreter librarianInputInterpreter = new LibrarianInputInterpreter(bookLibrary, movieLibrary, session);
        librarianInputInterpreter.interpret("6");

        assertEquals(String.format("%-20s%-20s%-20s%-20s%-20s%-20s%-20s", "CHECKED-OUT BOOK", "AUTHOR", "YEAR OF PUBLISH", "USER LIBRARY NUMBER", "NAME", "EMAIL", "PHONE") + "\n" + String.format("%-20s%-20s%-20s%-20s%-20s%-20s%-20s", "Dracula", "Bram Stoker", 1920, "111-1111", "Elena Gilbert", "elena_gilbert@tvd.com", "+1 2345678901       " + "\n"), outContent.toString());
    }

    @Test
    public void shouldDisplayTheLibrarianPersonalDetailsWhenSheChoosesOptionNumberSeven() {
        ArrayList<Book> availableBooks = new ArrayList<>();
        Book book = new Book("Dracula", "Bram Stoker", 1920);
        availableBooks.add(book);
        ArrayList<Book> checkedOutBooks = new ArrayList<>();
        User user = new User("222-2222", "user2password", "LIBRARIAN", "Damon Salvatore", "damon.s@tvd.com", "+1 3434345678");
        Session session = new Session(user);
        BookLibrary bookLibrary = new BookLibrary(availableBooks, checkedOutBooks, session);
        Movie movie1 = new Movie("Titanic", 1997, "James Cameron", "8.5");
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        MovieLibrary movieLibrary = new MovieLibrary(movies);
        LibrarianInputInterpreter librarianInputInterpreter = new LibrarianInputInterpreter(bookLibrary, movieLibrary, session);
        librarianInputInterpreter.interpret("7");

        assertEquals(String.format("%-20s%-20s%-20s%-20s", "LIBRARY NUMBER", "NAME", "EMAIL", "PHONE")+"\n"+String.format("%-20s%-20s%-20s%-20s", "222-2222", "Damon Salvatore", "damon.s@tvd.com", "+1 3434345678") + "\n", outContent.toString());
    }

    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    @Test
    public void shouldPerformASystemExitWhenLibrarianChoosesOptionNumberNineToQuitApplication() {
        Book book = new Book("Dracula", "Bram Stoker", 1920);
        ArrayList<Book> availableBooks = new ArrayList<>();
        availableBooks.add(book);
        ArrayList<Book> checkedOutBooks = new ArrayList<>();
        User user = new User("111-1111", "password1", "CUSTOMER", "Elena Gilbert", "elena_gilbert@tvd.com", "+1 2345678901");
        Session session = new Session(user);
        BookLibrary bookLibrary = new BookLibrary(availableBooks, checkedOutBooks, session);
        Movie movie1 = new Movie("Titanic", 1997, "James Cameron", "8.5");
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        MovieLibrary movieLibrary = new MovieLibrary(movies);
        LibrarianInputInterpreter librarianInputInterpreter = new LibrarianInputInterpreter(bookLibrary, movieLibrary, session);

        exit.expectSystemExit();
        librarianInputInterpreter.interpret("9");
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}