package com.levelTwo.singletonClass;


// This 'Singleton' class has a private constructor, a public variable 'str', and a static method 'getSingleInstance()' that returns the single instance of the class. 
// The static variable 'singleInstance' holds the only instance of the class. 
// When the 'getSingleInstance()' method is called, it creates the instance if it doesn't exist, or returns the existing instance. 


public class Singleton {
    // Private static instance variable
    private static Singleton singleInstance;

    // Public variable
    public String str;

    // Private constructor 
    private Singleton() {
        str = "Hello, I am the Singleton!";
    }

    // Static method to get the single instance
    public static Singleton getSingleInstance() {
        if (singleInstance == null) {
            singleInstance = new Singleton();
        }
        return singleInstance;
    }

    public static void main(String[] args) {
        // Get the single instance of the Singleton class
        Singleton instance1 = Singleton.getSingleInstance();
        Singleton instance2 = Singleton.getSingleInstance();

        // Both instances will refer to the same object
        System.out.println(instance1 == instance2); // Output: true

        // Access the public variable
        System.out.println(instance1.str); // Output: Hello, I am the Singleton!
    }
}
