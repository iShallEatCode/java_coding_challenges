package com.levelOne.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// The 'StudentInfo' class represents a student with attributes name and rollNumber.
// The 'StudentManagementSystem' class manages student information, allowing adding students and viewing the list of students.
// The 'addStudent()' method adds a new 'StudentInfo' object to the 'students' list.
// The 'viewStudents()' method displays the list of students with their names and roll numbers.
// The 'main()' method interacts with the user using a menu-driven approach to add students, view the list of students, or exit the program.

public class StudentManagementSystem {
    private List<Student> students;

    public StudentManagementSystem() {
        students = new ArrayList<>();
    }

    // A method to add student
    public void addStudent(String name, int rollNumber) {
        Student student = new Student(name, rollNumber);
        students.add(student);
        System.out.println("Student added: " + name + " (Roll Number: " + rollNumber + ")");
    }

    // A method to view the student list
    public void viewStudents() {
        System.out.println("Student List:");
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Roll Number: " + student.getRollNumber());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();

        while (true) {
            System.out.println("\nStudent Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter student name: ");
                    scanner.nextLine(); // Consume newline
                    String name = scanner.nextLine();
                    System.out.print("Enter roll number: ");
                    int rollNumber = scanner.nextInt();
                    sms.addStudent(name, rollNumber);
                    break;
                case 2:
                    sms.viewStudents();
                    break;
                case 3:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }  
}
