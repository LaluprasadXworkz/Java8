package com.my.streamexample.intermediateOperations;

import java.util.Arrays;
import java.util.List;

public class DistinctExample {
    public static void main(String[] args) {
        List<Integer> integerList=Arrays.asList(5,1, 2, 3, 4, 5, 2, 3, 6);

        integerList.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
