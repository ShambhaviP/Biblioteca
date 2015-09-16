package com.tw.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class TestMenuGenerator {

    @Test
    public void shouldNotReturnAnEmptyOptionList() {
        UserOption userOption = new UserOption("List Books");
        MenuGenerator menuGenerator = new MenuGenerator();
        ArrayList<String> optionList = new ArrayList<>();

        assertNotEquals(optionList, menuGenerator.createOptionList(userOption));
    }

    @Test
    public void shouldReturnAValidOptionList() {
        UserOption userOption = new UserOption("List Books");
        MenuGenerator menuGenerator = new MenuGenerator();
        ArrayList<String> optionList = new ArrayList<>();
        optionList.add("List Books");

        assertEquals(optionList, menuGenerator.createOptionList(userOption));
    }

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldDisplayListOfOptionsOnConsole() {
        UserOption userOption = new UserOption("List Books");
        MenuGenerator menuGenerator = new MenuGenerator();
        menuGenerator.createOptionList(userOption);
        menuGenerator.displayOptionList();

        assertEquals("\n****MAIN MENU****\nList Books\n", outContent.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}