//creates a list of user options and displays it
package com.tw.biblioteca;

import java.util.ArrayList;

public class MenuGenerator {

    private ArrayList<String> optionList;

    MenuGenerator() {
        optionList = new ArrayList<>();
    }

    public ArrayList<String> createOptionList(UserOption userOption) {
        optionList.add(userOption.getUserOption());
        return optionList;
    }

    public void displayOptionList() {
        System.out.println("\n****MAIN MENU****");
        for (String options : optionList) {
            System.out.println(options);
        }
    }
}