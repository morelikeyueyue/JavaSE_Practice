package com.itheima.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class Test5 {
    public static void main(String[] args) {
        /*
            判断任意的一个年份是闰年还是平年要求:用JDK7和JDK8两种方式判断提示:
            二月有29天是闰年一年有366天是闰年
        */


        //jdk7
        //2000.1.1 0:0:0 2000.12.31 23:59:59; 366天
        //2000.2.1 0:0:0 2000.3.1 0:0:0 间隔29

        //简化1:
        //我们可以把时间设置为2000.3.1
        Calendar c = Calendar.getInstance();
        c.set(2000, 2,1 );//月份的范围0~11
        //再把日历往前减一天
        c.add(Calendar.DAY_OF_MONTH, -1);
        //看当前的时间是28号还是29号
        int day = c.get(Calendar.DAY_OF_MONTH);
        if (day==29){
            System.out.println("2000年为闰年");
        } else if (day == 28) {
            System.out.println("2000年为平年");
        }

        //简化2:
        //我们可以把时间设置为2001.1.1
        Calendar c1 = Calendar.getInstance();
        c1.set(2001,0,1 );
        //往前减一天
        c1.add(Calendar.DAY_OF_MONTH, -1);
        //统计这一天是一年中的第几天
        int day1 = c1.get(Calendar.DAY_OF_YEAR);
        if (day1==366){
            System.out.println("2000年为闰年");
        } else if (day1 == 365) {
            System.out.println("2000年为平年");
        }


        //jdk8
        LocalDate beginDate = LocalDate.of(2000, 3, 1);
        //把时间往前减一天
        LocalDate endDate = beginDate.minusDays(1);
        //获取这一天是一个月的几号
        int day3 = endDate.getDayOfMonth();
        if (day3==29){
            System.out.println("2000年为闰年");
        } else if (day3 == 28) {
            System.out.println("2000年为平年");
        }

        boolean leapYear = beginDate.isLeapYear();
        System.out.println(leapYear);
    }
}
