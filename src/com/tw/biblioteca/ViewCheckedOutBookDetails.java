//displays the details of checked-out books
package com.tw.biblioteca;

import java.util.HashMap;

public class ViewCheckedOutBookDetails implements Operations{

    private BookLibrary bookLibrary;

    public ViewCheckedOutBookDetails(BookLibrary bookLibrary) {
        this.bookLibrary = bookLibrary;
    }

    @Override
    public void performOperation() {
        HashMap<Book, User> bookUserMap = bookLibrary.getBookUserMap();
        System.out.println(String.format("%-20s%-20s%-20s%-20s", "CHECKED-OUT BOOK", "AUTHOR", "YEAR OF PUBLISH", "USER" ));
        for (Book book : bookUserMap.keySet()) {
            User user = bookUserMap.get(book);
            System.out.println(book.getFormattedBookDetails() + String.format("%-20s",user.getLibraryNumber()));
        }
    }
}
