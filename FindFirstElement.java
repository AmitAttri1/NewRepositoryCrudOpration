package com.example.CoreJava.Test;

import java.util.Arrays;
import java.util.List;

public class FindFirstElement {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7, 8, 8,8, 9);
        Long count = list.stream().count();
        System.out.println(count);


    }
}
