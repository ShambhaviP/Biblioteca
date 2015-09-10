//to create book objects and fetch their details
package com.tw.biblioteca;

public class Book {

    private String bookName;
    private String author;
    private int yearOfPublish;

    public Book(String bookName, String author, int yearOfPublish) {
        this.bookName = bookName;
        this.author = author;
        this.yearOfPublish = yearOfPublish;
    }

    public String getFormattedBookDetails() {
        return String.format("%-20s%-20s%-20d", bookName, author, yearOfPublish);
    }

    @Override
    public boolean equals(Object that) {
        if (that != null && that.getClass() == this.getClass()) {
            Book thatBook = (Book) that;
            if (this == thatBook || this.bookName.equals(thatBook.bookName)) {
                return true;
            }
        }
        return false;
    }
}
