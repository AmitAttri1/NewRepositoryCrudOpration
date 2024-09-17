package com.example.CoreJava.Test;

import com.example.CoreJava.GroupingByAge;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
//Given a list of people with names and ages, how would you group them by age?
public class ClientGroupingByAge {
    public static void main(String[] args) {
        GroupingByAge per1=new GroupingByAge("Amit",30);
        GroupingByAge per2=new GroupingByAge("Abhi",23);
        GroupingByAge per3=new GroupingByAge("Ravi",40);
        GroupingByAge per4=new GroupingByAge("Kavi",15);

        List<GroupingByAge> list = Arrays.asList(per1, per2, per3, per4);

        list.sort(Comparator.comparing(GroupingByAge::getAge));
        list.forEach(System.out::println);

    }
}
