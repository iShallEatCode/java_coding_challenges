package com.udemyCourse.sectionFive;

// Method One: Write a method with three int params and the method should return true if any of the params are within the range 13-19.

// Method Two: Write a method with one int param and the method should return true if the param is within the range 13-19.

public class TeenNumberChecker {

    public static boolean hasTeen(int paramOne, int paramTwo, int paramThree) {

        int[] parameters = { paramOne, paramTwo, paramThree };

        boolean answer = false;

        for (int value : parameters) {

            System.out.println(value);
            answer = ((value >= 13 && value <= 19) ? true : false );
        }
        return answer;
    }


    public static boolean isTeen(int param) {

        boolean answer = ((param >= 13 && param <= 19) ? true : false);
        return answer;
    }

    public static void main(String[] args) {
        // System.out.println(isTeen(12));
        // System.out.println(isTeen(15));

        System.out.println(hasTeen(13, 13, 0));
    }
    
}
