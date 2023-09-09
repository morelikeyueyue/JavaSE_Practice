package com.itheima.a01immutable;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ImmutableDemo1 {
    public static void main(String[] args) {
        /*
            创建不可变的List集合
            "张三", "李四", "王五", "赵六"
        */

        //一旦创建完毕之后无法进行修改
        List<String> list = List.of("张三", "李四", "王五", "赵六");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));

        System.out.println("==============1===========");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("=============2============");
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("============3=============");
        list.forEach( s -> System.out.println(s));

        System.out.println("=============4============");
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s = it.next();
            System.out.println(s);
        }

        //list.remove("张三");
        //list.add("aaa");
        //list.set(0,"aaa");

    }
}
