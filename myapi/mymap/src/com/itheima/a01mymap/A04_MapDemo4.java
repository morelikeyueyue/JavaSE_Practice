package com.itheima.a01mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class A04_MapDemo4 {
    public static void main(String[] args) {
        //Map集合的第三种遍历方式

        //1.创建Map集合的对象
        Map<String, String> map = new HashMap<>();

        //2.添加元素
        map.put("1", "a");
        map.put("2", "b");
        map.put("3", "c");

        //3.通过lambda表达式
        //底层:方法其实利用第二种方法进行遍历,一次得到每一个键和值,再调用accept方法
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key+"="+value);
            }
        });

        //省略写法
        map.forEach((String key, String value) -> System.out.println(key+"="+value)
        );

    }
}
