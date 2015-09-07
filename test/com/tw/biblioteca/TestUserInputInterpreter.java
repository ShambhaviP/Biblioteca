package com.tw.biblioteca;

import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertEquals;

public class TestUserInputInterpreter {

    @Test
    public void shouldReturnTheIntegerCorrespondingToAValidOptionInMainMenu() {
        System.setIn(new ByteArrayInputStream("1".getBytes()));
        UserInputInterpreter userInputInterpreter = new UserInputInterpreter();
        assertEquals(1, userInputInterpreter.getUserInput());
        System.setIn(System.in);
    }
}
