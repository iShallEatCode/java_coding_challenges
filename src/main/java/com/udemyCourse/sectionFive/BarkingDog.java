package com.udemyCourse.sectionFive;

public class BarkingDog {
    
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if (barking == true && hourOfDay < 24 && hourOfDay >= 0 && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 7));
        System.out.println(shouldWakeUp(true, 23));
        System.out.println(shouldWakeUp(false, 12));
        System.out.println(shouldWakeUp(true, 12));
        System.out.println(shouldWakeUp(true, 25));
        System.out.println(shouldWakeUp(true, 0));
        System.out.println(shouldWakeUp(false, 0));
    }
}
