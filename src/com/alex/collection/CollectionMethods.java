package com.alex.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *  Using the 10 basic methods of Collection
 */
public class CollectionMethods {
    public static void main(String[] args) {
        Employee employeeOne = new Employee("Sharp", 300000, "Software Development");
        Employee employeeTwo = new Employee("Alex", 400000, "Networks");
        Employee employeeThree = new Employee("Brian", 1300000, "Product Management");
        Employee employeeFour = new Employee("Arnold", 1200000, "Product Management");
        Employee employeeFive = new Employee("John", 1000000, "Product Management");
        Employee employeeSix = new Employee("Doe", 1000000, "Product Management");

        //Creating a collection using ArrayListImplementation of List
        Collection<Employee> employeeCollection = new ArrayList<>();

        System.out.println("Total elements in the initial employeeCollection  : "+ employeeCollection.size());

        //Using add method
        employeeCollection.add(employeeOne);
        System.out.println("Total elements in employeeCollection after add method  : "+ employeeCollection.size());

        //Using addAll method
        employeeCollection.addAll(List.of(employeeTwo, employeeThree, employeeFour, employeeFive, employeeSix));
        System.out.println("Total elements in employeeCollection after addAll method  : "+ employeeCollection.size());

        //Using remove method
        employeeCollection.remove(employeeTwo);
        System.out.println("Total elements in employeeCollection after remove method  : "+ employeeCollection.size());

        //Using removeAll method
        employeeCollection.removeAll(List.of(employeeOne, employeeThree));
        System.out.println("Total elements in employeeCollection after removeAll method  : "+ employeeCollection.size());

        //Using retainAll method
        employeeCollection.retainAll(List.of(employeeFour, employeeFive));
        System.out.println("Total elements in employeeCollection after retainAll method  : "+ employeeCollection.size());

        //Using contains method
        boolean containsResult = employeeCollection.contains(employeeFour);
        System.out.println("Result for contains employeeFour is : "+ containsResult);

        //Using containsAll method
        boolean containsAllResult = employeeCollection.containsAll(List.of(employeeFour, employeeFive));
        System.out.println("Result for contains employeeFour and employeeFive is : "+ containsAllResult);

        //Using clear method
        employeeCollection.clear();
        System.out.println("Total elements in employeeCollection after clear method  : "+ employeeCollection.size());

        //Using isEmpty method
        boolean isEmptyResult = employeeCollection.isEmpty();
        System.out.println("Result for is empty is  : "+ isEmptyResult);
    }
}
