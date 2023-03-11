package org.example;

import org.junit.jupiter.api.Test;
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
    public void checkPasswordLength(String password, Boolean expected) {
        //When
        Boolean actual = Main.checkPasswordLength(password);
        //Then
        assertEquals(expected, actual);
    }
}