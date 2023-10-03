package com.in28minutes.javacoding5;

public class StringMagicRunner {
    public static void main(String[] args) {
        StringMagic stringMagic = new StringMagic();

        int uppercaseLetters = stringMagic.countUppercaseLetters("HeLlo World");

        System.out.println(uppercaseLetters);
        System.out.println(stringMagic.hasConsecutiveDuplicates("hello"));
        System.out.println(stringMagic.getRightmostDigit("hello4 my5 i8n"));
        System.out.println(stringMagic.findLongestWord("a ab abc abcd"));

    }
}
