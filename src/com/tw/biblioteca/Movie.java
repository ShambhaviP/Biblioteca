//to create instances of movies and their well-formatted details
package com.tw.biblioteca;

public class Movie {

    private String movieName;
    private int yearOfRelease;
    private String director;
    private String rating;

    public Movie(String movieName, int yearOfRelease, String director, String rating) {
        this.movieName = movieName;
        this.yearOfRelease = yearOfRelease;
        this.director = director;
        this.rating = rating;
    }

    public String getFormattedMovieDetails() {
        return String.format("%-20s%-20s%-20s%-20s", movieName, yearOfRelease, director, rating);
    }

    @Override
    public boolean equals(Object that) {
        if (that != null && that.getClass() == this.getClass()) {
            Movie thatMovie = (Movie) that;
            if (this == thatMovie || this.movieName.equals(thatMovie.movieName)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        if (this != null) {
            for (int i = 0; i < movieName.length(); i++) {
                hash = Character.getNumericValue(movieName.charAt(i)) + (hash << 6) + (hash << 16) - hash;
            }
        }
        return hash;
    }
}