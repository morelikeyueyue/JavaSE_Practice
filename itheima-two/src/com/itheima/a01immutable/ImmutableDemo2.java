package com.itheima.a01immutable;

import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class ImmutableDemo2 {
    public static void main(String[] args) {
        /*
            创建不可变的List集合
            "张三", "李四", "王五", "赵六"

            细节:元素唯一不重复
            当我们要获取一个不可变的set集合时,里面的参数一定要保证唯一性

        */
        Set<String> set = Set.of("张三", "李四", "王五", "赵六","张1三");


        System.out.println("==============1===========");
        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("=============2============");
        set.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("============3=============");
        set.forEach( s -> System.out.println(s));

        System.out.println("=============4============");
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

        //list.remove("张三");
        //list.add("aaa");
        //list.set(0,"aaa");


    }
}
