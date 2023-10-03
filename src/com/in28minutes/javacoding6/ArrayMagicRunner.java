package com.in28minutes.javacoding6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArrayMagicRunner {
    public static void main(String[] args) {

        ArrayMagic arrayMagic = new ArrayMagic();

        int[] arrays = {4, 5, 6};
        int[][] tempArr = {{1},{2},{3}};
        System.out.println(arrayMagic.doesHaveElementGreaterThan(arrays,3));
        System.out.println(arrayMagic.findSecondLargestElement(arrays));
        System.out.println(arrayMagic.isSorted(arrays));
        System.out.println(Arrays.toString(arrayMagic.reverseArray(arrays)));

        // int[]
        // java 원시 클래스 배열을 쓴다!
        // Arrays.toString()
        // 배열 안에 배열이다!
        // Arrays.deepToString()

        System.out.println(Arrays.deepToString(tempArr));
    }
}
