package com.in28minutes.exception.handling;

public class ExceptionHandlingRunner {
    public static void main(String[] args) {
        method1();
        System.out.println("Main");
    }

    private static void method1() {
        String str = null;
        str.length();
        System.out.println("Method1");
    }
}
