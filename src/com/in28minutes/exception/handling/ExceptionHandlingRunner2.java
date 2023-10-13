package com.in28minutes.exception.handling;

public class ExceptionHandlingRunner2 {
    public static void main(String[] args) {
        method1();
        System.out.println("Main");
    }

    private static void method1() {
        try {
            String str = null;
            str.length();
            System.out.println("Method1");
        } catch (NullPointerException e) {
            System.out.println("Matched NullPointerException");
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Matched IndexOutOfBoundsException");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Matched Exception");
            e.printStackTrace();
        }
    }
}
