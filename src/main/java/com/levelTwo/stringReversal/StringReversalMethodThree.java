package com.levelTwo.stringReversal;

import java.util.Scanner;

// This String Reversal Method uses recursion

public class StringReversalMethodThree {
    public static void main(String[] args) {
        // Inititate a scanner object
        Scanner scanner = new Scanner(System.in);
        boolean continueProcess = true;

        do {
            // Call the reverseString method and print the result
            String reversed = reverseString(scanner);
            System.out.println("Reversed String: " + reversed);
            
            System.out.println("Would you like to continue: Y/N?");
            String response = scanner.nextLine();

            if (response.equalsIgnoreCase("n")) {
                continueProcess = false;
            }
        } while (continueProcess);
        
        scanner.close();
    }

    public static String reverseString(Scanner scanner) {
        System.out.println("Enter the String to be reversed: ");
        String input = scanner.nextLine();
        // Base case: if the input is empty, return it as is
        if (input.isEmpty()) {
            return input;
        }

        // Recursively reverse the substring starting from the second character
        // and append the first character at the end
        String reversedString = (input.substring(1)) + input.charAt(0);
        return reversedString;
    }
}
