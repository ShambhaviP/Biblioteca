package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestUser {

    @Test
    public void shouldReturnRoleOfUser() {
        User user = new User("123-2345", "user1password", "CUSTOMER", "Alice", "alice123@wonderland.com", "+91 8776543245");

        assertEquals("CUSTOMER", user.getRole());
    }

    @Test
    public void shouldReturnFalseIfOneOfTheTwoUserObjectsBeingComparedIsNull() {
        User user1 = new User("111-1111", "abcd", "LIBRARIAN", "Joey", "joey_tribbiani@friends.com", "+91 2345643212");
        User user2 = new User(null, null, null, null, null, null);

        assertEquals(false, user1.equals(user2));
    }

    @Test
    public void shouldReturnFalseIfTheLibraryNumbersAreNotTheSame() {
        User user1 = new User("111-1111", "abcd", "CUSTOMER", "Alice", "alice123@wonderland.com", "+91 8776543245");
        User user2 = new User("111-2222", "abcd", "CUSTOMER", "Alice", "alice123@wonderland.com", "+91 8776543245");

        assertEquals(false, user1.equals(user2));
    }

    @Test
    public void shouldReturnFalseIfTwoObjectsBelongToDifferentClassesOrTypes() {
        User user = new User("123-3456", "abcd", "LIBRARIAN", "Joey", "joey_tribbiani@friends.com", "+91 2345643212");
        Book book = new Book("Harry Potter", "J K Rowling", 1993);

        assertEquals(false, user.equals(book));
    }

    @Test
    public void shouldReturnTrueIFAnObjectIsComparedToItself() {
        User user = new User("123-3456", "abcd", "CUSTOMER", "Alice", "alice123@wonderland.com", "+91 8776543245");

        assertEquals(true, user.equals(user));
    }

    @Test
    public void shouldReturnTrueIfAndOnlyIfTwoUsersHaveSameLibraryNumberAndPassWord() {
        User user1 = new User("111-1111", "abcd", "CUSTOMER", "Alice", "alice123@wonderland.com", "+91 8776543245");
        User user2 = new User("111-1111", "abcd", "CUSTOMER", "Alice", "alice123@wonderland.com", "+91 8776543245");

        assertEquals(true, user1.equals(user2));
    }

    @Test
    public void shouldProduceSameHashCodeForUsersWithSameLibraryNumber() {
        User user1 = new User("111-1111", "abcd", "CUSTOMER", "Alice", "alice123@wonderland.com", "+91 8776543245");
        User user2 = new User("111-1111", "abcd", "CUSTOMER", "Alice", "alice123@wonderland.com", "+91 8776543245");

        assertEquals(user1.hashCode(), user2.hashCode());
    }

    @Test
    public void shouldReturnZeroAsHashCodeForAUserWithNullLibraryNumber() {
        User user = new User(null, "abcd", "CUSTOMER", "Alice", "alice123@wonderland.com", "+91 8776543245");

        assertEquals(0, user.hashCode());
    }

    @Test
    public void shouldReturnLibraryNumberOfUser() {
        User user = new User("123-2345", "user1password", "CUSTOMER", "Alice", "alice123@wonderland.com", "+91 8776543245");

        assertEquals("123-2345", user.getLibraryNumber());
    }

    @Test
    public void shouldReturnUserDetails() {
        User user = new User("123-2345", "user1password", "CUSTOMER", "Alice", "alice123@wonderland.com", "+91 8776543245");

        assertEquals(String.format("%-20s%-20s%-20s%-20s", "123-2345", "Alice", "alice123@wonderland.com", "+91 8776543245"), user.fetchUserInformation());
    }
}
