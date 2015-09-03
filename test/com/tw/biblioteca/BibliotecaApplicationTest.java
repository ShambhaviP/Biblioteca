package com.tw.biblioteca;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BibliotecaApplicationTest {

    @Test
    public void shouldDisplayWelcomeMessageWhenTheApplicationStarts() {
        BibliotecaApplication bibliotecaApplication = new BibliotecaApplication();

        assertEquals("Welcome To Biblioteca!", bibliotecaApplication.start());
    }
}
