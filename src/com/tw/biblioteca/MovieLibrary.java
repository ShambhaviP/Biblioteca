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
}