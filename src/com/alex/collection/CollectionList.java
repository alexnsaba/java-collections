package com.alex.collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionList {
    public static void main(String[] args) {
        Employee employeeOne = new Employee("Alex", 300000, "Software Development");
        Employee employeeTwo = new Employee("Sharp", 400000, "Networks");
        Employee employeeThree = new Employee("Brian", 1300000, "Product Management");
        Employee employeeFour = new Employee("Arnold", 1300000, "Data");

        //Create a list using ArrayList
        List<Employee> employees = new ArrayList<>();
        employees.addAll(List.of(employeeOne, employeeTwo,employeeThree, employeeOne, employeeTwo));

        //Using get()
        Employee firstEmployee = employees.get(0);
        System.out.println("First Employee's name is : "+ firstEmployee.name);

        //Using indexOf()
        int employeeOneFirstIndex = employees.indexOf(firstEmployee);
        System.out.println("employeeOne's first index is : "+ employeeOneFirstIndex);

        //Using lastIndexOf()
        int employeeOneLastIndex = employees.lastIndexOf(firstEmployee);
        System.out.println("employeeOne's first index is : "+ employeeOneLastIndex);

        //Using set()
        employees.set(0, employeeFour);
        System.out.println("Current First Employee's name after set method is : "+ employees.get(0).name);

        //Using subList()
        List<Employee> subList = employees.subList(0,2);
        System.out.println("The total number of elements in the sublist is : "+ subList.size());
    }
}
