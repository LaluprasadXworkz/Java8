package com.my.streamexample.intermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PeekExample {

    public static void main(String[] args) {

       List<Integer> integerList= Arrays.asList(1,2,3,4,5);

       integerList.stream()
               .map(a->a*a)
               .peek(System.out::println)
               .collect(Collectors.toList());
    }
}
