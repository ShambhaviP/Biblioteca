//Biblioteca application launcher
package com.tw.biblioteca;

import java.io.IOException;

public class BibliotecaApplication {

    public static void main(String args[]) throws IOException {
        WelcomeMessage welcomeMessage = new WelcomeMessage("\nHello,User!Welcome to Biblioteca!\n");
        welcomeMessage.showMessage();
        UserOption userOption = new UserOption("1.List Books (Enter 1 to choose this option)");
        MainMenu mainMenu = new MainMenu();
        mainMenu.createOptionList(userOption);
        mainMenu.displayOptionList();
    }
}
