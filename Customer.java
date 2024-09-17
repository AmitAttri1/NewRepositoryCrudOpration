package com.example.CoreJava.Test;

public class Customer {

    private  String name;
    private  Long salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public Customer(String name, Long salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
