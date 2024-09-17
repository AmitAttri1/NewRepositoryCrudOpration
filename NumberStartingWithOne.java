package com.example.CoreJava.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of integers, find out all the numbers starting with 1 using Stream functions?
public class NumberStartingWithOne {
    public static void main(String[] args) {
                List<Integer> list=Arrays.asList(10,11,12,13,2,5,4,10,1);
        List<String> collect = list.stream()
                .map(n -> n + "")
                .filter(n -> n.startsWith("1"))
                .collect(Collectors.toList());
        collect.forEach(System.out::println);
    }
}