package com.javarush.task.task22.task2209;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/* 
Составить цепочку слов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String[] words;
        try (BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(console.readLine()))) {
            words = reader.readLine().split(" ");
        }

        StringBuilder result = getLine(words);
        System.out.println(result);
    }

    public static StringBuilder getLine(String[] words) {
        if (words == null || words.length == 0) {
            return new StringBuilder();
        }

        List<String> wordList = new ArrayList<>(Arrays.asList(words));
        StringBuilder chain = new StringBuilder();

        if (wordList.isEmpty()) {
            return chain;
        }

        chain.append(wordList.remove(0));

        boolean changed;
        do {
            changed = false;
            for (int i = 0; i < wordList.size(); i++) {
                String word = wordList.get(i);
                char lastChainChar = Character.toLowerCase(chain.charAt(chain.length() - 1));
                char firstWordChar = Character.toLowerCase(word.charAt(0));

                if (lastChainChar == firstWordChar) {
                    chain.append(" ").append(word);
                    wordList.remove(i);
                    changed = true;
                    break;
                }
            }
            if (!changed && !wordList.isEmpty()) {
                for (int i = 0; i < wordList.size(); i++) {
                    String word = wordList.get(i);
                    char firstChainChar = Character.toLowerCase(chain.charAt(0));
                    char lastWordChar = Character.toLowerCase(word.charAt(word.length() - 1));

                    if (lastWordChar == firstChainChar) {
                        chain.insert(0, word + " ");
                        wordList.remove(i);
                        changed = true;
                        break;
                    }
                }
            }
        } while (changed && !wordList.isEmpty());

        if (!wordList.isEmpty()) {
            for (String word : wordList) {
                chain.append(" ").append(word);
            }
        }

        return chain;
    }
}