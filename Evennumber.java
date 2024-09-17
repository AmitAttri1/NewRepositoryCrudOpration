package com.example.CoreJava.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
public class Evennumber {

    public static void main(String[] args) {
        List<Integer>list =Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> collect = list.stream()
                .filter(s -> s % 2 == 0)
                .collect(Collectors.toList());
        collect.forEach(System.out::println);

    }
}
