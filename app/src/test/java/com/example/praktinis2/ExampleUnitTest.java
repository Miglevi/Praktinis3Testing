package com.example.praktinis2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void Given_EmptyText_getCharsCount_ZeroReturned() {
        String givenString = "";
        int expectedValue = 0;
        int actualValue = TextCounter.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void Given_EmptyText_getWordsCount_ZeroReturned() {
        TextCounter tc = new TextCounter();
        String givenString = "";
        int expectedValue = 0;
        int actualValue = tc.getWordsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void Given_NullString_getCharsCount_ZeroReturned() {
        String givenString = null;
        int expectedValue = 0;
        int actualValue = TextCounter.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void Given_NullText_getWordsCount_ZeroReturned() {
        TextCounter tc = new TextCounter();
        String givenString = null;
        int expectedValue = 0;
        int actualValue = tc.getWordsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void Given_FiveCharsString_getCharsCount_ReturnedFive() {
        String givenString = "12345";
        int expectedValue = 5;
        int actualValue = TextCounter.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void Given_TwoWordsText_getWordsCount_ReturnedTwo() {
        TextCounter tc = new TextCounter();
        String givenString = "Labas rytas";
        int expectedValue = 2;
        int actualValue = tc.getWordsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void Given_EmptyCharsStringwithSpaces_getCharsCount_ZeroReturned() {
        String givenString = "   ";
        int expectedValue = 0;
        int actualValue = TextCounter.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void Given_EmptyWordsStringwithSpaces_getWordsCount_ZeroReturned() {
        TextCounter tc = new TextCounter();
        String givenString = "   ";
        int expectedValue = 0;
        int actualValue = tc.getWordsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void Given_CharsStringwithPunctuations_getCharsCount_ZeroReturned() {
        String givenString = ";;; ;;";
        int expectedValue = 5;
        int actualValue = TextCounter.getCharsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
    @Test
    public void Given_WordsStringwithPunctuations_getWordsCount_ZeroReturned() {
        TextCounter tc = new TextCounter();
        String givenString = ";;; ;; ;;";
        int expectedValue = 0;
        int actualValue = tc.getWordsCount(givenString);
        assertEquals(expectedValue, actualValue);
    }
}