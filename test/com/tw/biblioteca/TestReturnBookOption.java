package com.tw.biblioteca;

import org.junit.Test;
import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertEquals;

public class TestReturnBookOption {

    @Test
    public void shouldReturnTheNameOfTheBookToBeReturnedAsEnteredByTheUser() {
        ReadUserInput readUserInput = new ReadUserInput();
        ByteArrayInputStream inputStream = new ByteArrayInputStream("Harry Potter".getBytes());

        System.setIn(inputStream);
        String input = readUserInput.read();
        System.setIn(System.in);

        assertEquals("Harry Potter", input);
    }
}
