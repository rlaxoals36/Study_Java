package com.in28minutes.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsRunner {

    static <X extends List> void duplicate(X list){
        list.addAll(list);
    }
    public static void main(String[] args) {

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
