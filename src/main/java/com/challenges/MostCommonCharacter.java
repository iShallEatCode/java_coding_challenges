package com.challenges;

import java.util.HashMap;
import java.util.Map;

public class MostCommonCharacter {
    public char recurringChar(String str) {
        // Create HashMap to store character frequencies
        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        // Traverse the string and count character occurences
        for (char ch : str.toCharArray()) {
            charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Find the character with the highest frequency
        char mostCommonChar = ' ';
        int maxFrequency = 0;

        for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
            char ch = entry.getKey();
            int frequency = entry.getValue();

            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mostCommonChar = ch;
            }
        } return mostCommonChar;
    }
}
