//interprets the user input for the main menu option
package com.tw.biblioteca;

import java.util.Scanner;

public class UserInputInterpreter {

    private int userInput;

    public int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        userInput = scanner.nextInt();
        return userInput;
    }
}
