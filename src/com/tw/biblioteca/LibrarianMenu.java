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
    private UserOption userOption8;
    private UserOption userOption9;

    public LibrarianMenu() {
        userOption1 = new UserOption("1.List Books (Enter 1 to choose this option)");
        userOption2 = new UserOption("2.Checkout A Book (Enter 2 to choose this option)");
        userOption3 = new UserOption("3.Return A Book (Enter 3 to choose this option)");
        userOption4 = new UserOption("4.List Movies (Enter 4 to choose this option)");
        userOption5 = new UserOption("5.Checkout A Movie (Enter 5 to choose this option)");
        userOption6 = new UserOption("6.View Details of Checked-Out Books (Enter 6 to choose this option)");
        userOption7 = new UserOption("7.View Your Profle (Enter 7 to choose this option)");
        userOption8 = new UserOption("8.Log Out (Enter 8 to choose this option)");
        userOption9 = new UserOption("9.Quit (Enter 9 to choose this option)");
    }

    public void displayOptionsForLibrarian(BookLibrary bookLibrary, MovieLibrary movieLibrary, Session session) {
        while (true) {
            MenuGenerator menuGenerator = new MenuGenerator();
            menuGenerator.createOptionList(userOption1);
            menuGenerator.createOptionList(userOption2);
            menuGenerator.createOptionList(userOption3);
            menuGenerator.createOptionList(userOption4);
            menuGenerator.createOptionList(userOption5);
            menuGenerator.createOptionList(userOption6);
            menuGenerator.createOptionList(userOption7);
            menuGenerator.createOptionList(userOption8);
            menuGenerator.createOptionList(userOption9);
            menuGenerator.displayOptionList();
            ReadUserInput readUserInput = new ReadUserInput();
            LibrarianInputInterpreter librarianInputInterpreter = new LibrarianInputInterpreter(bookLibrary, movieLibrary, session);
            librarianInputInterpreter.interpret(readUserInput.read());
        }
    }
}