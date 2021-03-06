package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestMovie {

    @Test
    public void shouldReturnNameYearDirectorAndRatingOfAMovie() {
        Movie movie = new Movie("Cleopatra", 1999, "Franc Roddam", "6.8");
        assertEquals(String.format("%-20s%-20s%-20s%-20s", "Cleopatra", 1999, "Franc Roddam", "6.8"), movie.getFormattedMovieDetails());
    }

    @Test
    public void shouldReturnTrueIfTheNamesOfTwoMoviesAreTheSame() {
        Movie movie1 = new Movie("Cleopatra", 1999, "Franc Roddam", "6.8");
        Movie movie2 = new Movie("Cleopatra", 1962, "Someone Else", "7.5");

        assertEquals(true, movie1.equals(movie2));
    }

    @Test
    public void shouldReturnFalseIfTheObjectsAreOfDifferentClasses() {
        Book book = new Book("Harry Potter", "J.K. Rowling", 1999);
        Movie movie = new Movie("Cleopatra", 1999, "Franc Roddam", "6.8");

        assertEquals(false, movie.equals(book));
    }

    @Test
    public void shouldReturnTrueIfTwoObjectsAreTheSame() {
        Movie movie = new Movie("Cleopatra", 1999, "Franc Roddam", "6.8");

        assertEquals(true, movie.equals(movie));
    }

    @Test
    public void shouldReturnFalseIfAnObjectIsBeingComparedToNullObject() {
        Movie movie1 = new Movie("Cleopatra", 1999, "Franc Roddam", "6.8");
        Movie movie2 = new Movie(null, 0, null, null);

        assertEquals(false, movie1.equals(movie2));
    }

    @Test
    public void shouldReturnTheSameHashCodeForComparingSameMovieObjects() {
        Movie movie1 = new Movie("Cleopatra", 1999, "Franc Roddam", "6.8");
        Movie movie2 = new Movie("Cleopatra", 1999, "Franc Roddam", "6.8");

        assertEquals(movie1.hashCode(), movie2.hashCode());
    }

    @Test
    public void shouldReturnTheSameHashCodeForComparingMovieObjectsHavingSameMovieName() {
        Movie movie1 = new Movie("Cleopatra", 1999, "Franc Roddam", "6.8");
        Movie movie2 = new Movie("Cleopatra", 1962, "Someone Else", "7.5");

        assertEquals(movie1.hashCode(), movie2.hashCode());
    }

    @Test
    public void shouldReturnDifferentHashCodesForMoviesWithDifferentNames() {
        Movie movie1 = new Movie("Cleopatra", 1999, "Franc Roddam", "6.8");
        Movie movie2 = new Movie("The Sound Of Music", 1962, "Someone Else", "7.5");

        assertNotEquals(movie1.hashCode(), movie2.hashCode());
    }

    @Test
    public void shouldReturnZeroForTheHashCodeOfAMovieWithANullValueForMovieName() {
        Movie movie = new Movie(null, 1999, "Franc Roddam", "6.8");

        assertEquals(0, movie.hashCode());
    }
}