package com.in28minutes.ifstatement.examples;

public class IfStatementRunner {

    public static void main(String[] args) {
        puzzle1();
    }

    private static void puzzle1() {
        int i = 15;
        if (i < 10)
            System.out.println(1);
        else if (i < 20)
            System.out.println(2);
        else if (i < 30)
            System.out.println(3);
        else
            System.out.println(4);
    }

}
