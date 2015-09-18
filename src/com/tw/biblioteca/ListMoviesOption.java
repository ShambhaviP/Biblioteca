//prints the collection of movies
package com.tw.biblioteca;

public class ListMoviesOption implements Operations {

    private MovieLibrary movieLibrary;

    public ListMoviesOption(MovieLibrary movieLibrary) {
        this.movieLibrary = movieLibrary;
    }

    @Override
    public void performOperation() {
        System.out.println(String.format("%-20s%-20s%-20s%-20s", "MOVIE", "YEAR OF RELEASE", "DIRECTOR", "RATING"));
        for (String movies : movieLibrary.getACollectionOfAvailableMovies())
            System.out.println(movies);
    }
}