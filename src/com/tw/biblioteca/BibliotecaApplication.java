//launches Biblioteca Application ,sets up the library and displays the default menu
package com.tw.biblioteca;

import java.io.IOException;
import java.util.ArrayList;

public class BibliotecaApplication {

    public static void main(String args[]) throws IOException {
        WelcomeMessage welcomeMessage = new WelcomeMessage("\nHello,User!Welcome to Biblioteca!\n");
        welcomeMessage.showMessage();
        Book book1 = new Book("Jane Eyre", "Charlotte Bronte", 1870);
        Book book2 = new Book("Oliver Twist", "Charles Dickens", 1791);
        Book book3 = new Book("Gone with the Wind", "Margaret Mitchell", 1937);
        ArrayList<Book> availableBooks = new ArrayList<>();
        availableBooks.add(book1);
        availableBooks.add(book2);
        availableBooks.add(book3);
        ArrayList<Book> checkedOutBooks = new ArrayList<>();
        User user = new User("111-1111", "password1", "CUSTOMER", "Elena Gilbert", "elena_gilbert@tvd.com", "+1 2345678901");
        Session session = new Session(user);
        BookLibrary bookLibrary = new BookLibrary(availableBooks, checkedOutBooks, session);
        Movie movie1 = new Movie("Titanic", 1997, "James Cameron", "8.0");
        Movie movie2 = new Movie("Cleopatra", 1999, "Franc Roddam", "unrated");
        Movie movie3 = new Movie("Roman Holiday", 1953, "William Wyler", "8.5");
        ArrayList<Movie> availableMovies = new ArrayList<>();
        availableMovies.add(movie1);
        availableMovies.add(movie2);
        availableMovies.add(movie3);
        MovieLibrary movieLibrary = new MovieLibrary(availableMovies);
        MainMenu mainMenu = new MainMenu(bookLibrary, movieLibrary, session);
        mainMenu.displayMainMenu();
    }
}