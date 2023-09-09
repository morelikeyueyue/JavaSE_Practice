package com.itheima.a04mytreemap;

import com.itheima.a02myhashmap.Student;

import java.util.Comparator;
import java.util.TreeMap;

public class A01_TreeMapDemo1 {
    public static void main(String[] args) {

        //需求1:
        //1.创建treemap集合
        //id升序
        TreeMap<Integer,String> tm1 = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        //lambda表达式
        //TreeMap<Integer,String> tm1 = new TreeMap<>((Integer o1, Integer o2) -> o1-o2);

        //2.添加元素
        tm1.put(1,"a");
        tm1.put(3,"b");
        tm1.put(2,"c");


        System.out.println(tm1);

        //id降序
        TreeMap<Integer,String> tm2 = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        //2.添加元素
        tm2.put(1,"a");
        tm2.put(3,"b");
        tm2.put(2,"c");


        System.out.println(tm2);


        //需求2:
        //1.创建treemap集合对象
        TreeMap<Student,String> tm3 = new TreeMap<>();


        //2.添加元素
        tm3.put(new Student("zhangsan",23), "湖南");
        tm3.put(new Student("lisi",24), "湖北");
        tm3.put(new Student("wangwu",23), "湖北");
        tm3.put(new Student("zhangsan",23), "江苏");

        System.out.println(tm3);


    }
}
