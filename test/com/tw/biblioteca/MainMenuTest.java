package com.tw.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class MainMenuTest {

    @Test
    public void shouldHaveAListOfValidOptions() {
        MainMenu mainMenu = new MainMenu();
        ArrayList<String> options = new ArrayList<String>();
        options.add("List Books");
        
        assertEquals(options, mainMenu.showOptions());
    }
}