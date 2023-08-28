package com.challenges;

import java.util.Collections;
import java.util.List;

public class LargestSum {
    public int bigSum(List<Integer> nums) {
        Collections.sort(nums, Collections.reverseOrder());

        int largest = nums.get(0);
        int secondLargest = nums.get(1);

        return largest + secondLargest;
    }
    
}
