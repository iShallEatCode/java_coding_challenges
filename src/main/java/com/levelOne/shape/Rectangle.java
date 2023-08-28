package com.levelOne.shape;

// The 'Rectangle' class is a subclass of 'Shape', representing a rectangle. 
// It has instance variables 'length' and 'width', along with a constructor to initialize them.
// The class implements the abstract methods from the 'Shape' class: 'calculateArea()' and 'calculatePerimeter()'.

// You now have two examples of classes that extend the abstract 'Shape' class, demonstrating the use of inheritance and polymorphism.

public class Rectangle extends Shape {
    // Instance variables to store the dimensions of the rectangle
    private double length;
    private double width;

    // Constructor to initialize the dimensions of the rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getter methods to access the dimensions
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }

    // Implementing abstract methods to calculate the area or the perimeter of the rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
    
}
