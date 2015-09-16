//maintains and authenticates user accounts
package com.tw.biblioteca;

import java.util.ArrayList;

public class UserAccountAuthenticator {

    private ArrayList<User> userAccounts = new ArrayList<>();

    public UserAccountAuthenticator() {
        User user1 = new User("111-1111", "user1password", "CUSTOMER");
        User user2 = new User("222-2222", "user2password", "LIBRARIAN");
        User user3 = new User("333-3333", "user3password", "CUSTOMER");
        userAccounts.add(user1);
        userAccounts.add(user2);
        userAccounts.add(user3);
    }

    public ArrayList<User> getUserAccounts() {
        return userAccounts;
    }

    public boolean authenticateUser(String libraryNumber, String password) {
        User userToMatch = new User(libraryNumber, password, null);
        for( User user : userAccounts) {
            if (user.equals(userToMatch)) {
                return true;
            }
        }
        return false;
    }
}
