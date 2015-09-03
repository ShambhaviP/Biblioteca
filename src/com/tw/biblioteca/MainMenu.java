//Main Menu that appears after welcome message and contains a list of options for the user
package com.tw.biblioteca;

import java.util.ArrayList;

public class MainMenu {

    private ArrayList<String> optionList;

    MainMenu() {
        optionList =new ArrayList<String>();
    }

    public ArrayList<String> getOptionList() {
        UserOptions userOptions = new UserOptions();
        optionList = userOptions.createOptionList();
        return optionList;
    }
}
