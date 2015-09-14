package com.tw.biblioteca;

import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestBookLibrary {

    @Test
    public void shouldReturnColumnHeadersForBookDetails() {
        Book book1 = new Book("Twilight", "Stephanie Meyer", 2006);
        Book book2 = new Book("Wuthering Heights", "Emily Bronte", 1777);
        ArrayList<Book> availableBooks = new ArrayList<>();
        availableBooks.add(book1);
        availableBooks.add(book2);
        ArrayList<Book> checkedOutBooks = new ArrayList<>();
        BookLibrary bookLibrary = new BookLibrary(availableBooks, checkedOutBooks);

        assertEquals(("\n-------------------------------------------------------\n" + String.format("%-20s%-20s%-20s", "Title", "Author", "Year Of Publish") + "\n-------------------------------------------------------\n"), bookLibrary.getColumnHeaders());
    }

    @Test
    public void shouldReturnALibraryOfBooks() {
        Book book1 = new Book("Twilight", "Stephanie Meyer", 2006);
        Book book2 = new Book("Wuthering Heights", "Emily Bronte", 1777);
        ArrayList<Book> availableBooks = new ArrayList<>();
        availableBooks.add(book1);
        availableBooks.add(book2);
        ArrayList<Book> checkedOutBooks = new ArrayList<>();
        BookLibrary bookLibrary = new BookLibrary(availableBooks, checkedOutBooks);
        ArrayList<String> booksWithFormattedDetails = new ArrayList<>();
        booksWithFormattedDetails.add(book1.getFormattedBookDetails());
        booksWithFormattedDetails.add(book2.getFormattedBookDetails());

        assertEquals(booksWithFormattedDetails, bookLibrary.getALibraryOfBooks());
    }

    @Test
    public void shouldAddTheCheckedOutBookToCheckedOutBookList() {
        Book book1 = new Book("Harry Potter", "J K Rowling", 1999);
        Book book2 = new Book("The KiteRunner", "Khaled Hosseini", 2005);
        ArrayList<Book> availableBooks = new ArrayList<>();
        availableBooks.add(book1);
        availableBooks.add(book2);
        ArrayList<Book> checkedOutBooks = new ArrayList<>();
        BookLibrary bookLibrary = new BookLibrary(availableBooks, checkedOutBooks);
        ArrayList<Book> bookListForComparison = new ArrayList<>();
        bookListForComparison.add(book1);
        bookLibrary.checkOutBooks("Harry Potter");

        assertEquals(bookListForComparison, checkedOutBooks);
    }

    @Test
    public void shouldRemoveTheCheckedOutBookFromTheListOfAvailableBooks() {
        Book book1 = new Book("Harry Potter", "J K Rowling", 1999);
        Book book2 = new Book("The KiteRunner", "Khaled Hosseini", 2005);
        ArrayList<Book> availableBooks = new ArrayList<>();
        availableBooks.add(book1);
        availableBooks.add(book2);
        ArrayList<Book> checkedOutBooks = new ArrayList<>();
        BookLibrary bookLibrary = new BookLibrary(availableBooks, checkedOutBooks);
        ArrayList<Book> bookListForComparison = new ArrayList<>();
        bookListForComparison.add(book2);
        bookLibrary.checkOutBooks("Harry Potter");

        assertEquals(bookListForComparison, availableBooks);
    }


    @Test
    public void shouldReturnTrueWhenABookIsCheckedOutSuccessfully() {
        Book book1 = new Book("Harry Potter", "J K Rowling", 1999);
        Book book2 = new Book("The KiteRunner", "Khaled Hosseini", 2005);
        ArrayList<Book> availableBooks = new ArrayList<>();
        availableBooks.add(book1);
        availableBooks.add(book2);
        ArrayList<Book> checkedOutBooks = new ArrayList<>();
        BookLibrary bookLibrary = new BookLibrary(availableBooks, checkedOutBooks);

        assertEquals(true, bookLibrary.checkOutBooks("Harry Potter"));
    }

    @Test
    public void shouldReturnFalseWhenABookIsNotAvailableForCheckout() {
        Book book1 = new Book("Harry Potter", "J K Rowling", 1999);
        Book book2 = new Book("The KiteRunner", "Khaled Hosseini", 2005);
        ArrayList<Book> availableBooks = new ArrayList<>();
        availableBooks.add(book1);
        availableBooks.add(book2);
        ArrayList<Book> checkedOutBooks = new ArrayList<>();
        BookLibrary bookLibrary = new BookLibrary(availableBooks, checkedOutBooks);

        assertEquals(false, bookLibrary.checkOutBooks("Nefertiti"));
    }

    @Test
    public void shouldAddTheBookReturnedByCustomerToTheListOfAvailableBooks() {
        Book book1 = new Book("Harry Potter", "J K Rowling", 1999);
        Book book2 = new Book("The KiteRunner", "Khaled Hosseini", 2005);
        ArrayList<Book> availableBooks = new ArrayList<>();
        availableBooks.add(book1);
        availableBooks.add(book2);
        ArrayList<Book> checkedOutBooks = new ArrayList<>();
        BookLibrary bookLibrary = new BookLibrary(availableBooks, checkedOutBooks);
        bookLibrary.checkOutBooks("Harry Potter");
        bookLibrary.returnBook("Harry Potter");
        ArrayList<Book> bookListForComparison = new ArrayList<>();
        bookListForComparison.add(book2);
        bookListForComparison.add(book1);

        assertEquals(bookListForComparison, availableBooks);
    }

    @Test
    public void shouldReturnTrueForSuccessfulReturnOfABook() {
        Book book1 = new Book("Harry Potter", "J K Rowling", 1999);
        Book book2 = new Book("The KiteRunner", "Khaled Hosseini", 2005);
        ArrayList<Book> availableBooks = new ArrayList<>();
        availableBooks.add(book1);
        availableBooks.add(book2);
        ArrayList<Book> checkedOutBooks = new ArrayList<>();
        BookLibrary bookLibrary = new BookLibrary(availableBooks, checkedOutBooks);
        bookLibrary.checkOutBooks("Harry Potter");

        assertEquals(true, bookLibrary.returnBook("Harry Potter"));
    }

    @Test
    public void shouldReturnFalseForUnsuccessfulReturnOfABook() {
        Book book1 = new Book("Harry Potter", "J K Rowling", 1999);
        Book book2 = new Book("The KiteRunner", "Khaled Hosseini", 2005);
        ArrayList<Book> availableBooks = new ArrayList<>();
        availableBooks.add(book1);
        availableBooks.add(book2);
        ArrayList<Book> checkedOutBooks = new ArrayList<>();
        BookLibrary bookLibrary = new BookLibrary(availableBooks, checkedOutBooks);
        bookLibrary.checkOutBooks("Harry Potter");

        assertEquals(false, bookLibrary.returnBook("Treasure Island"));
    }
}