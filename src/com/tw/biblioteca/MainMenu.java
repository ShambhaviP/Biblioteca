//creates a list of user options
package com.tw.biblioteca;

import java.util.ArrayList;

public class MainMenu {

    private ArrayList<String> optionList;

    MainMenu() {
        optionList = new ArrayList<>();
    }

    public ArrayList<String> createOptionList(UserOption userOption) {
        optionList.add(userOption.getUserOption());
        return optionList;
    }
}
