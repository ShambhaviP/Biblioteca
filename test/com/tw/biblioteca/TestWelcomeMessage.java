package com.tw.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class TestWelcomeMessage {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldReturnAValidWelcomeMessage() {
        WelcomeMessage welcomeMessage = new WelcomeMessage("Welcome to Biblioteca!");

        welcomeMessage.showMessage();

        assertEquals("Welcome to Biblioteca!\n", outContent.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
}
