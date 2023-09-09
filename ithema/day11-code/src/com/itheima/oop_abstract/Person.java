package com.itheima.oop_abstract;

public abstract class Person {

    public abstract void work();

    private String name;
    private int age;

    //作业:当创建子类对象是,给属性进行赋值的
    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    public void sleep() {
        System.out.println("睡觉");
    }

}
