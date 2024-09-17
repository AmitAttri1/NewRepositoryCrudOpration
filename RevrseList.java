package com.example.CoreJava.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class RevrseList {

    public static void main(String[] args) {
      List<Integer> list=Arrays.asList(1,4,5,6,8,9);
      Integer list1=list.stream()
              .sorted(Comparator.reverseOrder())
              .skip(1)
              .findFirst()
              .orElse(null);
        System.out.println(list1);

    }
}
