package com.itheima.a05myset;

public class A02_HashSetDemo1 {
    public static void main(String[] args) {
        /*
        哈希值:
        如果没有重写hashcode方法,不同对象计算出来的哈希值是不一样的
        如果已经重写,不同的对象只要属性值不同,计算出的哈希值就是一样的
        在小部分情况下,不同的属性值或者不同的地址值计算出来的哈希值也有可能一样(哈希碰撞)
         */

        //1.创建对象
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("zhangsan",23);

        //2.如果没有重写hashcode方法,不同对象计算出的哈希值是不同的
        //如果已经重写,不同的对象只要属性值不同,计算出的哈希值就是一样的
        int h1 = s1.hashCode();
        int h2 = s2.hashCode();
        System.out.println(h1);
        System.out.println(h2);

        //在小部分情况下,不同的属性值或者不同的地址值计算出来的哈希值也有可能一样(哈希碰撞)
        //哈希碰撞
        System.out.println("abc".hashCode());
        System.out.println("acD".hashCode());

    }
}
