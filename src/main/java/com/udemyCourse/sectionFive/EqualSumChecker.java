package com.udemyCourse.sectionFive;

// Write a method with three int parameters that should return 'true' if the sum of the 1st and 2nd params is equal to the 3rd param, otherwise return false.

public class EqualSumChecker {

    public static boolean hasEqualSum(int paramOne, int paramTwo, int paramThree) {

        if (paramOne + paramTwo == paramThree) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(hasEqualSum(2, 2, 4));
        System.out.println(hasEqualSum(2, 2, 5));
    }
    
}
