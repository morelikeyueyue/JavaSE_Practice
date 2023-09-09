package com.itheima.a01jdk7datedemo;

import java.util.Date;
import java.util.Random;

public class DateDemo2 {
    public static void main(String[] args) {

        //需求1:打印时间原点一年以后的时间
//        extracted();


        //需求2: 定义任意连个date对象,比较哪个时间在前
        Random r = new Random();
        Date d1 = new Date(Math.abs(r.nextInt()));
        Date d2 = new Date(Math.abs(r.nextInt()));
        System.out.println(d1);
        System.out.println(d2);

        long time1 = d1.getTime();
        long time2 = d2.getTime();

        if (time1 < time2) {
            System.out.println("d1时间在前");
        }else if (time1>time2){
            System.out.println("d2时间在前");
        }else {
            System.out.println("时间相同");
        }


    }

    private static void extracted() {
        //1.创建一个对象,表示时间原点
        Date d1 = new Date(0L);
        //2.获取d1时间的毫秒值
        long time = d1.getTime();
        //3.在这个基础上我们要加一年的毫秒值即可
        time+=1000L*60*60*24*365;
        //4.将计算之后的时间毫秒值在设置回d1中
        d1.setTime(time);
        //5.打印d1
        System.out.println(d1);
    }
}
