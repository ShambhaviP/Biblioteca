package com.tw.biblioteca;

import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestMovieLibrary {

    @Test
    public void shouldReturnListOfMovies() {
        Movie movie1 = new Movie("Titanic", 1997, "James Cameron", "8.5");
        Movie movie2 = new Movie("Roman Holiday", 1953, "Willian Wyler", "9.0");
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        MovieLibrary movieLibrary = new MovieLibrary(movies);

        ArrayList<String> moviesWithFormattedDetails = new ArrayList<>();
        moviesWithFormattedDetails.add(movie1.getFormattedMovieDetails());
        moviesWithFormattedDetails.add(movie2.getFormattedMovieDetails());

        assertEquals(moviesWithFormattedDetails, movieLibrary.getACollectionOfAvailableMovies());
    }

    @Test
    public void shouldRemoveTheCheckedOutMovieFromCollectionOfMovies() {
        Movie movie1 = new Movie("Titanic", 1997, "James Cameron", "8.5");
        Movie movie2 = new Movie("Roman Holiday", 1953, "William Wyler", "9.0");
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(movie1);
        movies.add(movie2);
        MovieLibrary movieLibrary = new MovieLibrary(movies);
        ArrayList<Movie> movieCollectionForComparison = new ArrayList<>();
        movieCollectionForComparison.add(movie1);

        movieLibrary.checkOutMovie("Roman Holiday");
        assertEquals(movies, movieCollectionForComparison);
    }
}