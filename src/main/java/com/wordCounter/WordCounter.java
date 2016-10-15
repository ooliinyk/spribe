package com.wordCounter;

import java.util.ArrayList;
import java.util.List;

/**
 * WordCounter is a class to count number of words of the list.
 * @param words is a List of words for counting
 */
public class WordCounter {


    public List<String> words = new ArrayList<String>();

    public WordCounter(List<String> words) {
        this.words = words;
    }

    public WordCounter() {
    }

    /**
     * Add new word to the list
     * @param word is a word that is added to the list.
     */
    public synchronized void addWord(String word) {
        if (word == null || word.equals("")) {
            throw new IllegalArgumentException();
        }
        words.add(word);
    }

    /**
     * Add a list of words to the list
     * @param words is a list words that is added to the list.
     */
    public synchronized void addWords(List<String> words) {
        if (words == null || words.isEmpty()) {
            throw new IllegalArgumentException();
        }
        words.addAll(words);
    }

    /**
     * return counter containing a number of repetitions of the words list
     * @param word is a word that we will count
     * @param counter is a variable to count number of repetitions
     */
    public synchronized int countWords(String word) {
        int counter = 0;

        for (String temp : words) {
            if (temp.toLowerCase().equals(word.toLowerCase())) {
                counter++;
            }
        }
        return counter;
    }

}
