package com.itheima.a08test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test3 {
    public static void main(String[] args) {

        /*
            班级里面有n个学生,学生属性:姓名,年龄,性别
            实现随机点名器
            70% 男生
            30% 女生
         */
        //1.定义集合
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> girlList = new ArrayList<>();

        //2.添加数据
        Collections.addAll(list,1,1,1,1,1,1,1,0,0,0);
        Collections.addAll(boyList,"范闲","范建","范统","杜紫娟","杜艳齐","宋和凡","祝一切","战三","李四","王五");
        Collections.addAll(girlList,"小妹","王小梅","甘雨","宵宫");

        //利用集合工具类打乱数组,取第一个
        Collections.shuffle(list);
        Collections.shuffle(boyList);
        Collections.shuffle(girlList);
        Integer number = list.get(0);
        //System.out.println(number);
        if (number == 1){
            System.out.println(boyList.get(0));
        } else if (number == 0) {
            System.out.println(girlList.get(0));
        }


        //利用 random随机数打乱
        Random r = new Random();
        int num = r.nextInt(list.size());
        if (num == 1){
            int boyIndex = r.nextInt(boyList.size());
            String name = boyList.get(boyIndex);
            System.out.println(name);
        } else if (num == 0) {
            int girlIndex = r.nextInt(girlList.size());
            String name = girlList.get(girlIndex);
            System.out.println(name);
        }


    }
}
