package com.example.CoreJava.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//How to find duplicate elements in a given integers list in java using Stream functions?
public class DulicateElement {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7, 8, 8,8, 9);
       list.stream().distinct().forEach(System.out::println);


    }
}
