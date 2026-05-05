package com.my.streamexample.intermediateOperations;

import java.util.Arrays;
import java.util.List;

public class SkipExample {

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        list.stream()
                .skip(3)
                .forEach(System.out::println);
    }
}
