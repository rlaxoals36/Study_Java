package com.in28minutes.functionalprogramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer> {
    @Override
    public boolean test(Integer number) {
        return number%2==0;
    }
}
class SystemOutConsumer implements Consumer<Integer> {
    @Override
    public void accept(Integer integer) {
        System.out.println(integer);
    }
}
class NumberSquareMapper implements Function<Integer,Integer> {
    @Override
    public Integer apply(Integer integer) {
        return integer*integer;
    }
}
public class LambdaBehindTheScreensRunner {
    public static void main(String[] args) {
        List.of(34,25,45,36).stream()
                .filter(n->n%2==0)
                .map(n -> n*n)
                .forEach(e->System.out.println(e));

        List.of(34,25,45,36).stream()
                .filter(new EvenNumberPredicate())
                .map(new NumberSquareMapper())
                .forEach(new SystemOutConsumer());

        // .filter()
        // Stream<T> filter(Predicate<? super T> predicate);
        // boolean test(T t);

        // .forEach()
        // void forEach(Consumer<? super T> action);
        //  void accept(T t);

        // .map()
        // <R> Stream<R> map(Function<? super T, ? extends R> mapper);
        // R apply(T t);
    }
}
