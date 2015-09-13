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
        BookLibrary bookLibrary = new BookLibrary();

        assertEquals(false, book1.equals(bookLibrary));
    }

    @Test
    public void shouldReturnFalseIfTheObjectBeingComparedIsNull() {
        Book book1 = new Book("Harry Potter", "J.K. Rowling", 1999);
        Book book2 = new Book(null, null, 0);

        assertEquals(false, book1.equals(book2));
    }

    @Test
    public void shouldReturnTrueIfTwoObjectsAreTheSame() {
        Book book = new Book("Harry Potter", "J.K. Rowling", 1999);

        assertEquals(true, book.equals(book));
    }

    @Test
    public void shouldReturnTheSameHashCodeForComparingSameBookObjects() {
        Book book1 = new Book("Harry Potter", "J.K. Rowling", 1999);
        Book book2 = new Book("Harry Potter", "J.K. Rowling", 1999);

        assertEquals(book1.hashCode(), book2.hashCode());
    }

    @Test
    public void shouldReturnTheSameHashcodeForComparingBookObjectsHavingSameBookName() {
        Book book1 = new Book("Harry Potter", "J.K. Rowling", 1999);
        Book book2 = new Book("Harry Potter", "Someone else", 1920);

        assertEquals(book1.hashCode(), book2.hashCode());
    }
}