//launches Biblioteca Application and sets up the library
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
        BookLibrary bookLibrary = new BookLibrary(availableBooks, checkedOutBooks);

        Movie movie1 = new Movie("Titanic", 1997, "James Cameron", "8.0");
        Movie movie2 = new Movie("Cleopatra", 1999, "Franc Roddam", "7.5");
        Movie movie3 = new Movie("Roman Holiday", 1953, "William Wyler", "8.5");
        ArrayList<Movie> availableMovies = new ArrayList<>();
        availableMovies.add(movie1);
        availableMovies.add(movie2);
        availableMovies.add(movie3);
        MovieLibrary movieLibrary = new MovieLibrary(availableMovies);

        UserOption userOption1 = new UserOption("1.List Books (Enter 1 to choose this option)");
        UserOption userOption2 = new UserOption("2.Checkout A Book (Enter 2 to choose this option)");
        UserOption userOption3 = new UserOption("3.Return A Book (Enter 3 to choose this option)");
        UserOption userOption4 = new UserOption("4.List Movies (Enter 4 to choose this option)");
        UserOption userOption5 = new UserOption("5.Quit (Enter 5 to choose this option)");

        while (true) {
            MainMenu mainMenu = new MainMenu();
            mainMenu.createOptionList(userOption1);
            mainMenu.createOptionList(userOption2);
            mainMenu.createOptionList(userOption3);
            mainMenu.createOptionList(userOption4);
            mainMenu.createOptionList(userOption5);
            mainMenu.displayOptionList();
            ReadUserInput readUserInput = new ReadUserInput();
            InputInterpreter inputInterpreter = new InputInterpreter(bookLibrary, movieLibrary);
            inputInterpreter.interpret(readUserInput.read());
        }
    }
}
