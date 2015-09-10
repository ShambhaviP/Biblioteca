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
        ArrayList<Book> listOfBooks = new ArrayList<>();
        listOfBooks.add(book1);
        listOfBooks.add(book2);
        listOfBooks.add(book3);
        BookLibrary bookLibrary = new BookLibrary(listOfBooks);
        UserOption userOption1 = new UserOption("1.List Books (Enter 1 to choose this option)");
        UserOption userOption2 = new UserOption("2.Quit (Enter 2 to choose this option)");
        while (true) {
            MainMenu mainMenu = new MainMenu();
            mainMenu.createOptionList(userOption1);
            mainMenu.createOptionList(userOption2);
            mainMenu.displayOptionList();
            ReadUserInput readUserInput = new ReadUserInput();
            InputInterpreter inputInterpreter = new InputInterpreter(bookLibrary);
            inputInterpreter.interpret(readUserInput.read());
        }
    }
}
