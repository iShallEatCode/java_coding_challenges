package com.levelTwo.primeNumberCheck;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of values to check
        System.out.print("Enter the number of values: ");
        int count = scanner.nextInt();

        // Create an integer array with the size of the amount entered by user
        int[] numbers = new int[count];
        System.out.println("Enter the numbers:");

        // Push the inputed integers to be checked for prime into the array
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Get an array containing only the prime numbers from the user input
        int[] primeNumbers = getPrimeNumbers(numbers);

        // Display the prime numbers found in the input
        System.out.println("Prime numbers in the input: " + arrayToString(primeNumbers));

        scanner.close();
    }

    // Check if number is prime
    public static boolean isPrime(int number) {
        // Handle base cases
        if (number <= 1) {
            return false;
        }
        if (number <= 3) {
            return true;
        }
        // Check divisibility by 2 and 3
        if (number % 2 == 0 || number % 3 == 0) {
            return false;
        }
        // Check divisibility by numbers in the form of 6k +- 1
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }
        // If no divisor found, the number is prime
        return true;
    }

    // Get an array of prime numbers from an array of numbers
    public static int[] getPrimeNumbers(int[] numbers) {
        List<Integer> primeNumberList = new ArrayList<>();

        // Iterate through each number in the input array
        for (int number : numbers) {
            // Check if the current number is prime
            if (isPrime(number)) {
                // If it's prime, add it to the list
                primeNumberList.add(number);
            }
        }

        // Convert the list of prime numbers to an array
        return listToArray(primeNumberList);
    }

    // Convert a list of integers to an array
    public static int[] listToArray(List<Integer> list) {
        int[] array = new int[list.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    // Convert an array of integers to a comma-separated string
    public static String arrayToString(int[] array) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            builder.append(array[i]);
            if (i < array.length - 1) {
                builder.append(", ");
            }
        }
        return builder.toString();
    }
    
}
