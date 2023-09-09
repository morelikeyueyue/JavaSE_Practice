package com.itheima.a01mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class A02_CollectionDemo2 {
    public static void main(String[] args) {
        //创建集合的对象
        Collection<Student> coll = new ArrayList<>();

        //2.创建三个学生对象
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);

        //3.把学生对象添加到集合中
        coll.add(s1);
        coll.add(s2);
        coll.add(s3);

        //4.判断集合中某一个学生对象是否包含
        Student s4 = new Student("zhangsan",23);
        //如果同姓名同年龄就是同一个学生
        //因为contains方法在底层依赖equals方法判断对象是否一致
        //如果存的是自定义对象,没有重写equals方法,那么默认使用object类中的equals方法
        //需求:如果同姓名同年龄就是同一个学生
        //所以,需要在自定义的javabean类中,重写equals方法
        System.out.println(coll.contains(s4));



    }
}
