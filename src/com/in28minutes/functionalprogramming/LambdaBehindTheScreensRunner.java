package com.in28minutes.functionalprogramming;

import java.util.List;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer> {
    @Override
    public boolean test(Integer number) {
        return number%2==0;
    }
}
public class LambdaBehindTheScreensRunner {
    public static void main(String[] args) {
        List.of(34,25,45,36).stream()
                .filter(n->n%2==0)
                .forEach(e->System.out.println(e));

        List.of(34,25,45,36).stream()
                .filter(new EvenNumberPredicate())
                .forEach(e->System.out.println(e));

        // Stream<T> filter(Predicate<? super T> predicate);
        // boolean test(T t);
    }
}
