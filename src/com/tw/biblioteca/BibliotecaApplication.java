//Biblioteca Application Launcher
package com.tw.biblioteca;

import java.util.ArrayList;

public class BibliotecaApplication {

    public String showWelcomeMessage() {
        return "Welcome To Biblioteca!";
    }

    public static void main(String args[]) {
        BibliotecaApplication bibliotecaApplication = new BibliotecaApplication();
        System.out.println(bibliotecaApplication.showWelcomeMessage());
        System.out.println(bibliotecaApplication.showMainMenu());
    }

    public ArrayList<String> showMainMenu() {
        MainMenu mainMenu = new MainMenu();
        return mainMenu.getOptionList();
    }
}
