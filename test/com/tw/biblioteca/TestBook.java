package com.tw.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

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
    public void shouldReturnFalseIfTheObjectsAreOfDifferentClasses() {
        Book book = new Book("Harry Potter", "J.K. Rowling", 1999);
        ArrayList<Book> availableBooks = new ArrayList<>();
        availableBooks.add(book);
        ArrayList<Book> checkedOutBooks = new ArrayList<>();
        BookLibrary bookLibrary = new BookLibrary(availableBooks, checkedOutBooks);

        assertEquals(false, book.equals(bookLibrary));
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

    @Test
    public void shouldReturnDifferentHashcodesForBooksWithDifferentNames() {
        Book book1 = new Book("A tale of two cities", "Charles Dickens", 1790);
        Book book2 = new Book("Oliver Twist", "Charles Dickens", 1790);

        assertNotEquals(book1.hashCode(), book2.hashCode());
    }

    /*@Test
    public void shouldReturnZeroAsHashcodeForComparingWithANullObject() {
        Book book = new Book(null, null, 0);

        assertNotEquals(0, book.hashCode());
    }*/
}