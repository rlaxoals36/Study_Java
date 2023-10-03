package com.in28minutes.javacoding8;

public class MainRunner {
    public static void main(String[] args) {

        StringMagic stringMagic = new StringMagic();
        System.out.println(stringMagic.areAnagrams("Listen","Silent"));

        System.out.println(stringMagic.reverseWordsInSentence("Hello World"));

    }
}
