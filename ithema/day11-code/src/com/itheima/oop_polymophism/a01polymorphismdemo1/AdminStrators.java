package com.itheima.oop_polymophism.a01polymorphismdemo1;

public class AdminStrators extends Person {
    public AdminStrators() {
    }

    public AdminStrators(String name, int age) {
        super(name, age);
    }

    @Override
    public void show() {
        System.out.println("老师的信息为:"+getName()+","+getAge());
    }
}
