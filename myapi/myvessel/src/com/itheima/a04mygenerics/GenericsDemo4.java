package com.itheima.a04mygenerics;

public class GenericsDemo4 {
    public static void main(String[] args) {

        //1.实现类给出具体的类型
        MyArrayList2 list = new MyArrayList2();
        list.add("aaa");

        //2.实现类延续泛型,创建实现类对象的时候再确定类型
        MyArrayList3<String> list1 = new MyArrayList3<>();


    }
}
