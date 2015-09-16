package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestUser {

    @Test
    public void shouldReturnRoleOfUser() {
        User user = new User("123-2345", "user1password", "CUSTOMER");

        assertEquals("CUSTOMER", user.getRole());
    }

    @Test
    public void shouldReturnFalseIfOneOfTheTwoUserObjectsBeingComparedIsNull() {
        User user1 = new User("111-1111", "abcd", "LIBRARIAN");
        User user2 = new User(null, null, null);

        assertEquals(false, user1.equals(user2));
    }

    @Test
    public void shouldReturnFalseIfTheLibraryNumbersAreNotTheSame() {
        User user1 = new User("111-1111", "abcd", "CUSTOMER");
        User user2 = new User("111-2222", "abcd", "CUSTOMER");

        assertEquals(false, user1.equals(user2));
    }

    @Test
    public void shouldReturnFalseIfTwoObjectsBelongToDifferentClassesOrTypes() {
        User user = new User("123-3456", "abcd", "LIBRARIAN");
        Book book = new Book("Harry Potter", "J K Rowling", 1993);

        assertEquals(false, user.equals(book));
    }

    @Test
    public void shouldReturnTrueIFAnObjectIsComparedToItself() {
        User user = new User("123-3456", "abcd", "CUSTOMER");

        assertEquals(true, user.equals(user));
    }

    @Test
    public void shouldReturnTrueIfAndOnlyIfTwoUsersHaveSameLibraryNumberAndPassWord() {
        User user1 = new User("111-1111", "abcd", "CUSTOMER");
        User user2 = new User("111-1111", "abcd", "CUSTOMER");

        assertEquals(true, user1.equals(user2));
    }

    @Test
    public void shouldProduceSameHashCodeForUsersWithSameLibraryNumber() {
        User user1 = new User("111-1111", "abcd", "CUSTOMER");
        User user2 = new User("111-1111", "abcd", "CUSTOMER");

        assertEquals(user1.hashCode(), user2.hashCode());
    }

    @Test
    public void shouldReturnZeroAsHashCodeForAUserWithNullLibraryNumber() {
        User user = new User(null, "abcd", "CUSTOMER");

        assertEquals(0, user.hashCode());
    }
}
