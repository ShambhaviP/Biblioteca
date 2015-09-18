package com.tw.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class TestViewUserDetails {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void shouldDisplayUserDetailsOfTheCurrentlyLoggedInUser() {
        User user = new User("111-1111", "password1", "CUSTOMER", "Elena Gilbert", "elena_gilbert@tvd.com", "+1 2345678901");
        Session session = new Session(user);
        ViewUserDetails viewUserDetails = new ViewUserDetails(session);
        viewUserDetails.performOperation();

        assertEquals(String.format("%-20s%-20s%-20s%-20s", "LIBRARY NUMBER", "NAME", "EMAIL", "PHONE")+"\n"+String.format("%-20s%-20s%-20s%-20s", "111-1111", "Elena Gilbert", "elena_gilbert@tvd.com", "+1 2345678901") + "\n", outContent.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
        System.setIn(System.in);
    }
}