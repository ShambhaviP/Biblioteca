//reads the movie name entered by user for checkout and performs the checkout
package com.tw.biblioteca;

public class CheckOutMovieOption implements Operations{

    private MovieLibrary movieLibrary;

    public CheckOutMovieOption(MovieLibrary movieLibrary) {
        this.movieLibrary = movieLibrary;
    }

    @Override
    public void performOperation() {
        ReadUserInput readUserInput = new ReadUserInput();
        String movieToCheckOut = readUserInput.read();
        if(movieLibrary.checkOutMovie(movieToCheckOut)) {
            System.out.println("Thank You! Enjoy the movie.");
        }
        else {
            System.out.println("That movie is not available.");
        }
    }
}
