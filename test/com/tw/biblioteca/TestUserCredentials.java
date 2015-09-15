package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestUserCredentials {

    @Test
    public void shouldReturnLibraryNumber() {
        UserCredentials userCredentials = new UserCredentials("123-2345", "user1password");

        assertEquals("123-2345", userCredentials.getLibraryNumber());
    }

    @Test
    public void shouldReturnPassword() {
        UserCredentials userCredentials = new UserCredentials("123-2345", "user1password");

        assertEquals("user1password", userCredentials.getPassword());
    }
}
