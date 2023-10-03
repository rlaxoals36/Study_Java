package com.in28minutes.primitive.datatypes;

public class MyCharRunner {

    public static void main(String[] args) {
        MyChar myChar = new MyChar('c');
        System.out.println(myChar.isVowel());    // 모음
        System.out.println(myChar.isConsonant()); // 자음
        System.out.println(myChar.isDigit());
        System.out.println(myChar.isAlphabet());

        MyChar.printLowerCaseAlphabets();
        MyChar.printUpperCaseAlphabets();

    }
}
