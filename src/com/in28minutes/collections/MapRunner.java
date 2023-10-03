package com.in28minutes.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapRunner {
    public static void main(String[] args) {
        // Hash
        // HashTable
        // 위에 두개는 똑같으나 차이가 있음. HashTable은 Vector처럼 동기화 되어있다.
        // LinkedHash 삽입순서
        // Tree 정렬

        String str = "This is an awesome occasion. " + "This has never happened before.";

        Map<Character, Integer> occurances = new HashMap<>();
        char[] characters = str.toCharArray();
        for (char character : characters) {
            Integer integer = occurances.get(character);
            if (integer == null) {
                occurances.put(character, 1);
            } else {
                occurances.put(character, integer + 1);
            }
        }
        System.out.println(occurances);

        Map<String, Integer> stringOccurances = new HashMap<>();
        String[] words = str.split(" ");
        for (String word : words) {
            Integer integer = stringOccurances.get(word);
            if (integer == null) {
                stringOccurances.put(word, 1);
            } else {
                stringOccurances.put(word, integer + 1);
            }
        }
        System.out.println(stringOccurances);
    }
}
