package com.itheima.oop_extend.a01extenddemo4;

public class Person {

    String name;
    int age;

    public Person(){
        System.out.println("父类的无参构造");
    }
    public Person(String name, int age) {
        System.out.println("父类的有参构造");
        this.name = name;
        this.age = age;
    }
}
