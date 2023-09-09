package com.itheima.a04jdk8demo;

import java.time.LocalTime;

public class A06_LocalTimeDemo {
    public static void main(String[] args) {

        //获取本地时间的日历对象 时分秒
        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);

        int hour = nowTime.getHour();
        int minute = nowTime.getMinute();
        int second = nowTime.getSecond();
        int nano = nowTime.getNano();
        System.out.println(hour);
        System.out.println(minute);
        System.out.println(second);
        System.out.println(nano);

        System.out.println(LocalTime.of(8, 20));
        System.out.println(LocalTime.of(8,20,30,150));
        LocalTime mTime = LocalTime.of(8, 20, 30, 150);

        //isBefore ifAfter 判断大小
        System.out.println(nowTime.isBefore(mTime));
        System.out.println(nowTime.isAfter(mTime));


        //with minus plus 只能修改时分秒
        LocalTime localTime = nowTime.withHour(10);
        System.out.println(localTime);

    }
}
