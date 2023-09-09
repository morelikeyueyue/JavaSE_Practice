package com.itheima.a01mymap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class A02_MapDemo2 {
    public static void main(String[] args) {
        //Map集合的第一种遍历方式

        //1.创建Map集合的对象
        Map<String,String> map = new HashMap<>();

        //2.添加元素
        map.put("1", "a");
        map.put("2", "b");
        map.put("3", "c");

        //3.通过键找值

        //3.1获取所有的键,把这些键放到一个单列集合中
        Set<String> keys = map.keySet();
        //3.2遍历单列集合,得到每一个值
        for (String key : keys) {
//            System.out.println(key);
            //3.3利用map集合中的键去获取对应的值
            String value = map.get(key);
            System.out.println(key+" = "+value);
        }
        System.out.println();

        //迭代器
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String key = it.next();
            String value = map.get(key);
            System.out.println(key+" = "+value);
        }
        System.out.println();

        //lambda表达式
        keys.forEach( s ->{
                String value = map.get(s);
                System.out.println(s+" = "+value);
            }
        );

    }
}
