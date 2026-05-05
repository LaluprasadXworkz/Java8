package com.my.streamexample.intermediateOperations;

import java.util.Arrays;
import java.util.List;

public class LimitExamples {

    public static void main(String[] args) {

        List<Integer> integerList= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        integerList.stream()
                .limit(3)
                .forEach(System.out::println);
    }
}
