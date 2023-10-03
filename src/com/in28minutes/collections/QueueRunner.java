package com.in28minutes.collections;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return Integer.compare(o1.length(),o2.length());
    }
}

public class QueueRunner {
    public static void main(String[] args) {

        // PriorityOueue는 기본적으로 정렬해준다.
        Queue<String> strings = new PriorityQueue<>();
        strings.addAll(List.of("Zebra","Elephant","Cat","Bear","Alligator"));
        System.out.println(strings);
        System.out.println(strings.poll());
        System.out.println(strings.poll());
        System.out.println(strings.poll());

        // Comparator을 통해서 정렬방법을 정의할 수 있다.
        Queue<String> comparatorStrings = new PriorityQueue<>(new StringLengthComparator());
        comparatorStrings.addAll(List.of("Zebra","Elephant","Cat","Bear","Alligator"));
        System.out.println(comparatorStrings);
        System.out.println(comparatorStrings.poll());
        System.out.println(comparatorStrings.poll());
        System.out.println(comparatorStrings.poll());

    }
}
