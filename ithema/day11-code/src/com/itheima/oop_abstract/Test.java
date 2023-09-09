package com.itheima.oop_abstract;

public class Test {
    public static void main(String[] args) {
        //创建对象
        //Person p = new Person();

        Student s = new Student("张三",18);

        System.out.println(s.getName()+", "+s.getAge());

    }
}
