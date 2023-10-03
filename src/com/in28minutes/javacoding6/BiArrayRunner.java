package com.in28minutes.javacoding6;

public class BiArrayRunner {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        BiArray biArray = new BiArray(array1,array2);
        System.out.println(biArray.areSumsEqual());
    }
}
