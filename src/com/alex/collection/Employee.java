package com.alex.collection;

import java.util.Collection;
import java.util.List;

public class Employee {
    public String name;
    public double salary;
    public String department;

    public Employee(String name, double salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public static double getEmployeeTotalSalary(Collection<Employee> employees){
        return employees.stream().mapToDouble(e -> e.salary).sum();
    }

    public static void main(String[] args) {
        Employee employeeOne = new Employee("Alex", 300000, "Software Development");
        Employee employeeTwo = new Employee("Sharp", 400000, "Networks");
        Employee employeeThree = new Employee("Brian", 1300000, "Product Management");

        Collection<Employee> employees = List.of(employeeOne,employeeTwo, employeeThree);

        System.out.println("Total Employee Salary : "+ getEmployeeTotalSalary(employees));
    }
}
