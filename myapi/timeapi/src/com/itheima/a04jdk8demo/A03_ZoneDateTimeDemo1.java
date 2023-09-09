package com.itheima.a04jdk8demo;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class A03_ZoneDateTimeDemo1 {
    public static void main(String[] args) {
                /*
            static ZonedDateTime now() 获取当前时间的ZonedDateTime对象
            static ZonedDateTime ofXxxx(。。。) 获取指定时间的ZonedDateTime对象
            ZonedDateTime withXxx(时间) 修改时间系列的方法
            ZonedDateTime minusXxx(时间) 减少时间系列的方法
            ZonedDateTime plusXxx(时间) 增加时间系列的方法
         */

        //1.获取当前时间对象(带时区)
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        //2.获取指定的时间对象(带时区)
        //年月日时分秒方式指定
        ZonedDateTime time1 = ZonedDateTime.of(2023, 10, 1, 11,
                12, 12, 0, ZoneId.of("Asia/Shanghai"));
        System.out.println(time1);

        //3.通过Instant + 时区的方式指定获取时间对象
        Instant instant1 = Instant.ofEpochMilli(0L);
        ZoneId zoneId1 = ZoneId.of("Asia/Shanghai");
        ZonedDateTime time2 = ZonedDateTime.ofInstant(instant1, zoneId1);
        System.out.println(time2);


        //4.withXxx 修改时间系列方法 减少时间minus 增加时间 plus
        ZonedDateTime time3 = time2.withYear(2000);
        System.out.println(time3);

        ZonedDateTime time4 = time2.minusDays(1);
        System.out.println(time4);

        ZonedDateTime time5 = time2.plusDays(1);
        System.out.println(time5);

        //JDK8新增的时间对象是不可变的 如果我们修改了 增加 减少了 都会产生新的时间对象 调用者是不变的

    }
}
