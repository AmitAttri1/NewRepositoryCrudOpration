package com.example.CoreJava.Test;

import java.util.Arrays;
import java.util.List;

//How can you find the sum of all elements in a list of integers using streams?
public class SumOfList {

    public static void main(String[] args) {
        List<Integer>list =Arrays.asList(1,2,3,4,5,6,7);
       int sum= list.stream()
                .reduce(0,Integer::sum);
        System.out.println(sum);
    }
}
