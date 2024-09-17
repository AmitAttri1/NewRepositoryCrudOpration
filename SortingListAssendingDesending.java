package com.example.CoreJava.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//How can you sort a list of integers in descending order using streams?
public class SortingListAssendingDesending {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        list.sort(Comparator.reverseOrder());

       // System.out.println(list);
        list.forEach(System.out::println);

    }
}
