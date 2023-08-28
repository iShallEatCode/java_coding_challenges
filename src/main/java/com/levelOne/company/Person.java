package com.levelOne.company;

// Person class represents a person with basic information.
// The class represents person with attributes 'name', 'age', and 'address'.
// It has a constructor to initialize these attributes when a 'Person' object is created.

public class Person {
    // Instance variables to store person's attributes
    private String name;
    private int age;
    private String address;

    // Constructor to initialize the person's attributes
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Getter methods to access person's attributes
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    // Setter methods to update person's attributes
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Method to display person's information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}
