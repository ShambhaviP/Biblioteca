//To have list of valid options for the main menu
package com.tw.biblioteca;

import java.util.ArrayList;

public class UserOptions {

    private ArrayList<String> options;

    UserOptions() {
        options = new ArrayList<String>();
    }

    public ArrayList<String> createOptionList() {
        options.add("List Books");
        return options;
    }

}
