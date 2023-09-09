package com.itheima.listdemo;

import java.util.ArrayList;

public class ArrayDemo2 {
    public static void main(String[] args) {

        //1.创建对象
        ArrayList<String> list = new ArrayList<>();

        // 添加
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //删除
//        boolean result = list.remove("ddd");

//        String remove = list.remove(1);


        //修改
        String remove = list.set(0, "ddd");

        //查询
        String s = list.get(0);

        //获得长度
        int size = list.size();
        System.out.println(size);
        System.out.println(s);
        System.out.println(remove);
//        System.out.println(result);
        System.out.println(list);

        //遍历list
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
