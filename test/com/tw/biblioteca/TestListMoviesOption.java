package com.tw.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestListMoviesOption {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldDisplayTheMovieCollection() {
        Movie movie1 = new Movie("Titanic", 1997, "James Cameron", "8.5");
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        MovieLibrary movieLibrary = new MovieLibrary(movies);
        ListMoviesOption listMoviesOption = new ListMoviesOption(movieLibrary);
        listMoviesOption.performOperation();

        assertEquals((String.format("%-20s%-20s%-20s%-20s", "MOVIE", "YEAR OF RELEASE", "DIRECTOR", "RATING") + "\n" + String.format("%-20s%-20s%-20s%-20s", "Titanic", 1997, "James Cameron", "8.5") + "\n"), outContent.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}