package com.in28minutes.javacoding4;

public class FactorialCalculator {

    public int calculateFactorial(int number) {

        if(number < 0)
            return -1;

        int factorial = 1;
        for (int a = 2; a <= number; a++) {
            factorial *= a;
        }
        return factorial;

    }
}
