package com.in28minutes.functionalprogramming;

import java.util.List;

public class FunctionalProgrammingRunner {
    public static void main(String[] args) {
        List<String> list = List.of("Apple","Bat","Cat","Dog");

        printWithFPWithFilter(list);
    }

    private static void printBasic(List<String> list) {
        for (String string : list) {
            System.out.println(string);
        }
    }

    private static void printBasicWithFilter(List<String> list) {
        for (String string : list) {
            if (string.endsWith("at"));
                System.out.println(string);
        }
    }

    private static void printWithFP(List<String> list) {
        list.stream().forEach(
                element -> System.out.println(element)   // 람다식
        );
    }

    private static void printWithFPWithFilter(List<String> list) {
        list.stream()
                .filter(element -> element.endsWith("at"))
                .forEach(element -> System.out.println(element));   // 람다식
    }

}
