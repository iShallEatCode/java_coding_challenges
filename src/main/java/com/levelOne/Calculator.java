package com.levelOne;

import java.util.Scanner;

// The 'Calculator' class provides static methods for performing basic arithmetic operations: 'add()', 'subtract()', 'multiply()', and 'divide()'.
// The 'divide()' method checks for division by zero and throws an 'ArithmeticException' if the denominator is zero.
// The 'main()' method interacts with the user, allowing them to enter two numbers and select an operation to perform. 

public class Calculator {
    // Method to perform addition
    public static int add(int num1, int num2) {
        return num1 + num2;
    }
    // Method to perform subtraction
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }
    // Method to perform multiplication
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }
    // Method to perform division
    public static double divide(int num1, int num2) {
        if (num2 != 0) {
            return (double) num1 / num2;
        } else {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }

    // CALCULATOR USER INTERACTION
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Select and operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();

        double calcResult;
        switch (choice) {
            case 1:
                calcResult = add(num1, num2);
                break;
            case 2:
                calcResult = subtract(num1, num2);
                break;
            case 3:
                calcResult = multiply(num1, num2);
                break;
            case 4:
                calcResult = divide(num1, num2);
                break;
            default:
                System.out.println("Invalid choice");;
                scanner.close();
                return;
        }
        System.out.println("Result: " + calcResult);
        
        scanner.close();
    }
}
