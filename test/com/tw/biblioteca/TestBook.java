package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBook {

   @Test
   public void shouldReturnBookTitleAndAuthorAndYearOfPublish() {
       Book book = new Book("Twilight", "Stephanie Meyer", 2006);

       assertEquals((String.format("%-20s%-20s%-20d", "Twilight", "Stephanie Meyer", 2006)), book.getFormattedBookDetails());
   }

    @Test
    public void shouldReturnTrueIfTheNamesOfTwoBooksAreTheSame() {
        Book book1 = new Book("Harry Potter", "J.K. Rowling", 1999);
        Book book2 = new Book("Harry Potter", "Someone else", 1980);

        assertEquals(true, book1.equals(book2));
    }

    @Test
    public void shouldReturnFalseIfTheObjectsAreOfDifferentClass() {
        Book book1 = new Book("Harry Potter", "J.K. Rowling", 1999);
        //Book book2 = new Book("Harry Potter", "Someone else", 1980);
        BookLibrary bookLibrary = new BookLibrary();

        assertEquals(false, book1.equals(bookLibrary));
    }
}