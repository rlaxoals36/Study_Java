package com.in28minutes.javacoding4;

public class BiNumberRunner {
    public static void main(String[] args) {
        BiNumber biNumber = new BiNumber(16, 24);

        System.out.println(biNumber.calculateLCM()); //최소공배수
        System.out.println(biNumber.calculateGCD()); // 최대공약수
    }
}
