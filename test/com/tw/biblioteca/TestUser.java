package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestUser {

    @Test
    public void shouldReturnLibraryNumber() {
        User user = new User("123-2345", "user1password");

        assertEquals("123-2345", user.getLibraryNumber());
    }

    @Test
    public void shouldReturnPassword() {
        User user = new User("123-2345", "user1password");

        assertEquals("user1password", user.getPassword());
    }

    @Test
    public void shouldReturnFalseIfOneOfTheTwoUserObjectsBeingComparedIsNull() {
        User user1 = new User("111-1111", "abcd");
        User user2 = new User(null, null);

        assertEquals(false, user1.equals(user2));
    }

    @Test
    public void shouldReturnFalseIfTheLibraryNumbersAreNotTheSame() {
        User user1 = new User("111-1111", "abcd");
        User user2 = new User("111-2222", "abcd");

        assertEquals(false, user1.equals(user2));
    }

    @Test
    public void shouldReturnFalseIfTwoObjectsBelongToDifferentClassesOrTypes() {
        User user = new User("123-3456", "abcd");
        Book book = new Book("Harry Potter", "J K Rowling", 1993);

        assertEquals(false, user.equals(book));
    }

    @Test
    public void shouldReturnTrueIFAnObjectIsComparedToItself() {
        User user = new User("123-3456", "abcd");

        assertEquals(true, user.equals(user));
    }

    @Test
    public void shouldReturnTrueIfAndOnlyIfTwoUsersHaveSameLibraryNumberAndPassWord() {
        User user1 = new User("111-1111", "abcd");
        User user2 = new User("111-1111", "abcd");

        assertEquals(true, user1.equals(user2));
    }
}
