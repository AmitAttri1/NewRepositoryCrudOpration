package com.example.CoreJava.Test;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Occrence {

    public static void main(String[] args) {
        String ocr="Amitt";

        String[] split = ocr.split("");

        Map<String, Long> data = Arrays.stream(split)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(data);

    }
}
