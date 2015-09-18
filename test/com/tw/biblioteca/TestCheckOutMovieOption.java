package com.tw.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestCheckOutMovieOption {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldDisplayAppropriateMessageOnSuccessfulCheckOutOfAMovie() {
        Movie movie1 = new Movie("Titanic", 1997, "James Cameron", "8.5");
        Movie movie2 = new Movie("Roman Holiday", 1953, "William Wyler", "9.0");
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        MovieLibrary movieLibrary = new MovieLibrary(movies);

        CheckOutMovieOption checkOutMovieOption = new CheckOutMovieOption(movieLibrary);
        ByteArrayInputStream inputStream = new ByteArrayInputStream("Titanic".getBytes());
        System.setIn(inputStream);
        checkOutMovieOption.performOperation();

        assertEquals("Thank You! Enjoy the movie.\n", outContent.toString());
    }

    @Test
    public void shouldDisplayAppropriateMessageOnUnsuccessfulCheckOutOfAMovie() {
        Movie movie1 = new Movie("Titanic", 1997, "James Cameron", "8.5");
        Movie movie2 = new Movie("Roman Holiday", 1953, "William Wyler", "9.0");
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        MovieLibrary movieLibrary = new MovieLibrary(movies);

        CheckOutMovieOption checkOutMovieOption = new CheckOutMovieOption(movieLibrary);
        ByteArrayInputStream inputStream = new ByteArrayInputStream("Fast And Furious".getBytes());
        System.setIn(inputStream);
        checkOutMovieOption.performOperation();

        assertEquals("That movie is not available.\n", outContent.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setIn(System.in);
    }
}