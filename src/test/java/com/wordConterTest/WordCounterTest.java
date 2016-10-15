package com.wordConterTest;

import com.wordCounter.WordCounter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordCounterTest {

    @Test
    public void checkCounter() {

        WordCounter wordCounter = new WordCounter();
        wordCounter.addWord("asd");
        wordCounter.addWord("asd");
        wordCounter.addWord("aSd");
        wordCounter.addWord("aSD");

        wordCounter.addWord("as2d");
        wordCounter.addWord("asd33");
        wordCounter.addWord("asd123");
        assertEquals(wordCounter.countWords("asd"), 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkAdd1(){
        WordCounter wordCounter = new WordCounter();
        wordCounter.addWord("asd");
        wordCounter.addWord("asd");
        wordCounter.addWord("asd");
        wordCounter.addWord("asd");
        wordCounter.addWord("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void checkAdd2(){
        WordCounter wordCounter = new WordCounter();
        wordCounter.addWord("asd");
        wordCounter.addWord("asd");
        wordCounter.addWord("asd");
        wordCounter.addWord("asd");
        wordCounter.addWord(null);
    }


}
