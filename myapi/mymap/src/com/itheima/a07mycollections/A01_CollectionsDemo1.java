package com.itheima.a07mycollections;

import java.util.ArrayList;
import java.util.Collections;

public class A01_CollectionsDemo1 {
    public static void main(String[] args) {

        //addAll 批量添加
        //1.创建集合对象
        ArrayList<String> list = new ArrayList<>();

        //2.批量添加
        Collections.addAll(list,"aaa","bbb","1234","ccc","ddd");

        //3.打印集合
        System.out.println(list);



        //shuffle 打乱
        Collections.shuffle(list);
        System.out.println(list);


    }
}
