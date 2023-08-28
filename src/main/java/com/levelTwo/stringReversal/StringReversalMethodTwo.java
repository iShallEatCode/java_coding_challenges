package com.levelTwo.stringReversal;

import java.util.Scanner;

// This string reversal method uses character array

public class StringReversalMethodTwo {
    public static void main(String[] args) {
        // Initialze a Scanner object to take input from the console
        Scanner scanner = new Scanner(System.in);
        // Set scanner loop to true
        boolean continueProcess = true;

        // Scanner loop to read user input to use for the reverseString method
        do {
            // Call the reverseString method and print the result
            String reversed = reverseString(scanner);
            System.out.println("Reversed String: " + reversed);

            System.out.println("Would you like to continue? Y/N: ");
            String response = scanner.nextLine(); // Read user input to the Y/N question

            if (response.equalsIgnoreCase("n")) {
                    continueProcess = false; // Cancel scanner process
            } 
        } while (continueProcess); // Continue scanner process

        scanner.close(); // Close scanner to free the resources
    }

    public static String reverseString(Scanner scanner) {
        System.out.println("Enter the string to be reversed");
        String input = scanner.nextLine();

        // Convert the input string to a character array
        char[] charArray = input.toCharArray();

        // Initialize pointers to swap characters from outer ends to center
        int left = 0;
        int right = input.length() - 1;

        // Swap characters in the character array
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        } 
        // Convert the character array back to a String and return
        String convertedString = new String(charArray);
        return convertedString;
    }
}
