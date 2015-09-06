//to create book objects and fetch their details
package com.tw.biblioteca;

public class Book {

    private String bookName;
    private String author;
    private int yearOfPublish;

    Book(String bookName, String author, int yearOfPublish) {
        this.bookName = bookName;
        this.author = author;
        this.yearOfPublish = yearOfPublish;
    }

    public String bookDetails() {
        return bookName+"    "+author+"    "+yearOfPublish;
    }
}
