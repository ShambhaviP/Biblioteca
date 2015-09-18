//displays the main menu that appears right after the application is launched
package com.tw.biblioteca;

public class MainMenu {

    private UserOption userOption1;
    private UserOption userOption2;
    private UserOption userOption3;
    private BookLibrary bookLibrary;
    private MovieLibrary movieLibrary;

    public MainMenu(BookLibrary bookLibrary, MovieLibrary movieLibrary) {
        userOption1 = new UserOption("1.Login As A Registered User");
        userOption2 = new UserOption("2.Continue As A Guest");
        userOption3 = new UserOption("3.Quit");
        this.bookLibrary = bookLibrary;
        this.movieLibrary = movieLibrary;
    }

    public void displayMainMenu() {
        while (true) {
            MenuGenerator menuGenerator = new MenuGenerator();
            menuGenerator.createOptionList(userOption1);
            menuGenerator.createOptionList(userOption2);
            menuGenerator.createOptionList(userOption3);
            menuGenerator.displayOptionList();
            ReadUserInput readUserInput = new ReadUserInput();
            MainInputInterpreter mainInputInterpreter = new MainInputInterpreter(bookLibrary, movieLibrary);
            mainInputInterpreter.interpret(readUserInput.read());
        }
    }
}
