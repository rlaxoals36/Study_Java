package com.in28minutes.loops;

public class MyNumberRunner {
    public static void main(String[] args) {
        MyNumber number = new MyNumber(6);

        boolean isPrime = number.isPrime();
        System.out.println("isPrime is " + isPrime);

        int sum = number.sumUptoN();
        System.out.println("sumUptoN is " + sum);

        int sumOfDivisors = number.sumOfDivisors();
        System.out.println("sumOfDivisors is " + sumOfDivisors);

        number.printNumberTriangle();
    }
}
