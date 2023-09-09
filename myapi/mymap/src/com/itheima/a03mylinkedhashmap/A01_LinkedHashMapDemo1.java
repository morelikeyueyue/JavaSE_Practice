package com.itheima.a03mylinkedhashmap;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class A01_LinkedHashMapDemo1 {
    public static void main(String[] args) {

        //1.创建集合
        LinkedHashMap<String, String> lhm = new LinkedHashMap<>();

        //2.添加元素
        lhm.put("1","a");
        lhm.put("2","b");
        lhm.put("3","c");

        //3.打印集合
        System.out.println(lhm);

    }
}
