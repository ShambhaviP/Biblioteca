package com.tw.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertNotEquals;

public class TestMainMenu {

    @Test
    public void shouldNotReturnAnEmptyOptionList() {
        UserOption userOption = new UserOption("List Books");
        MainMenu mainMenu = new MainMenu();
        ArrayList<String> optionList = new ArrayList<>();

        assertNotEquals(optionList, mainMenu.createOptionList(userOption));
    }
}
