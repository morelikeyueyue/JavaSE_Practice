package com.itheima.a04jdk8demo;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class A07_LocalDateTimeDemo {
    public static void main(String[] args) {

        //当前时间的日历对象 年月日时分秒
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println(nowDateTime);

        System.out.println(nowDateTime.getYear());
        System.out.println(nowDateTime.getMonthValue());
        System.out.println(nowDateTime.getDayOfMonth());
        System.out.println(nowDateTime.getHour());
        System.out.println(nowDateTime.getMinute());
        System.out.println(nowDateTime.getSecond());
        System.out.println(nowDateTime.getNano());




    }
}
