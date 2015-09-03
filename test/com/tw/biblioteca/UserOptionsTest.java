package com.tw.biblioteca;

import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class UserOptionsTest {

    @Test
    public void shouldNotBeAnEmptyOptionList() {
        UserOptions userOptions = new UserOptions();
        ArrayList<String> options = userOptions.createOptionList();

        assertEquals(1, options.size());
    }
}
