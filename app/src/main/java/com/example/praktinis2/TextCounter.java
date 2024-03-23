package com.example.praktinis2;

public class TextCounter {
    public static int getCharsCount(String phrase){
        return phrase.length();
    }

    public int getWordsCount(String phrase){
        return phrase.split("\\s+").length;
    }
}
