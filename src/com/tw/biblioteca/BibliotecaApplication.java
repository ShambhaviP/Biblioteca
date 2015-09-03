//Biblioteca Application Launcher
package com.tw.biblioteca;

public class BibliotecaApplication {

    public String start() {
        return "Welcome To Biblioteca!";
    }

    public static void main(String args[]) {
        BibliotecaApplication bibliotecaApplication = new BibliotecaApplication();
        bibliotecaApplication.start();
    }
}
