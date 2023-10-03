package com.in28minutes.arrays;

import java.math.BigDecimal;
import java.util.Arrays;

public class StudentRunner {
    public static void main(String[] args) {
        Student student = new Student("Ranga", 98,97,100);

        int number = student.getNumberOfMarks();
        int sum = student.getTotalSumOfMarks();
        int maximumMark = student.getMaximumMark();
        int minimumMark = student.getMinimumMark();
        BigDecimal average = student.getAverageMarks();


        System.out.println(number);
        System.out.println(sum);
        System.out.println(maximumMark);
        System.out.println(minimumMark);
        System.out.println(average);
    }
}
