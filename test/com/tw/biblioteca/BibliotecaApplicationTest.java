package com.tw.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class BibliotecaApplicationTest {

    @Test
    public void shouldDisplayWelcomeMessageWhenTheApplicationStarts() {
        BibliotecaApplication bibliotecaApplication = new BibliotecaApplication();

        assertEquals("Welcome To Biblioteca!", bibliotecaApplication.showWelcomeMessage());
    }

    @Test
    public void shouldDisplayMainMenuAfterWelcomeMessage() {
        BibliotecaApplication bibliotecaApplication = new BibliotecaApplication();

        bibliotecaApplication.showWelcomeMessage();
        ArrayList<String> optionList = new ArrayList<>();
        optionList.add("List Books");

        assertEquals(optionList, bibliotecaApplication.showMainMenu());
    }
}
