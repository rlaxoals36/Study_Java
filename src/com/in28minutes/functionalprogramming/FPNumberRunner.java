package com.in28minutes.functionalprogramming;

import java.util.List;
import java.util.stream.Collectors;

public class FPNumberRunner {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3,10,4,3,109,56,24);

        int sum = fpSum(numbers);

        numbers.stream().sorted().forEach(e -> System.out.println(e));
        numbers.stream().distinct().sorted().forEach(e -> System.out.println(e));
        numbers.stream().distinct().sorted().map(e->e*e).forEach(e -> System.out.println(e));

        numbers.stream().max((n1,n2) -> Integer.compare(n1,n2)).get();
        numbers.stream().min((n1,n2) -> Integer.compare(n1,n2)).get();
        numbers.stream().filter(e -> e%2==1).collect(Collectors.toList());


    }
    private static int fpSum(List<Integer> numbers) {
        return numbers.stream().reduce(0,(number1,number2) -> number1 + number2);
    }

}
