package com.udemyCourse.sectionFive;

public class SpeedConverter {
    public static long toMilesPerHour(double kmph) {

        if (kmph < 0) {
            return -1;
        } else {
            double average = (double) (kmph / 1.609);
            long roundedAverage = Math.round(average);
            System.out.println(kmph + " km/h = " + roundedAverage + " mi/h");
            return roundedAverage;
        } 
    }

    public static void main(String[] args) {
        toMilesPerHour(25.42);
    }
    
}
