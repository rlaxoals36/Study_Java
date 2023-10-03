package com.in28minutes.selfstudy;

import com.in28minutes.ifstatement.examples.MenuRunner;

import java.util.Scanner;

public class MenuRunnerStudy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number1 : ");
        int number1 = scanner.nextInt();
        System.out.print("Number2 : ");
        int number2 = scanner.nextInt();

        System.out.println("선택하세요");
        System.out.println("1 - add");
        System.out.println("2 - subtract");
        System.out.println("3 - divide");
        System.out.println("4 - multiply");
        System.out.print("선택 : ");
        int choice = scanner.nextInt();

        MenuStudy menuStudy = new MenuStudy(number1,number2);

        if (choice == 1) {
            menuStudy.add();
        } else if (choice == 2) {
            menuStudy.subtract();
        } else if (choice == 3) {
            menuStudy.divide();
        } else if (choice == 4) {
            menuStudy.multiply();
        } else
            System.out.println("다시 선택하세요.");
    }
}
