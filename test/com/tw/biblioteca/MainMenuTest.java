package com.tw.biblioteca;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class MainMenuTest {

    @Test
    public void shouldHaveAListOfValidOptions() {
        MainMenu mainMenu = new MainMenu();
        ArrayList<String> optionsList = new ArrayList<>();
        optionsList.add("List Books");

        Assert.assertEquals(optionsList, mainMenu.getOptionList());
    }
}