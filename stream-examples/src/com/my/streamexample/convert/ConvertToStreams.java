package com.my.streamexample.convert;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConvertToStreams {

    public static void main(String[] args) {

        int[] ages= {23, 45, 12, 67, 34, 89};//primitive array

        Arrays.stream(ages).forEach(System.out::println);

        Integer[] ages1={23, 45, 12, 67, 34, 89};//object array
//        Arrays.stream(ages1).forEach(System.out::println);
        Stream<Integer> objectArray=Stream.of(ages1);
        objectArray.forEach(System.out::println);

        List<Integer> collectionElements=Arrays.asList(1, 2, 3, 4, 5);//collection
        collectionElements.stream().forEach(System.out::println);
    }
}
