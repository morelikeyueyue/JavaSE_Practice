package com.itheima.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Test4 {
    public static void main(String[] args) throws ParseException {
        //请使用代码实现计算你活了多少天，用JDK7和JDK8两种方式完成
        //JDK7
        //规则:只要对时间进行计算或者判断，都需要先获取当前时间的毫秒值

        //jdk7:
        String birStr ="2002-05-23";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(birStr);
        long birTime = date.getTime();
        long nowTime = System.currentTimeMillis();
        long live = (nowTime-birTime)/1000/60/60/24;
        System.out.println("活了"+live+"天");

        //JDK8
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2002, 5, 23);
        long day = ChronoUnit.DAYS.between(date2, date1);
        System.out.println(day);

    }
}
