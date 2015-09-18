//maintains and authenticates user accounts
package com.tw.biblioteca;

import java.util.ArrayList;

public class UserAccountAuthenticator {

    private ArrayList<User> userAccounts = new ArrayList<>();

    public UserAccountAuthenticator() {
        User user1 = new User("111-1111", "user1password", "CUSTOMER", "Elena Gilbert", "elena_gilbert@tvd.com", "+1 2345678901");
        User user2 = new User("222-2222", "user2password", "LIBRARIAN", "Damon Salvatore", "damon.s@tvd.com", "+1 3434345678");
        User user3 = new User("333-3333", "user3password", "CUSTOMER", "Rachel Green", "rachelgreen@friends.com", "+1 4545454567");
        userAccounts.add(user1);
        userAccounts.add(user2);
        userAccounts.add(user3);
    }

    public ArrayList<User> getUserAccounts() {
        return userAccounts;
    }

    public User authenticateUser(String libraryNumber, String password) {
        User guestUser = new User(libraryNumber, password, "GUEST", null, null, null);
        for (User user : userAccounts) {
            if (user.equals(guestUser)) {
                return user;
            }
        }
        return guestUser;
    }
}