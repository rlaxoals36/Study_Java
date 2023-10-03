package com.in28minutes.javacoding6;

import java.util.ArrayList;
import java.util.List;

public class NumberMagic {
    public List<Integer> determineAllFactors(int number) {
        List<Integer> numbers = new ArrayList<>();
        for (int i =1; i <=number; i++){
            if (number%i == 0)
                numbers.add(i);
        }
        return numbers;
    }

    public List<Integer> determineMultiples(int number, int limit) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = number; i <= limit; i++) {
            if (i % number == 0) {
                numbers.add(i);
            }
        }
        return numbers;
    }
}
