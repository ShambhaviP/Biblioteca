package com.tw.biblioteca;

import java.util.Scanner;

public class ReadUserInput {

    private String userInput;

    public String read() {
        Scanner scanner = new Scanner(System.in);
        userInput = scanner.nextLine();
        return userInput;
    }
}
