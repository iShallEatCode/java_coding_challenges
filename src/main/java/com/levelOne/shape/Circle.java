package com.levelOne.shape;

// The 'Circle' class is a subclass of 'Shape', representing a circle. 
// It has an instance variable 'radius' and a constructor to initialize it. 
// The class implements the abstract methods from the 'Shape' class: 'calculateArea()' and 'calculatePerimeter()'.

public class Circle extends Shape {
    // Instance variable to store the radius of the circle
    private double radius;

    // Constructor to initialize the radius of the circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter method to access the radius
    public double getRadius() {
        return radius;
    }

    // Implementing abstract methods to calculate the area and perimeter of the circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
