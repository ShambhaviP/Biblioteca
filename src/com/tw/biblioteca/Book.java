//creates book objects that have their title,author name,and the year of publishing
package com.tw.biblioteca;

public class Book {

    private String title;
    private String author;
    private String year;

    Book(String title, String author, String year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getYear() {
        return year;
    }
}
