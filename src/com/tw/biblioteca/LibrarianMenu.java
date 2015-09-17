//displays the exclusive menu for a librarian
package com.tw.biblioteca;

public class LibrarianMenu {

    private UserOption userOption1;
    private UserOption userOption2;
    private UserOption userOption3;
    private UserOption userOption4;
    private UserOption userOption5;
    private UserOption userOption6;
    private UserOption userOption7;

    public LibrarianMenu() {
        userOption1 = new UserOption("1.List Books (Enter 1 to choose this option)");
        userOption2 = new UserOption("2.Checkout A Book (Enter 2 to choose this option)");
        userOption3 = new UserOption("3.Return A Book (Enter 3 to choose this option)");
        userOption4 = new UserOption("4.List Movies (Enter 4 to choose this option)");
        userOption5 = new UserOption("5.Checkout A Movie (Enter 5 to choose this option)");
        userOption6 = new UserOption("6.View Details of Checked-Out Books (Enter 6 to choose this option)");
        userOption7 = new UserOption("7.Quit (Enter 7 to choose this option");
    }

    public void displayOptionsForLibrarian(BookLibrary bookLibrary, MovieLibrary movieLibrary) {
        while (true) {
            MenuGenerator menuGenerator = new MenuGenerator();
            menuGenerator.createOptionList(userOption1);
            menuGenerator.createOptionList(userOption2);
            menuGenerator.createOptionList(userOption3);
            menuGenerator.createOptionList(userOption4);
            menuGenerator.createOptionList(userOption5);
            menuGenerator.createOptionList(userOption6);
            menuGenerator.createOptionList(userOption7);
            menuGenerator.displayOptionList();
            ReadUserInput readUserInput = new ReadUserInput();
            LibrarianInputInterpreter librarianInputInterpreter = new LibrarianInputInterpreter(bookLibrary, movieLibrary);
            librarianInputInterpreter.interpret(readUserInput.read());
        }
    }
}