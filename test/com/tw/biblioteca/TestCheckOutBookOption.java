package com.tw.biblioteca;

import org.junit.Test;
import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertEquals;

public class TestCheckOutBookOption {

    @Test
    public void shouldReturnTheBookNameEnteredByTheUser() {
        ReadUserInput readUserInput = new ReadUserInput();
        ByteArrayInputStream inputStream = new ByteArrayInputStream("Harry Potter".getBytes());

        System.setIn(inputStream);
        String input = readUserInput.read();
        System.setIn(System.in);

        assertEquals("Harry Potter", input);
    }
}
