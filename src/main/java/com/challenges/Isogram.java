package com.challenges;

import java.util.HashSet;
import java.util.Set;

public class Isogram {
    public boolean isIsogram(String str) {
        Set<Character> seenCharacters = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (seenCharacters.contains(ch)) {
                return false;
            } else {
                seenCharacters.add(ch);
            }
        }
        return true;
    }   
}
