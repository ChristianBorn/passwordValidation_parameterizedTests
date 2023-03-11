package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        assert(true);
    }

    public static Boolean checkPasswordLength(String password) {
        return password.length() >= 8;
    }

    public static Boolean checkPasswordNumber(String password) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }

    public static Boolean checkPasswordLowercase(String password) {
        Pattern pattern = Pattern.compile("[a-z]+");
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }

    public static Boolean checkPasswordUppercase(String password) {
        Pattern pattern = Pattern.compile("[A-Z]+");
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }

    public static Boolean validatePassword(String password) {
        return checkPasswordLength(password) &&
                checkPasswordNumber(password) &&
                checkPasswordLowercase(password) &&
                checkPasswordUppercase(password);
    }
}