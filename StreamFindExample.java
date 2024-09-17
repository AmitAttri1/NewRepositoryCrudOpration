package com.example.CoreJava.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//How would you find the first string in a list that has more than 5 characters using streams?
public class StreamFindExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
        Stream<String> stringStream = words.stream()
                .filter(w -> w.length()>5)
                        .findFirst()
                                .orElse(" fdfdd ff ").lines();

      //  System.out.println(stringStream);
        stringStream.forEach(System.out::println);
    }
}
