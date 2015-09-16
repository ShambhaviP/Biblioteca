package com.tw.biblioteca;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestUserAccountsManager {

    @Test
    public void shouldHaveAListOfPredefinedUsers() {
        UserAccountsManager userAccountsManager = new UserAccountsManager();
        User user1 = new User("111-1111", "user1password");
        User user2 = new User("222-2222", "user2password");
        User user3 = new User("333-3333", "user3password");
        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);

        assertEquals(users, userAccountsManager.getUserAccounts());
    }

    @Test
    public void shouldReturnTrueForAuthorisedUser() {
        UserAccountsManager userAccountsManager = new UserAccountsManager();

        assertEquals(true, userAccountsManager.authenticateUser("111-1111", "user1password"));
    }
}