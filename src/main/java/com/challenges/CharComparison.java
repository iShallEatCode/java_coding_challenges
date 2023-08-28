package com.challenges;

public class CharComparison {
    public int compare(char[] a, char[] b) {

        int minLength = Math.min(a.length, b.length);

        for (int i = 0; i < minLength; i++) {
            if (a[i] < b[i]) {
                return -1;
            }
        }
        if (a.length < b.length) {
            return -1;
        } else if (a.length > b.length) {
            return 1;
        } else {
            return 0;
        }
    }
}
