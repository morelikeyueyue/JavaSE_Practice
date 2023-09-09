package com.itheima.a02stream.a01mystream;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StreamDemo3 {
    public static void main(String[] args) {
//        双列集合      无                  无法直接使用stream流

        //1.创建双列集合
        HashMap<String, Integer> hm = new HashMap<>();

        //2.添加元素
        hm.put("a",1);
        hm.put("b",2);
        hm.put("c",3);
        hm.put("d",4);

        //3.获取stream流
        //3.1获取keyset
        Set<String> keys = hm.keySet();
        keys.stream().forEach(s -> System.out.println(s));

        //3.2获取entryset
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        entries.stream().forEach(s-> System.out.println(s));

    }
}
