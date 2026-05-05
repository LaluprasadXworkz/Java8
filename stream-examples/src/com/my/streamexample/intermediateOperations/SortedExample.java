package com.my.streamexample.intermediateOperations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedExample {
    public static void main(String[] args) {

        List<Integer> integerList= Arrays.asList(10, 5, 3, 8, 2, 6, 4, 7, 9);

        integerList.stream()
                .sorted()
                .forEach(System.out::println);

        integerList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        List<String> stringList= Arrays.asList("banana", "apple", "cherry", "date");

        stringList.stream()
                .sorted()
                .forEach(System.out::println);

        stringList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        stringList.stream()
                .sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println);


    }
}
