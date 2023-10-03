package com.in28minutes.javacoding8;

import java.util.Arrays;

public class StringMagic {

    public boolean areAnagrams(String str1, String str2) {

        if (str1 == null || str2 == null)
            return false;

        char[] chars1 = str1.toLowerCase().toCharArray();
        char[] chars2 = str2.toLowerCase().toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        if (Arrays.equals(chars1, chars2)) {
            return true;
        }
        return false;
    }

    public String reverseWordsInSentence(String sentence) {
        if (sentence == null)
            return "INVALID";
        if (sentence.equals(""))
            return "";

        StringBuffer reverseSentence = new StringBuffer();
        for (String word : sentence.split(" ")) {
            StringBuffer reverseWord = new StringBuffer(word).reverse();
            reverseSentence.append(reverseWord).append(" ");
        }
        return reverseSentence.toString().trim();
    }
}
