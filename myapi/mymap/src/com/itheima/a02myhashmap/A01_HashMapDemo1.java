package com.itheima.a02myhashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class A01_HashMapDemo1 {
    public static void main(String[] args) {

        //核心点:hashMap的键的位置如果存储的是自定义对象,需要重写hashCode和equals方法

        //1.创建hashmap对象
        HashMap<Student,String> map = new HashMap<>();

        //2.添加元素
        map.put(new Student("zhangsan",23), "湖南");
        map.put(new Student("lisi",24), "湖北");
        map.put(new Student("wangwu",23), "湖北");
        map.put(new Student("zhangsan",23), "江苏");

        //3.遍历集合
        Set<Student> keys = map.keySet();
        for (Student key : keys) {
            String value = map.get(key);
            System.out.println(key+"="+value);
        }
        System.out.println("--------------");

        for (Map.Entry<Student, String> entry : map.entrySet()) {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"="+value);
        }

        System.out.println("-------------");
        map.forEach((Student key, String value) -> System.out.println(key+"="+value));

    }
}
