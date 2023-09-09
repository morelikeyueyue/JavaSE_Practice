package com.itheima.a01mymap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class A03_MapDemo3 {
    public static void main(String[] args) {
        //Map集合的第二种遍历方式

        //1.创建Map集合的对象
        Map<String, String> map = new HashMap<>();

        //2.添加元素
        map.put("1", "a");
        map.put("2", "b");
        map.put("3", "c");

        //3.通过键值对
        //3.1 通过一个方法获取所有的键值对对象 返回一个set集合
        Set<Map.Entry<String, String>> entries = map.entrySet();

        //3.2 遍历set集合 得到键 和 值
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
        System.out.println();
        //迭代器
        Iterator<Map.Entry<String, String>> it = entries.iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }
        System.out.println();
        //lambda表达式
        entries.forEach(entry-> {
                String key = entry.getKey();
                String value = entry.getValue();
                System.out.println(key + "=" + value);
            }
        );


    }
}
