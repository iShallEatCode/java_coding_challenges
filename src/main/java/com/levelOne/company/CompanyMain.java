package com.levelOne.company;

import java.util.ArrayList;
import java.util.List;

// The 'Company' class represents a company with attributes 'companyName' and a list of 'employees'.
// The constructor initializes the company with a name and initializes the list of employees.
// The 'addEmployee()' method adds an employee to the company's list of employees.
// The 'viewEmployees()' method displays the list of employees in the company.
// In the 'main()' method, we create a 'Company' object, add employees to it, view the employees to it, 
// view the employees, give a raise to an employee, and view the updated employee list.

public class CompanyMain {
    private String companyName;
    private List<Employee> employees;

    // Constructor to initialize the company with a name
    public CompanyMain(String companyName) {
        this.companyName = companyName;
        employees = new ArrayList<>();
    }

    // Method to add an employee to the company
    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println(employee.getName() + " has been added to " + companyName);
    }

    // Method to view the list of employees in the company
    public void viewEmployees() {
        System.out.println("Employees at " + companyName + ":");
        for (Employee employee : employees) {
            System.out.println("Name: " + employee.getName() + "\nAge: " + employee.getAge() + "\nEmployee Address: " + employee.getAddress() + "\nEmployee ID: " + employee.getEmployeeId() + "\nSalary: $" + employee.getEmployeeSalary() + "\nDepartment: " + employee.getDepartment());
        }
    }

    public static void main(String[] args) {
        CompanyMain company = new CompanyMain("Google");

        Employee emp1 = new Employee("John", 25, "123 Cherry St", 01, 60000, "IT");
        Employee emp2 = new Employee("Bob", 50, "2407 Cherry Blossom DR", 02, 69000, "HR");

        company.addEmployee(emp1);
        company.addEmployee(emp2);

        company.viewEmployees();

        emp1.giveRaise(3000);

        company.viewEmployees();
    }
}
