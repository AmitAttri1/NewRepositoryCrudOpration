package com.example.CoreJava.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//How can you get a list of distinct elements from a list that contains duplicates using streams?
public class DistinctElement {

    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,1,2,3,4,2,3);
        List<Integer> collect = list.stream()
                .distinct()
                .collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}
