package com.alex.collection;

import java.util.*;
import java.util.stream.Collectors;

public class CollectionSet {
    public static void main(String[] args) {
        Employee employeeOne = new Employee("Alex", 300000, "Software Development");
        Employee employeeTwo = new Employee("Sharp", 400000, "Networks");
        Employee employeeThree = new Employee("Brian", 1300000, "Product Management");

        //Creating a set using HashSet
        System.out.println("Create Set using HashSet...");
        Set<Employee> employeeSetOne = new HashSet<>();
        employeeSetOne.addAll(List.of(employeeOne, employeeTwo, employeeThree));
        System.out.println("Total elements in employeeSetOne : " + employeeSetOne.size());

        //Creating a set using of() method
        System.out.println("Create Set using using of()...");
        Set<Employee> employeeSetTwo = Set.of(employeeOne, employeeTwo);
        System.out.println("Total elements in employeeSetTwo : " + employeeSetTwo.size());

        //Creating a set using copyOf() method
        System.out.println("Create Set using using copyOf()...");
        Collection<Employee> employees = List.of(employeeOne, employeeTwo, employeeOne);

        Set<Employee> employeeSetThree = Set.copyOf(employees);
        System.out.println("Total elements in employeeSetThree : " + employeeSetThree.size());

        //Use of TreeSet
        NavigableSet<Integer> numbersTreeSet = new TreeSet<>(Arrays.asList(300, 100, 400, 20, 24, 700, 666, 546, 22, 1130));

        //Display elements of the Tree set in ascending order
        System.out.println("Elements of tree set in ascending order");
        numbersTreeSet.stream().map(x -> {
            System.out.print(x + " , ");
            return 0;
        }).collect(Collectors.toList());

        //Use descendingSet() method
        System.out.println(" ");
        System.out.println("Elements of tree set in descending order");
        numbersTreeSet.descendingSet().stream().map(x -> {
            System.out.print(x + " , ");
            return 0;
        }).collect(Collectors.toList());

        //Use headSet method
        Set<Integer> numbersSmallerThanTwoHundred = numbersTreeSet.headSet(200);
        System.out.println(" ");
        System.out.println("Elements smaller than 200");
        numbersSmallerThanTwoHundred.stream().map(x -> {
            System.out.print(x + " , ");
            return 0;
        }).collect(Collectors.toList());

        //Use trailSet method
        Set<Integer> numbersBiggerThanTwoHundred = numbersTreeSet.tailSet(200);
        System.out.println(" ");
        System.out.println("Elements bigger than 200");
        numbersBiggerThanTwoHundred.stream().map(x -> {
            System.out.print(x + " , ");
            return 0;
        }).collect(Collectors.toList());

        //Use subSet method
        Set<Integer> subset = numbersTreeSet.subSet(200, 600);
        System.out.println(" ");
        System.out.println("Elements of a subset between 200 and 600");
        subset.stream().map(x -> {
            System.out.print(x + " , ");
            return 0;
        }).collect(Collectors.toList());

        //Using higher method
        System.out.println(" ");
        int higher = numbersTreeSet.higher(200);
        System.out.println("Number just higher than 200 is : " + higher);

        //Using lower
        int lower = numbersTreeSet.lower(200);
        System.out.println("Number just lower than 200 is : " + lower);
    }
}
