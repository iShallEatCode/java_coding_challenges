package com.levelTwo.primeNumberCheck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Program to determine whether a number is prime or not.
// The program accepts an array of numbers, then iterates through the array and returns only the prime numbers.

public class SimplifiedVersion {
    public static void main(String[] args) {
        int[] numbers = { 8, 13, 14, 23, 71 };

        // Get an array containing only the prime numbers from the input array
        int[] primeNumbers = getPrimeNumbers(numbers);

        // Print the prime numbers in the array
        System.out.println("Prime numbers in the array: " + Arrays.toString(primeNumbers));
    }

    // Check if a number is prime
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
            System.out.println(i);
            if (number % i == 0 || number % (i + 2) == 0) {
                System.out.println(i);
                return false;
            }
        }
        // If no divisor found, the number is prime
        return true;
    }

    // Get an array of prime numbers from an array of numbers
    public static int[] getPrimeNumbers(int[] numbers) {
        // Create a list to store the prime numbers
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
        int[] primeNumbers = new int[primeNumberList.size()];
        for (int i = 0; i < primeNumbers.length; i++) {
            primeNumbers[i] = primeNumberList.get(i);
        }
        // Return the array of prime numbers
        return primeNumbers;        
    }
    
}
