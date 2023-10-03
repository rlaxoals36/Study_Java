package com.in28minutes.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsRunner {

    static double sumOfNumberList(List<? extends Number> numbers) { // 상한 경계
        double sum = 0.0;
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    static void addACoupleOfValues(List<? super Number> numbers) { // 하한 경
        numbers.add(1);
        numbers.add(1.0);
        numbers.add(1L);
        numbers.add(1.0f);
    }

    static <X extends List> void duplicate(X list){
        list.addAll(list);
    }
    public static void main(String[] args) {

        System.out.println(sumOfNumberList(List.of(1,2,3,4,5)));
        System.out.println(sumOfNumberList(List.of(1.1,2.1,3.1,4.1,5.1)));
        System.out.println(sumOfNumberList(List.of(1L,2L,3L,4L,5L)));

        List emptyList = new ArrayList<Number>();
        addACoupleOfValues(emptyList);
        System.out.println(emptyList);

        ArrayList<Integer> numbers = new ArrayList<>(List.of(1, 2, 3));
        duplicate(numbers);
        System.out.println(numbers);

        MyCustomList<String> list = new MyCustomList<>();
        list.addElement("Element 1");
        list.addElement("Element 2");
        list.removeElement("Element 2");
        String value = list.get(0);
        System.out.println(list);

        MyCustomList<Integer> list2 = new MyCustomList<>();
        list2.addElement(5);
        list2.addElement(Integer.valueOf(6));
        Integer number = list2.get(0);
        System.out.println(number);
    }
}
