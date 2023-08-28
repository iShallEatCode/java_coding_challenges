package com.levelOne.student;

import java.util.ArrayList;
import java.util.List;

// The 'Student' class represents a student with attributes 'name', 'rollNumber', and a list ('grades') to store their grades.
// The constructor initializes the student with the provided name and roll number and initializes the grade list.
// Getter methods ('getName()' and 'getRollNumber()') allow access to the student's name and roll number.
// The 'addGrade()' method allows adding grades to the student's grade list.
// The 'viewGrades()' method displays the student's grades in a formatted way.

public class Student {
    // Instance variables
    private String name;
    private int rollNumber;
    private List<Integer> grades;

    // Constructor
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grades = new ArrayList<>();
    }

    // Getter methods
    public String getName() {
        return name;
    }
    public int getRollNumber() {
        return rollNumber;
    }

    // Method to add grades to the student's grade list
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // Method to view the student's grades
    public void viewGrades() {
        System.out.println("Grades for " + name + " (Roll Number: " + rollNumber + "):");
        for (int grade : grades) {
            System.out.print(grade + " ");
        }
        System.out.println();
    }
}
