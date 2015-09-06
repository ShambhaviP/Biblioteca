package com.tw.biblioteca;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestUserOption {

    @Test
    public void shouldReturnAnOption() {
        UserOption userOption = new UserOption("List Books");

        assertEquals("List Books", userOption.getUserOption());
    }
}
