package com.example.praktinis2;

public class TextCounter {
    public static int getCharsCount(String phrase){
        if (phrase == null) {
            return 0;
        }
        phrase = phrase.replaceAll("\\s", "");
        return phrase.length();
    }
    public int getWordsCount(String phrase) {
        if (phrase == null) {
            return 0;
        }
        phrase = phrase.trim();
        if (phrase.isEmpty()) {
            return 0;
        }
        String[] words = phrase.split("\\s+");
        int wordCount = 0;
        for (String word : words) {
            if (!word.isEmpty() && !word.matches("\\p{Punct}+")) {
                wordCount++;
            }
        }
        return wordCount;
    }
}