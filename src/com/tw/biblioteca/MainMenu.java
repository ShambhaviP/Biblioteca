//Main Menu that appears after welcome message and contains a list of options for the user
package com.tw.biblioteca;

import java.util.ArrayList;

public class MainMenu {

    private ArrayList<String> options;

    MainMenu() {
        options = new ArrayList<>();
        options.add("List Books");
    }

    public ArrayList<String> showOptions() {
        return options;
    }
}
