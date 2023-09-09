package com.itheima.listdemo;

import java.util.ArrayList;

public class ArrayDemo1 {
    public static void main(String[] args) {
        //1.创建集合的对象
        //泛型:限定集合中存储的数据的类型
//        JDK7前
        ArrayList<String> list1 = new ArrayList<String>();
        //jdk7后:
        ArrayList<String> list2 = new ArrayList<>();

        //此时我们创建的ArrayList的对象,而ArrayList是java写好的一个类
        //这个类底层做了处理,打印对象是不是地址值而是存储内容
        //在展示的时候会那[]把所有的数据进行包裹

        System.out.println(list1);
    }
}
