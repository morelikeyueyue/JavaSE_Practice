package com.itheima.a05myset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class A01_SetDemo1 {
    public static void main(String[] args) {
        /*
            利用set系列的集合,添加字符串,并使用多种方式遍历
            迭代器
            增强for
            lambda表达式
         */

        //1.创建一个set集合的对象
        Set<String> s = new HashSet<>();

        //2.添加元素
        //如果当前元素是第一次添加,添加成功返回true 否则返回false添加失败
        boolean result1 = s.add("aaa");
        boolean result2 = s.add("aaa");
        s.add("bbb");
        s.add("ccc");
        System.out.println(result1);
        System.out.println(result2);


        //3.打印集合
        //无序的
        System.out.println(s);

        //迭代器遍历
        Iterator<String> it = s.iterator();
        while (it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }
        System.out.println();

        //增强for
        for (String s1 : s) {
            System.out.println(s1);
        }
        System.out.println();

        //lambda表达式

        s.forEach( s2 -> System.out.println(s2));
        System.out.println();
        s.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

    }
}
