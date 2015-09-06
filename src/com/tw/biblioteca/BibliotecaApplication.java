//Biblioteca application launcher
package com.tw.biblioteca;

public class BibliotecaApplication {

    public static void main(String args[]) {
        WelcomeMessage welcomeMessage = new WelcomeMessage("\nHello,User!Welcome to Biblioteca!");
        welcomeMessage.showMessage();
        Book book1 = new Book("Twilight", "Stephanie Meyer", 2006);
        Book book2 = new Book("Wuthering Heights", "Emily Bronte", 1777);
        Book book3 = new Book("Oliver Twist", "Charles Dickens", 1790);
        BookList bookList = new BookList();
        bookList.createBookList(book1);
        bookList.createBookList(book2);
        bookList.createBookList(book3);
        bookList.displayColumnHeaders();
        bookList.displayPredefinedBookList();
    }
}
