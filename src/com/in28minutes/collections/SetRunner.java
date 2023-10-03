package com.in28minutes.collections;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner  {
    public static void main(String[] args) {
        List<Character> characters = List.of('A', 'Z', 'A', 'B', 'Z', 'F');
        // unique - set(중복된거는 제거함)
        // Hash
        // LinkedHash 삽입순서
        // Tree 정렬

        Set<Character> linkedHashSet = new LinkedHashSet<>(characters);
        System.out.println("LinkedHashSet "+linkedHashSet);

        Set<Character> treeSet = new TreeSet<>(characters);
        System.out.println("TreeSet "+treeSet);

    }
}
