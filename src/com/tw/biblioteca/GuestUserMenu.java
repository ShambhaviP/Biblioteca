//displays the non-exclusive options for a guest user
package com.tw.biblioteca;

public class GuestUserMenu {

    private UserOption userOption1;
    private UserOption userOption2;
    private UserOption userOption3;
    private UserOption userOption4;

    public GuestUserMenu() {
        userOption1 = new UserOption("1.List Books (Enter 1 to choose this option)");
        userOption2 = new UserOption("2.List Movies (Enter 2 to choose this option)");
        userOption3 = new UserOption("3.Checkout A Movie (Enter 3 to choose this option)");
        userOption4 = new UserOption("4.Quit (Enter 4 to choose this option)");
    }

    public void displayOptionsForAGuestUser(BookLibrary bookLibrary, MovieLibrary movieLibrary) {
        while (true) {
            MenuGenerator menuGenerator = new MenuGenerator();
            menuGenerator.createOptionList(userOption1);
            menuGenerator.createOptionList(userOption2);
            menuGenerator.createOptionList(userOption3);
            menuGenerator.createOptionList(userOption4);
            menuGenerator.displayOptionList();
            ReadUserInput readUserInput = new ReadUserInput();
            GuestInputInterpreter guestInputInterpreter = new GuestInputInterpreter(bookLibrary, movieLibrary);
            guestInputInterpreter.interpret(readUserInput.read());
        }
    }
}
