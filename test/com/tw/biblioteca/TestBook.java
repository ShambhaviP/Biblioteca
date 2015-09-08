package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBook {

   @Test
   public void shouldReturnBookTitleAndAuthorAndYearOfPublish() {
       Book book = new Book("Twilight", "Stephanie Meyer", 2006);

       assertEquals((String.format("%-20s%-20s%-20d", "Twilight", "Stephanie Meyer", 2006)), book.getFormattedBookDetails());
   }
}