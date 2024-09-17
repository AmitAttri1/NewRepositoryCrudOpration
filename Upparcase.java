package com.example.CoreJava.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Upparcase {
    //Given a list of strings, how would you convert each string to uppercase and collect the results into a new list?
    public static void main(String[] args) {
      List<String>list1 =Arrays.asList("apple","banana","mango");
        List<String> collect = list1.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        //System.out.println(collect);
collect.forEach(System.out::println);

    }
}
