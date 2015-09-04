package com.tw.biblioteca;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BookTest {

    @Test
    public void shouldHaveAValidTitle() {
        Book book = new Book("Twilight", "Stephanie Meyer", "2005");

        assertEquals("Twilight", book.getTitle());
    }

    @Test
    public void shouldHaveAValidAuthorName() {
        Book book = new Book("A Thousand Splendid Suns", "Khaled Hosseini", "2009");

        assertEquals("Khaled Hosseini", book.getAuthor());
    }
}
