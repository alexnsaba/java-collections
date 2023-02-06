package com.alex.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class CollectionMap {
    public static void main(String[] args) {
        EmployeeType permanent = new EmployeeType("Permanent", "Employee with a permanent contract");
        EmployeeType contractor = new EmployeeType("Contractor", "Employee with a temporary contract");
        EmployeeType consultant = new EmployeeType("Consultant", "Expert with a consultant contract");

        Employee employeeOne = new Employee("Sharp", 300000, "Software Development");
        Employee employeeTwo = new Employee("Alex", 400000, "Networks");
        Employee employeeThree = new Employee("Brian", 1300000, "Product Management");

        //Creating a map using HashMap Class
        Map<EmployeeType, Employee> employees = new HashMap<>();

        //Using put method
        employees.put(permanent, employeeOne);
        employees.put(contractor, employeeTwo);
        employees.put(consultant, employeeThree);
        System.out.println("Initial total elements in employee map : "+ employees.size());

        //Using get method
        Employee retrievedEmployee = employees.get(permanent);
        System.out.println("Retrieved employee's name is : "+retrievedEmployee.name);

        //Using remove method
        Employee removedEmployee = employees.remove(permanent);
        System.out.println("Current initial total elements in employee map : "+ employees.size());
        System.out.println("Successfully removed employee '"+removedEmployee.name+"' from employee map");

        //Using values method
        Collection<Employee> employeeCollection = employees.values();

        System.out.println("---Employee map values---");

        employeeCollection.stream().map(e -> {
            System.out.println(e.name);
            return 0;
        }).collect(Collectors.toList());

        //Using values method
        Collection<EmployeeType> employeeTypeCollection = employees.keySet();

        System.out.println("---Employee Type map keys---");

        employeeTypeCollection.stream().map(e -> {
            System.out.println(e.employeeTypeName);
            return 0;
        }).collect(Collectors.toList());

        //Iterating through a map
        for (Entry<EmployeeType, Employee> entry : employees.entrySet()){
            System.out.println("Employee type : "+ entry.getKey().employeeTypeName+" - Employee name: "+entry.getValue().name);
        }
    }
}
