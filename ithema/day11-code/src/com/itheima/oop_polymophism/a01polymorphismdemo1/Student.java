package com.itheima.oop_polymophism.a01polymorphismdemo1;

public class Student extends Person{
    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void show(){
        System.out.println("ѧ������ϢΪ:"+getName()+","+getAge());
    }
}
