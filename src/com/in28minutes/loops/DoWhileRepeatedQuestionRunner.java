package com.in28minutes.loops;

import java.util.Scanner;

public class DoWhileRepeatedQuestionRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = -1;
        do {
            if(number != -1){
                System.out.println("Cubes is: " + (number * number * number));
            }
            System.out.print("Enter a Number: ");
            number = scanner.nextInt();
        } while (number >= 0);
    }
}
