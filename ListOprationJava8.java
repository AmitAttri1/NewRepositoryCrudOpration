package com.example.CoreJava.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListOprationJava8 {

    public static void main(String[] args) {
        List<String> list1 =Arrays.asList("a","z","b","k");
        list1.sort(Comparator.naturalOrder());
        System.out.println(list1);
        list1.forEach(System.out::println);
    }
}
