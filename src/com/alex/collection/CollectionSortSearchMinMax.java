package com.alex.collection;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionSortSearchMinMax {
    public static void main(String[] args) {
        Collection<Integer> age = List.of(100, 23, 12, 91, 111, 67, 88, 9, 99, 56, 77, 66, 29, 120, 2, 1);

        System.out.println("Initial unsorted collection");
        age.stream().map(a -> {
            System.out.print(a +" ");
            return 0;
        }).collect(Collectors.toList());

        //Sorting the collection
        Collection<Integer> sortedAge = age.stream().sorted().collect(Collectors.toList());
        System.out.println("\nCurrent sorted collection");
        sortedAge.stream().map(a -> {
            System.out.print(a +" ");
            return 0;
        }).collect(Collectors.toList());

        //Searching a value from a collection
        int index = Collections.binarySearch(sortedAge.stream().toList(),2);
        System.out.println("\n2 is at position "+index);

        //Getting the minimum value
        int min = Collections.min(age);
        System.out.println("Minimum age is : "+min);

        //Getting the maximum value
        int max = Collections.max(age);
        System.out.println("Maximum age is : "+max);
    }
}
