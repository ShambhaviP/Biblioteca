package com.tw.biblioteca;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BookTest {

    @Test
    public void shouldHaveATitle() {
        Book book = new Book("Twilight", "Stephanie Meyer", "2005");

        assertEquals("Twilight", book.getTitle());
    }
}
