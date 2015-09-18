package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLogoutOption {

    @Test
    public void shouldSetTheCurrentUserToUndefinedUserWhenCurrentUserLogsOut() {
        User user = new User("111-1111", "user1password", "CUSTOMER");
        Session session = new Session(user);
        LogoutOption logoutOption = new LogoutOption(session);
        logoutOption.performOperation();
        User loggedOutUser = session.getCurrentUser();
        User userForComparison = new User("000-0000", "PASSWORD", "UNDEFINED");

        assertEquals(userForComparison, loggedOutUser);
    }
}
