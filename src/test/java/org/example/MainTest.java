package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @ParameterizedTest
    @CsvSource({
            "password, true",
            "passwor, false",
            "password123, true"
    })

    void checkPasswordLength(String password, Boolean expected) {
        //When
        Boolean actual = Main.checkPasswordLength(password);
        //Then
        assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvSource({
            "password, false",
            "passwor, false",
            "pass123word, true",
            "password123, true"
    })
    void checkPasswordNumber(String password, Boolean expected) {
        //When
        Boolean actual = Main.checkPasswordNumber(password);
        //Then
        assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvSource({
            "PASSWORD, false",
            "PASSWoRD, true",
            "PaSSWORD123, true"
    })
    void checkPasswordLowercase(String password, Boolean expected) {
        //When
        Boolean actual = Main.checkPasswordLowercase(password);
        //Then
        assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvSource({
            "password, false",
            "PASSWoRD, true",
            "PaSSWORD123, true"
    })
    void checkPasswordUppercase(String password, Boolean expected) {
        //When
        Boolean actual = Main.checkPasswordUppercase(password);
        //Then
        assertEquals(expected, actual);
    }
}