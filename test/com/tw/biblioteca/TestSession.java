package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSession {

    @Test
    public void shouldReturnCurrentUser() {
        User user = new User("111-1111", "abcd", "CUSTOMER", "Elena Gilbert", "elena_gilbert@tvd.com", "+1 2345678901");
        Session session = new Session(user);

        assertEquals(user, session.getCurrentUser());
    }

    @Test
    public void shouldSetTheLoggedInUserToCurrentUser() {
        User user = new User("111-1111", "abcd", "CUSTOMER", "Elena Gilbert", "elena_gilbert@tvd.com", "+1 2345678901");
        Session session = new Session(user);
        session.setCurrentUser(user);

        assertEquals(user, session.getCurrentUser());
    }
}
