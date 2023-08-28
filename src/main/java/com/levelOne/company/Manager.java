package com.levelOne.company;

// The 'Manager' class is a subclass of the 'Employee' class, using the 'extends' keyword to inherit its attributes and methods.
// It adds an additional attribute, 'managedTeam', specific to managers.
// The constructor of the 'Manager' class initializes both the 'Employee' attributes (using 'super()') and the manager-specific attribute.
// The 'displayInfo()' method is overridden to display both the 'Employee' info (using 'super.displayInfo()') and the additional manager info.

public class Manager extends Employee {
    // Additional attribute for managers
    private String managedTeam;

    // Constructor
    public Manager(String name, int age, String address, int employeeId, String department, double employeeSalary, String managedTeam) {
        // Call the superclass constructor to initialize the Employee attributes
        super(name, age, address, employeeId, employeeSalary, department);
        this.managedTeam = managedTeam;
    }

    // Getter method to access the managedTeam attribute
    public String getManagedTeam() {
        return managedTeam;
    }

    // Setter method to update the managedTeam attribute
    public void setManagedTeam(String managedTeam) {
        this.managedTeam = managedTeam;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the displayInfo() method from the superclass (Employee)
        System.out.println("Managed Team: " + managedTeam);
    }
}
