package com.itheima.a08test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {

        /*
            班级里面有n个学生,学生属性:姓名,年龄,性别
            实现随机点名器
         */
        //1.定义集合
        ArrayList<String> list = new ArrayList<>();
        //2.添加数据
        Collections.addAll(list,"范闲","范建","范统","杜紫娟","杜艳齐","宋和凡","祝一切","战三","李四","王五");
        //3.随机点名
        Random r = new Random();
        int index = r.nextInt(list.size());

        String name = list.get(index);
        System.out.println(name);


        Collections.shuffle(list);
        String s = list.get(0);
        System.out.println(s);


    }
}
