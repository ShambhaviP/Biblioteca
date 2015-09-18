//performs logout of a logged in user
package com.tw.biblioteca;

public class LogoutOption implements Operations{

    private Session session;

    public LogoutOption(Session session) {
        this.session = session;
    }

    @Override
    public void performOperation() {
        session.setCurrentUser(new User("000-0000", "PASSWORD", "UNDEFINED"));
    }
}