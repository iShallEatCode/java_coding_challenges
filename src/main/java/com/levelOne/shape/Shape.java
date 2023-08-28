package com.levelOne.shape;

// The 'Shape' class is an abstract class representing a geometric shape. 
// It containes two abstract methods, 'calculateArea()' and 'calculatePerimeter()', which are meant to be implemented by its subclasses.

// Abstract classes allow you to define a common interface for a group of related classes while leaving some implementation details to the subclasses.
// In this case, 'Shape' provides a blueprint for different geometric shapes, and 'Circle' is a specific implementation. 

public abstract class Shape {
    // Abstract method for calculating area and perimeter
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}


