package com.tw.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestUserAccountAuthenticator {

    @Test
    public void shouldHaveAListOfPredefinedUsers() {
        UserAccountAuthenticator userAccountAuthenticator = new UserAccountAuthenticator();
        User user1 = new User("111-1111", "user1password", "CUSTOMER");
        User user2 = new User("222-2222", "user2password", "LIBRARIAN");
        User user3 = new User("333-3333", "user3password", "CUSTOMER");
        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);

        assertEquals(users, userAccountAuthenticator.getUserAccounts());
    }

    @Test
    public void shouldReturnTrueForAuthorisedUser() {
        UserAccountAuthenticator userAccountAuthenticator = new UserAccountAuthenticator();

        assertEquals(true, userAccountAuthenticator.authenticateUser("111-1111", "user1password"));
    }
}