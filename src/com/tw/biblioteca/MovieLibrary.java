//to get a formatted collection of movies
package com.tw.biblioteca;

import java.util.ArrayList;

public class MovieLibrary {

    private ArrayList<Movie> movies = new ArrayList<>();

    public MovieLibrary(ArrayList<Movie> movies) {
        this.movies = movies;
    }

    public ArrayList<String> getACollectionOfAvailableMovies() {
        ArrayList<String> formattedCollectionOfMovies = new ArrayList<>();
        for (Movie aMovie : movies)
            formattedCollectionOfMovies.add(aMovie.getFormattedMovieDetails());
        return formattedCollectionOfMovies;
    }

    public boolean checkOutMovie(String movieToCheckOut) {
        Movie movieBeingSearched = new Movie(movieToCheckOut, 0, null, null);
        for (Movie movieBeingCompared : movies) {
            if (movieBeingCompared.equals(movieBeingSearched)) {
                movies.remove(movieBeingCompared);
                return true;
            }
        }
        return false;
    }
}