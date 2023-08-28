package com.challenges;

import java.util.Arrays;
import java.util.List;

public class CountOfEmptyStrings {
    public void printCountOfEmptyStrings() {
        List<String> strings = Arrays.asList("hello", "", "world", "", "java", "");

        long emptyStringsCount = strings.stream().filter(str -> str.isEmpty()).count();

        System.out.println("Count of empty strings: " + emptyStringsCount);
    }
}
