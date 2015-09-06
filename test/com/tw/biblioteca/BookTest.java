package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

   @Test
   public void shouldReturnBookTitleAndAuthorAndYearOfPublish() {
       Book book = new Book("Twilight", "Stephanie Meyer", 2006);

       assertEquals("Twilight        Stephanie Meyer        2006", book.bookDetails());
   }
}