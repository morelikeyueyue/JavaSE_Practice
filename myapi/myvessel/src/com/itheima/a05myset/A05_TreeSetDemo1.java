package com.itheima.a05myset;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Consumer;

public class A05_TreeSetDemo1 {
    public static void main(String[] args) {
        //需求:利用TreeSet存储整数并进行排序

        //1.创建TreeSet集合的对象
        TreeSet<Integer> ts = new TreeSet<>();

        //2.添加元素
        ts.add(2);
        ts.add(5);
        ts.add(1);
        ts.add(0);
        ts.add(4);
        ts.add(3);

        //3.打印集合
        System.out.println(ts);

        //4.遍历集合
        System.out.println();
        //迭代器
        Iterator<Integer> it = ts.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            System.out.println(i);
        }

        System.out.println();
        //增强for
        for (Integer t : ts) {
            System.out.println(t);
        }

        System.out.println();
        //lambda表达式
        ts.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });
        System.out.println();

        ts.forEach(j-> System.out.println(j));




    }
}
