package com.tw.biblioteca;

import java.util.ArrayList;

public class UserAccountsManager {

    private ArrayList<User> userAccounts = new ArrayList<>();

    public UserAccountsManager() {
        User user1 = new User("111-1111", "user1password");
        User user2 = new User("222-2222", "user2password");
        User user3 = new User("333-3333", "user3password");
        userAccounts.add(user1);
        userAccounts.add(user2);
        userAccounts.add(user3);
    }

    public ArrayList<User> getUserAccounts() {
        return userAccounts;
    }

    public boolean authenticateUser(String libraryNumber, String password) {
        User userToMatch = new User(libraryNumber, password);
        for( User user : userAccounts) {
            if (user.equals(userToMatch)) {
                return true;
            }
        }
        return false;
    }
}
