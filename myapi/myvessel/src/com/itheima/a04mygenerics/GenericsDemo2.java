package com.itheima.a04mygenerics;

public class GenericsDemo2 {
    public static void main(String[] args) {

        MyArrayList<String> list = new MyArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        System.out.println(list);

        MyArrayList<Integer> list1 = new MyArrayList<>();
        list1.add(123);
        list1.add(456);
        list1.add(789);

        int i = list1.get(0);
        System.out.println(i);

        System.out.println(list1);

    }
}
