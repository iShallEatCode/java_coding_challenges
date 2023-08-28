package com.challenges;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class AverageOfAllNumbers {
    public void getAverage() {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        IntSummaryStatistics stats = numbers.stream().mapToInt(Integer::intValue).summaryStatistics();

        double average = stats.getAverage();
        System.out.println("Average: " + average);
        
    }
}
