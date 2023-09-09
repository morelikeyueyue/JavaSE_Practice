package com.itheima.a02mylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class A03_ListDemo3 {
    public static void main(String[] args) {
        /*
            List系列集合的五种遍历方式：
                1.迭代器
                2.列表迭代器
                3.增强for
                4.Lambda表达式
                5.普通for循环
         */

        //创建集合并添加元素
        List<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");

        //1.迭代器
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }
        System.out.println();

        //2.增强for
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println();

        //3.lambda表达式
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        list.forEach(s1-> System.out.println(s1));
        System.out.println();

        //4.普通for
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
        System.out.println();

        //5.列表迭代器(listiterator)
        //获取一个列表迭代器的对象,里面的指针默认也是指向0索引的

        //额外添加了一个方法,在遍历的过程中,可以添加元素(在指针所在的位置添加)
        ListIterator<String> it1 = list.listIterator();
        while (it1.hasNext()){
            String next = it1.next();
            if ("bbb".equals(next)){
                it1.add("qqq");
            }
            System.out.println(next);
        }

        System.out.println();
        System.out.println(list);

    }
}
