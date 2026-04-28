package com.my.streamexample.intermediateOperations;

import java.util.Arrays;
import java.util.List;

public class MapExample {

    public static void main(String[] args) {


       List<String> mapList = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        mapList.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}
