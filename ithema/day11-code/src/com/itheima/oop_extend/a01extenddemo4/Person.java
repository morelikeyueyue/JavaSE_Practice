package com.itheima.oop_extend.a01extenddemo4;

public class Person {

    String name;
    int age;

    public Person(){
        System.out.println("������޲ι���");
    }
    public Person(String name, int age) {
        System.out.println("������вι���");
        this.name = name;
        this.age = age;
    }
}
