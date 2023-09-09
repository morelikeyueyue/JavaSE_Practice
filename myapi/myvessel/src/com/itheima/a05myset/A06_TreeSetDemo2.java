package com.itheima.a05myset;

import java.util.TreeSet;

public class A06_TreeSetDemo2 {
    public static void main(String[] args) {

        //1.创建三个学生对象
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);
        Student s4 = new Student("zhangsan",23);

        //2.创建集合对象
        TreeSet<Student> ts = new TreeSet<Student>();

        //3.添加学生对象
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);


        //4.打印集合
        System.out.println(ts);


    }
}
