package com.in28minutes.javacoding6;

public class ArrayMagic {

    public boolean doesHaveElementGreaterThan(int[] array, int number) {

        for (int i : array) {
            if (i>number)
                return true;
        }
        return false;
    }

    public int findSecondLargestElement(int[] array) {
        //1,1,1,1
        if (array.length == 0)
            return -1;

        int firstnum = Integer.MIN_VALUE;
        int secondnum = Integer.MIN_VALUE;
        for (int a : array) {
            if (a > firstnum) {
                secondnum = firstnum;
                firstnum = a;
            } else if (a > secondnum && a != firstnum) {
                secondnum = a;
            }
        }
        if (secondnum == Integer.MIN_VALUE)
            return -1;

        return secondnum;
    }

    public boolean isSorted(int[] array) {
        if (array.length <= 1)
            return true;
        // 1, 2, 3, 4
        for (int i=0; i<array.length-1; i++)
            if (array[i+1] < array[i])
                return false;
        return true;
    }

    public int[] reverseArray(int[] array) {
        if (array.length <= 1)
            return array;

        int a = 0;
        // 1, 2, 3, 4, 5, 6 -> 6, 5, 4, 3, 2, 1
        if (array.length % 2 == 0) {
            for (int i = 0; i < array.length / 2; i++) {
                a = array[i];
                array[i] = array[array.length -1 - i];
                array[array.length -1 - i] = a;
            }
        } else {
            for (int i = 0; i < array.length / 2; i++) {
                a = array[i];
                array[i] = array[array.length -1 - i];
                array[array.length -1 - i] = a;
            }
        }
        return array;
    }
}
