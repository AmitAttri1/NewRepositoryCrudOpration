package com.example.CoreJava.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CustomerClient {

    public static void main(String[] args) {
        Customer cus1 =new Customer("Amit",100000L);
        Customer cus2 =new Customer("Abhi",300000L);
        Customer cus3 =new Customer("Ravi",200000L);
        Customer cus4 =new Customer("Kavi",400000L);

        List<Customer> list = Arrays.asList(cus1, cus2, cus3, cus4);
        list.sort(Comparator.comparing(Customer::getName).thenComparing(Customer::getSalary));

       // System.out.println(list);
        list.forEach(System.out::println);

    }
}
