package com.challenges;

public class PigLatin {
    public String returnPigLatin(String in) {
        if (in == null || in.isEmpty()) {
            return in;
        }
        char firstChar = in.charAt(0);
        String restOfWord = in.substring(1);
        return restOfWord + firstChar + "ay";
    }
    
}
