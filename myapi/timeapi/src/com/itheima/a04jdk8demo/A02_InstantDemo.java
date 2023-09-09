package com.itheima.a04jdk8demo;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class A02_InstantDemo {
    public static void main(String[] args) {
        /*
            static Instant now() 获取当前时间的Instant对象(标准时间)
            static Instant ofXxxx(long epochMilli) 根据(秒/毫秒/纳秒)获取Instant对象
            ZonedDateTime atZone(ZoneIdzone) 指定时区
            boolean isxxx(Instant otherInstant) 判断系列的方法
            Instant minusXxx(long millisToSubtract) 减少时间系列的方法
            Instant plusXxx(long millisToSubtract) 增加时间系列的方法
        */


        //1.获取当前时间的Instant对象(标准时间) 本初子午线
        Instant now = Instant.now();
        System.out.println(now);

        //2.根据(秒/毫秒/纳秒)获取Instant对象
        Instant instant1 = Instant.ofEpochMilli(0L);
        Instant instant2 = Instant.ofEpochSecond(1L);
        Instant instant3 = Instant.ofEpochSecond(2L, 1000000000);
        System.out.println(instant1);
        System.out.println(instant2);
        System.out.println(instant3);

        //3.指定时区
        ZonedDateTime time = now.atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(time);

        //4.is 判断 minus 减少 plus 增加
        Instant instant4 = Instant.ofEpochMilli(0L);
        Instant instant5 = Instant.ofEpochMilli(1000L);
        // before 调用者是否在参数前面
        boolean result1 = instant4.isBefore(instant5);
        // after 调用者是否在后面
        boolean result2 = instant4.isAfter(instant5);
        System.out.println(result1);
        System.out.println(result2);


        //5.minus 原有时间不变 产生新的对象
        Instant instant6 = Instant.ofEpochMilli(3000L);
        System.out.println(instant6);
        Instant instant7 = instant6.minusMillis(1000);
        System.out.println(instant7);
        Instant instant8 = instant6.plusSeconds(1);
        System.out.println(instant8);

    }
}
