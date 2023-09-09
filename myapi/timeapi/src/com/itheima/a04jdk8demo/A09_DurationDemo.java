package com.itheima.a04jdk8demo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class A09_DurationDemo {
    public static void main(String[] args) {
        // 本地日期时间对象。
        LocalTime today = LocalTime.now();
        System.out.println(today);

        // 出生的日期时间对象
        LocalTime birthDate = LocalTime.of(0,0,0,0);
        System.out.println(birthDate);

        Duration duration = Duration.between(birthDate, today);//第二个参数减第一个参数
        System.out.println("相差的时间间隔对象:" + duration);

        System.out.println("============================================");
        System.out.println(duration.toDays());//两个时间差的天数
        System.out.println(duration.toHours());//两个时间差的小时数
        System.out.println(duration.toMinutes());//两个时间差的分钟数
        System.out.println(duration.toMillis());//两个时间差的毫秒数
        System.out.println(duration.toNanos());//两个时间差的纳秒数
    }
}
