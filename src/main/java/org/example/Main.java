package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static Boolean checkPasswordLength(String password) {
        return password.length() >= 8;
    }
}