package com.itheima.a08test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
          /*
            班级里面有n个学生,学生属性:姓名,年龄,性别
            实现随机点名器
            不重复
         */

        //1.定义集合
        ArrayList<String> list = new ArrayList<>();
        //创建一个临时的集合存储已经被点到学生的名字
        ArrayList<String> list2 = new ArrayList<>();
        //2.添加数据
        Collections.addAll(list, "范闲", "范建", "范统", "杜紫娟", "杜艳齐", "宋和凡", "祝一切", "战三", "李四", "王五");

/*        //外循环:表示轮数
        for (int i = 0; i <= 10; i++) {
            System.out.println("=============第" + (j + 1) + "轮开始了=========");
            //3.获取集合的长度
            int len = list.size();
            //4.随机点名
            for (int j = 0; j < len; j++) {
                Random r = new Random();
                int index = r.nextInt(list.size());
                String name = list.remove(index);
                list2.add(name);
                System.out.println(name);
            }
            //此时表示一轮点名结束
            list.addAll(list2);
            list2.clear();
        }*/

        for (int j = 0; j < 10; j++) {
            System.out.println("=========第"+(j+1)+"轮==========");
            //一轮不重复
            int len = list.size();
            for (int i = 0; i < len; i++) {
                Random r = new Random();
                int index = r.nextInt(list.size());
                String name = list.remove(index);
                System.out.println(name);
                list2.add(name);
            }
            //一轮结束
            list.addAll(list2);
            list2.clear();
        }




    }
}
