package com.alex.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionIteration {
    public static void main(String[] args) {
        Employee employeeOne = new Employee("Alex", 300000, "Software Development");
        Employee employeeTwo = new Employee("Sharp", 400000, "Networks");
        Employee employeeThree = new Employee("Brian", 1300000, "Product Management");

        Collection<Employee> employees = List.of(employeeOne, employeeTwo, employeeThree);

        //Using the forEach
        System.out.println("Iterating using the forEach");
        for (Employee employee : employees) {
            System.out.println(employee.name);
        }

        //Using iterator
        System.out.println("Iterating using the Iterator");
        Iterator<Employee> employeeIterator = employees.iterator();
        while (employeeIterator.hasNext()) {
            Employee employee = employeeIterator.next();
            System.out.println(employee.name);
        }

        //Using Stream
        System.out.println("Iterating using the Stream");
        employees.stream().map(e -> {
            System.out.println(e.name);
            return 0;
        }).collect(Collectors.toList());
    }
}
