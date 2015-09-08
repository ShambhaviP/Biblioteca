package com.tw.biblioteca;

import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertEquals;

public class TestReadUserInput {

    @Test
    public void shouldReturnChoiceInputByTheUser() {
        ReadUserInput readUserInput = new ReadUserInput();
        ByteArrayInputStream inputStream = new ByteArrayInputStream("1".getBytes());

        System.setIn(inputStream);
        String input = readUserInput.read();
        System.setIn(System.in);

        assertEquals("1", input);
    }
}
