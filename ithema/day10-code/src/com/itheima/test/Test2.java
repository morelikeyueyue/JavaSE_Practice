package com.itheima.test;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        //添加数字并进行遍历
       /* 基本数据类型对应的包装类
        byte Byte
        short Short
        char Character
        int Integer
        long Long
        float Float
        double Double
        boolean Boolean
        */

        //1.创建集合
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Character> list1 = new ArrayList<>();

        //2.添加元素
        //jdk5以后 int Integer 之间是可以互相转化的
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);

        list1.add('c');
        list1.add('b');
        list1.add('a');

        //3.遍历集合
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + ", ");
            }
        }
        System.out.println("]");

        System.out.print("[");
        for (int i = 0; i < list1.size(); i++) {
            if (i == list1.size() - 1) {
                System.out.print(list1.get(i));
            } else {
                System.out.print(list1.get(i) + ", ");
            }
        }
        System.out.println("]");

    }
}
