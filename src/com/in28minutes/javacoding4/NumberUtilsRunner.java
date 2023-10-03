package com.in28minutes.javacoding4;

public class NumberUtilsRunner {
    public static void main(String[] args) {
        NumberUtils numberUtils = new NumberUtils();

        System.out.println(numberUtils.getLastDigit(53535));  // 마지막 숫자
        System.out.println(numberUtils.getNumberOfDigits(53535));    // 자릿수
        System.out.println(numberUtils.getSumOfDigits(12345)); // 모든 자릿수의 합
        System.out.println(numberUtils.reverseNumber(123));  // 123 -> 321


    }
}
