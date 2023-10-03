package com.in28minutes.javacoding5;

import static java.lang.Character.isUpperCase;

public class StringMagic {

    public int countUppercaseLetters(String str) {   // 대문자 갯수
        if (str == null)
            return -1;

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i)))
                count++;
        }
        return count;
    }

    public boolean hasConsecutiveDuplicates(String str) {
        if (str.length()==1)
            return false;

        char ch = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {  //adcd
            if (ch == str.charAt(i)) {
                return true;
            } else
                ch = str.charAt(i);
        }
        return false;
    }

    public int getRightmostDigit(String str) {

        for (int i = str.length()-1; i >= 0; i--) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                return Character.getNumericValue(ch);
            }
        }
        return -1;
    }

    public String findLongestWord(String sentence) {
        if(sentence==null || sentence=="")
            return "";

        String[] words = sentence.split(" ");
        int maxLength = 0;
        String longestWord = "";

        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
        }
        return longestWord;
    }

}
