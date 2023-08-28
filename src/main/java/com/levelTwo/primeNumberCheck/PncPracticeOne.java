package com.levelTwo.primeNumberCheck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PncPracticeOne {
    // Create a main class accepting a string of arguments
    public static void main(String[] args) {
        // Create a integer array "numbers" with the values to be checked for primes
        int[] numbers = { 2, 3, 11, 13, 21, 53, 71, 561 };

        // Create a integer array "primeNumbers" containing the return value from 'getPrimeNumbers(numbers)' method
        int[] primeNumbers = getPrimeNumbers(numbers);

        // Print the prime numbers in the array using 'Arrays.toString' method
        System.out.println("Prime numbers in the array: " + Arrays.toString(primeNumbers));
    }
    // Create a boolean "isPrime(int number)" method
        public static boolean isPrime(int number) {
            // Handle base cases: if number <= 1 and if number <= 3
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
            // Return true if the above checks come through
            return true;
        }    
        
        // Create a method 'int[] getPrimeNumbers(int[] numbers)' to get an array of prime numbers
        public static int[] getPrimeNumbers(int[] numbers) {

            // Create a list "primeNumberList" to store the prime numbers
            List<Integer> primeNumberList = new ArrayList<>();
            
            // Iterate through each number in the input array 
            for (int number : numbers) {
                // Check if the current number is prime
                if (isPrime(number)) {
                    // If it's prime, add it to the list
                    primeNumberList.add(number);
                }
            }

            // Convert the list of prime numbers to an array with the following steps:
            // Create a new int array 'int[] primeNumbers' in the size of 'primeNumberList' integer array
            int[] primeNumbers = new int[primeNumberList.size()];
            // Create a foor loop to insert the values of the 'primeNumberList' array into the 'primeNumbers' array
            for (int i = 0; i < primeNumbers.length; i++) {
                primeNumbers[i] = primeNumberList.get(i);
            }
            // Return the array of prime numbers 
            return primeNumbers;
        }
}





