package com.udemyCourse.sectionFive;

// Write a method with two parameters that should return a boolean if the two parameters are the same up to three decimal places.

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {

        int scale = 1000; // Scale factor for three decimal places


        // Casting the doubles into an integer automatically performs casting up to three decimal places
        int scaledOne = (int) (first * scale);
        int scaledTwo = (int) (second * scale);

        return scaledOne == scaledTwo;
    }
    

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
    }
}
