package com.levelTwo.stringReversal;

import java.util.Scanner;

// This string reversal method uses StringBuilder
 
public class StringReversalMethodOne {
    public static void main(String[] args) {
        // Initiate a Scanner object to take input from the console
        Scanner scanner = new Scanner(System.in);
        boolean continueProcess = true;

        // Call the method to reverse the input string then repeate the scanner input until user chooses not to continue
        do {
            // Call the reverseString method and print the result
            String reversed = reverseString(scanner);
            System.out.println("Reversed String: " + reversed);

            System.out.println("Do you want to continue? (y/n): ");
            String response = scanner.nextLine(); // Read the scanner input
            
            if (response.equalsIgnoreCase("n")) {
                continueProcess = false; // Cancel scanner process
            }
        } while (continueProcess); // Continue scanner process

        scanner.close();
    }

    public static String reverseString(Scanner scanner) {
        // Create a StringBuilder to store the reversed string
        StringBuilder reversed = new StringBuilder();

        System.out.println("Enter the string to be reversed: ");
        String input = scanner.nextLine();

        // Traverse the input string in reverse order
        for (int i = input.length() - 1; i >= 0; i--) {
            // Append each character to the StringBuilder
            reversed.append(input.charAt(i));
        } 
        // Convert the StringBuilder to a String and return
        String convertedString = reversed.toString();
        return convertedString;
    } 
} 
