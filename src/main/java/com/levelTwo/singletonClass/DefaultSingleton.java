package com.levelTwo.singletonClass;

// A Java Singleton class is a design pattern that restricts the instantiation of a class to a signle instance and provides a global point of access to that instance.
// It ensures that there is only one instance of the class throughout the application's lifecycle and provides a way to access that that instance from anywhere in the code.  

// Key characteristics of a Java Singleton class:
// Private Constructor: To prevent external instantiation; The class cannot be directly instantiated using the 'new' keyword.
// Static Instance: Maintains a private static instance of itself, which is the only instance that can be accessed. 
// Public Static Method: A method often named 'getInstance()', that returns the single instance.

public class DefaultSingleton {
    // Statick Instance
    private static DefaultSingleton instance;

    private DefaultSingleton() {
        // Private Constructor
    }

    // Public Static Method
    public static DefaultSingleton getInstance() {
        if (instance == null) {
            instance = new DefaultSingleton();
        }
        return instance;
    }
}
