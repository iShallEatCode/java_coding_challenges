package com.challenges;

public class StringReverse {
    public String reverse(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return new StringBuilder(str).reverse().toString();
    }
    
}
