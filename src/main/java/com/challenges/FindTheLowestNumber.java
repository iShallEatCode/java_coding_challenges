package com.challenges;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class FindTheLowestNumber {
    public void printLowestNumber() {

        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 7, 3);

        IntSummaryStatistics stats = numbers.stream().mapToInt(Integer::intValue).summaryStatistics();

        if (stats.getCount() > 0) {
            System.out.println("Lowest number: " + stats.getMin());
        } else {
            System.out.println("List is empty.");
        }
    }
    
}
