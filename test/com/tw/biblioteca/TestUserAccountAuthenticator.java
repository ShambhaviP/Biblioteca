package com.tw.biblioteca;

import org.junit.Test;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestUserAccountAuthenticator {

    @Test
    public void shouldHaveAListOfPredefinedUsers() {
        UserAccountAuthenticator userAccountAuthenticator = new UserAccountAuthenticator();
        User user1 = new User("111-1111", "user1password", "CUSTOMER", "Elena Gilbert", "elena_gilbert@tvd.com", "+1 2345678901");
        User user2 = new User("222-2222", "user2password", "LIBRARIAN", "Damon Salvatore", "damon.s@tvd.com", "+1 3434345678");
        User user3 = new User("333-3333", "user3password", "CUSTOMER", "Rachel Green", "rachelgreen@friends.com", "+1 4545454567");
        ArrayList<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);

        assertEquals(users, userAccountAuthenticator.getUserAccounts());
    }

    @Test
    public void shouldReturnTheUserForAuthorisedUser() {
        UserAccountAuthenticator userAccountAuthenticator = new UserAccountAuthenticator();
        User user1 = new User("111-1111", "user1password", "CUSTOMER", "Elena Gilbert", "elena_gilbert@tvd.com", "+1 2345678901");

        assertEquals(user1, userAccountAuthenticator.authenticateUser("111-1111", "user1password"));
    }

    @Test
    public void shouldReturnTheUserWithRoleAsGuestForUnauthorisedUser() {
        UserAccountAuthenticator userAccountAuthenticator = new UserAccountAuthenticator();
        User user = new User("000-1111", "invalidPassword", "GUEST", null, null, null);

        assertEquals(user, userAccountAuthenticator.authenticateUser("000-1111", "invalidPassword"));
    }
}