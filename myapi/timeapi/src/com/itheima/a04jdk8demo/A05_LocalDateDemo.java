package com.itheima.a04jdk8demo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

public class A05_LocalDateDemo {
    public static void main(String[] args) {
        //1.获取当前时间的日历对象(年月日)
        LocalDate ld = LocalDate.now();
        System.out.println(ld);


        //2.获取指定时间的日历对象
        LocalDate ld1 = LocalDate.of(2020, 1, 1);
        System.out.println(ld1);

        //3.get方法获取日历中的每一个属性值
        //获取年
        int year = ld1.getYear();

        //获取月(两种方式)
        Month month1 = ld1.getMonth();
        System.out.println(month1.getValue());

        int month = ld1.getMonthValue();
        System.out.println(month);

        //获取日
        int dayOfMonth = ld1.getDayOfMonth();
        System.out.println(dayOfMonth);

        int dayOfYear = ld1.getDayOfYear();
        System.out.println(dayOfYear);



        DayOfWeek dayOfWeek = ld1.getDayOfWeek();
        System.out.println(dayOfWeek);
        System.out.println("星期"+dayOfWeek.getValue());

        //修改之后会产生新的对象
        //with开头的方法表示判断
        LocalDate localDate = ld1.withYear(2000);
        System.out.println(localDate);
        //minus开头表示减少 plus开头表示增加
        LocalDate localDate1 = ld1.minusYears(2);
        System.out.println(localDate1);


        //判断今天是否是你的生日
        LocalDate birDate = LocalDate.of(2002, 5, 23);
        LocalDate nowDate1 = LocalDate.now();

        MonthDay birMD = MonthDay.of(birDate.getMonthValue(), birDate.getDayOfMonth());
        MonthDay nowMD = MonthDay.from(nowDate1);
        System.out.println("今天是你的生日吗"+birMD.equals(nowMD));


    }
}
