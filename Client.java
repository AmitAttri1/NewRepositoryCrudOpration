package com.example.CoreJava.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {

        Employee emp1=new Employee("Amit",100000L,"Developer");
        Employee emp2=new Employee("Abhi",500000L,"Manager");
        Employee emp3=new Employee("Ravi",200000L,"Developer");

        List<Employee> list=Arrays.asList(emp1,emp2,emp3);
        //list.sort(Comparator.comparing(Employee::getDesignation));
        List<Employee> listManager = list.stream()
                .filter(s -> s.getDesignation().equals("Manager"))
                .collect(Collectors.toList());
       // System.out.println(manager);
        listManager.forEach(System.out::println);


    }
    }
