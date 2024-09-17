package com.example.CoreJava;

//Given a list of people with names and ages, how would you group them by age?
public class GroupingByAge {

    private  String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public GroupingByAge(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "GroupingByAge{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
