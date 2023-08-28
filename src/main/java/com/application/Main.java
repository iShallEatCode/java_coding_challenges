package com.application;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.challenges.AverageOfAllNumbers;
import com.challenges.CharComparison;
import com.challenges.CountOfEmptyStrings;
import com.challenges.FindTheLowestNumber;
import com.challenges.InsertPosition;
import com.challenges.Isogram;
import com.challenges.LargestSum;
import com.challenges.MostCommonCharacter;
import com.challenges.PigLatin;
import com.challenges.StringReverse;
import com.challenges.SumOfAllNumbers;
import com.levelOne.company.Person;
import com.levelOne.utility.FileHandler;


public class Main {
    public static void main(String[] args) {
        // RandomNumbersPrinter randomNumbers = new RandomNumbersPrinter();
        // randomNumbers.printRandomNumbers();

        CountOfEmptyStrings emptyStringCount = new CountOfEmptyStrings();
        emptyStringCount.printCountOfEmptyStrings();

        FindTheLowestNumber lowestNumber = new FindTheLowestNumber();
        lowestNumber.printLowestNumber();

        SumOfAllNumbers sum = new SumOfAllNumbers();
        sum.printSum();

        AverageOfAllNumbers average = new AverageOfAllNumbers();
        average.getAverage();

        StringReverse stringReverse = new StringReverse();
        String inputString = "hello";
        String reversedString = stringReverse.reverse(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("Reversed String: " + reversedString);

        LargestSum largestSum = new LargestSum();
        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(2);
        nums.add(8);
        nums.add(1);
        nums.add(9);
        int largestSumValue = largestSum.bigSum(nums);
        System.out.println("The largest sum is: " + largestSumValue);

        PigLatin pigLatin = new PigLatin();
        String inputString2 = "hello";
        String pigLatinString = pigLatin.returnPigLatin(inputString2);
        System.out.println("Pig Latin: " + pigLatinString);

        Isogram isogram = new Isogram();
        String inputString3 = "algorithm";
        boolean isIsogram = isogram.isIsogram(inputString3);
        System.out.println("Isogram: " + isIsogram);

        CharComparison charComparison = new CharComparison();
        char[] a = {'a', 'b', 'c'};
        char[] b = {'a', 'b', 'd'};
        int comparisonResult = charComparison.compare(a, b);
        System.out.println("Comparison result: " + comparisonResult);

        InsertPosition insertPosition = new InsertPosition();
        int[] nums2 = {1, 3, 5, 6};
        int target = 4;
        int insertPositionIndex = insertPosition.searchInsert(nums2, target);
        System.out.println("Insert Position Index: " + insertPositionIndex);

        MostCommonCharacter mostCommonCharacter = new MostCommonCharacter();
        String inputString4 = "hello world";
        char result = mostCommonCharacter.recurringChar(inputString4);
        System.out.println("The most common character is: " + result);

        // Create a new instance of the Person class using the constructor
        Person person1 = new Person("Artem", 26, "123 Main St");

        // Access the methods of the Person class 
        // This is not required since we already have the displayInfo() method
        // String person1Name = person1.getName();
        // int person1Age = person1.getAge();
        // String person1Address = person1.getAddress();

        // Display person's information using the displayInfo() method
        person1.displayInfo();

        // Use the FileHandler class
        String fileName = "src\\main\\java\\com\\application\\example.txt";

        try {
            // Reading from the text file
            String content = FileHandler.readFile(fileName);
            System.out.println("File Content:\n" + content);

            // Writing to the text file
            String newContent = "A second new message.";
            FileHandler.appendToFile(fileName, newContent); // A method to append the new message to the file
            // FileHandler.writeFile(fileName, newContent); // A method to overwrite the file with the new message
            System.out.println("File updated successfully!");
        } catch (IOException e) {
            System.out.println("An error occured: " + e.getMessage());
        }
    }
}