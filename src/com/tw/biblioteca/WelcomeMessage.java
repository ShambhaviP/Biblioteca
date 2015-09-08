//to generate a welcome message for Biblioteca Application
package com.tw.biblioteca;

public class WelcomeMessage {

    private String message;

    WelcomeMessage(String message) {
        this.message = message;
    }

    public void showMessage() {
        System.out.println(message);
    }
}