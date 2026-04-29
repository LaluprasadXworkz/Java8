package com.my.streamexample.intermediateOperations;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("apple", "banana"),
                Arrays.asList("cherry", "date"),
                Arrays.asList("elderberry", "fig")
        );

        listOfLists.stream()
                .flatMap(Collection::stream)
                .map(String::toUpperCase)
                .forEach(System.out::println);


    }
}
