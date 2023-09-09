package com.itheima.a01jdk7datedemo;

import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) {

        //1.创建对象,表示一个时间
        Date  d1 = new Date();
        System.out.println(d1);

        //创建对象,表示一个指定的世界
        Date d2 = new Date(0L);
        System.out.println(d2);

        //setTime 修改世界
        d2.setTime(1000L);
        System.out.println(d2);

        //getTime 获取当前时间的毫秒值
        long time = d2.getTime();
        System.out.println(time);


    }
}
