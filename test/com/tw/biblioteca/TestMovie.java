package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMovie {

    @Test
    public void shouldReturnNameYearDirectorAndRatingOfAMovie() {

        Movie movie = new Movie("Cleopatra", 1999, "Franc Roddam", "6.8");

        assertEquals(String.format("%-20s%-20s%-20s%-20s", "Cleopatra", 1999, "Franc Roddam", "6.8"), movie.getFormattedMovieDetails());
    }
}