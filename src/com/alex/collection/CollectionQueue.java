package com.alex.collection;

import java.util.ArrayDeque;
import java.util.Queue;

public class CollectionQueue {
    public static void main(String[] args) {
        Employee employeeOne = new Employee("Alex", 300000, "Software Development");
        Employee employeeTwo = new Employee("Brian", 400000, "Networks");

        //Creating a queue using arrayDeque
        Queue<Employee> employees = new ArrayDeque<>();

        //Using add and offer methods
        boolean offerResult = employees.offer(employeeOne);
        boolean addResult = employees.add(employeeTwo);

        System.out.println("Result for adding an element using offer : "+offerResult);
        System.out.println("Result for adding an element using add : "+addResult);

        //Using element and peek
        Employee elementEmployee = employees.element();
        Employee peekedEmployee = employees.peek();

        System.out.println("Element Employee's name is : "+ elementEmployee.name);
        System.out.println("Peeked Employee's name is : "+ peekedEmployee.name);

        //Using remove and poll
        Employee removedEmployee = employees.remove();
        Employee polledEmployee = employees.poll();

        System.out.println("Removed Employee's name is : "+ removedEmployee.name);
        System.out.println("Polled Employee's name is : "+ polledEmployee.name);
    }
}
