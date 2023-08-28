package com.levelOne.company;

// Employee class represents an employee, extending the Person class.
// It is a subclass of the 'Person' class, using 'extends' keyword to inherit its attributes and methods.
// It adds two additional attributes, 'employeeId' and 'department', specific to employees.
// The constructor of the 'Employee' class initializes both the 'Person' attributes (using 'super()') and the employee-specific attributes.
// The 'displayInfo()' method is overridden to display both the 'Person' information (using 'super.displayInfo()') and the additional employee info.

public class Employee extends Person {
    // Additional attributes for employees
    private int employeeId;
    private double employeeSalary;
    private String department;

    // Constructor to initialize the employee attributes along with the Person attributes 
    public Employee(String name, int age, String address, int employeeId, double employeeSalary, String department) {
        // Call the superclass constructor to initialize the Person attributes
        super(name, age, address);
        this.employeeId = employeeId;
        this.department = department;
        this.employeeSalary = employeeSalary;
    }

    // Getter methods to access employee attributes 
    public int getEmployeeId() {
        return employeeId;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public String getDepartment() {
        return department;
    }

    // Setter methods to update employee attributes
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Method to give a salary raise to the employee
    public void giveRaise(double amount) {
        String employeeName = getName();
        employeeSalary += amount;
        System.out.println(employeeName + "'s salary has been raised by $" + amount);
    }

    // Method to display employee information, including Person information 
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the displayInfo() method from the superclass (Person)
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
    }
}
