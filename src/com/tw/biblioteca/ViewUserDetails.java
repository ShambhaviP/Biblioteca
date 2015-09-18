package com.tw.biblioteca;

public class ViewUserDetails implements Operations {

    private User user;

    public ViewUserDetails(Session session) {
        this.user = session.getCurrentUser();
    }

    @Override
    public void performOperation() {
        System.out.println(String.format("%-20s%-20s%-20s%-20s", "LIBRARY NUMBER", "NAME", "EMAIL", "PHONE"));
        System.out.println(user.fetchUserInformation());
    }
}