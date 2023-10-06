package com.in28minutes.functionalprogramming;

import java.util.List;

public class FPNumberRunner {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3,10,4,3,109,56,24);

        int sum = fpSum(numbers);

        numbers.stream().sorted().forEach(e -> System.out.println(e));
        numbers.stream().distinct().sorted().forEach(e -> System.out.println(e));
        numbers.stream().distinct().sorted().map(e->e*e).forEach(e -> System.out.println(e));

    }
    private static int fpSum(List<Integer> numbers) {
        return numbers.stream().reduce(0,(number1,number2) -> number1 + number2);
    }

}
