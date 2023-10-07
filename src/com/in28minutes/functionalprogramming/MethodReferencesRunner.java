package com.in28minutes.functionalprogramming;

import java.util.List;

public class MethodReferencesRunner {

    private static void print(Integer number) {
        System.out.println(number);
    }
    public static void main(String[] args) {
        // 메소드 참조를 사용하는 이유는 가독성 때문이다.
        List.of("Ant","Bat","Cat","Dog","Elephant").stream()
                .map(s -> s.length())
                .forEach(s -> System.out.println(s));

        List.of("Ant","Bat","Cat","Dog","Elephant").stream()
                .map(String::length)               // 인스턴스::메소드
                .forEach(MethodReferencesRunner::print);     // 클래스::메소드
                        // .forEach(System.out//pringln);도 가능하다
    }
}
