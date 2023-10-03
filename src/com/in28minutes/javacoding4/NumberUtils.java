package com.in28minutes.javacoding4;

public class NumberUtils {

    public int getLastDigit(int number) {
        if (number < 0 ) {return -1;}

        return number % 10;
    }

    public int getNumberOfDigits(int number) {
        if (number < 0)
            return -1;
        if (number == 0) {
            return 1;
        }

        int count = 0;
        while (number > 0) {
            number = number/10;
            count++;
        }
        return count;
    }

    public int getSumOfDigits(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 0;
        }
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number = number / 10;
        }
        return sum;
    }

    public int reverseNumber(int number) {
        if (number < 0)
            return -1;
        if (number == 0)
            return 0;

        String reverseResult = "";
        while (number > 0) {
            reverseResult += Integer.toString(number%10);
            number = number / 10;
        }
        return Integer.valueOf(reverseResult).intValue();
    }
}
