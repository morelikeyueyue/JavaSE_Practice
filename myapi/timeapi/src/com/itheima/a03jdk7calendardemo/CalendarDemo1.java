package com.itheima.a03jdk7calendardemo;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo1 {
    public static void main(String[] args) {
        /*
            public static Calendar getInstance()               获取当前时间的日历对象
            public final Date getTime()                         获取日期对象
            public final setTime(Date date)                     给日历设置日期对象
            public long getTimeInMillis()                       拿到时间毫秒值
            public void setTimeInMillis(long millis)            给日历设置时间毫秒值
            public int get(int field)                           获取日期中的某个字段信息
            public void set(int field,int value)                修改日历的某个字段信息
            public void add(int field,int amount)               为某个字段增加/减少指定的值
        */

        //1.获取日期对象
        //细节:Calendar是一个抽象类 不能直接new 而是通过一个静态方法获取到子类
        //底层原理:会根据系统中不同时区来获取不同的日期对象
        //会把时间中的纪元 年 月 日 时分秒 星期 等等 都放到一个数组当中
        //细节2:
        //月份:范围0~11
        //星期 在老外眼里 星期日是一周的第一天   1(星期日) 2(星期一)
        Calendar c = Calendar.getInstance();
//        System.out.println(c);

        //2.修改一下日历代表的时间
        Date d = new Date();
        c.setTime(d);
        System.out.println(c);
        System.out.println(c.getTimeInMillis());
        c.setTimeInMillis(1000L);
        System.out.println(c.getTimeInMillis());

        //3.取日期中的某个字段信息  修改日历的某个字段信息 为某个字段增加\减少指定的值
        // 0 纪元 1 年 2 月 3一年中的第几周 4 一个月中的第几周 5 一个月的中第几天

        c.set(Calendar.YEAR, 2023);
        c.set(Calendar.MONTH, 8);//最大11 大了会自动增加年
        c.set(Calendar.DAY_OF_MONTH,10);
        //调用方法在这个基础上增加一个月
        c.add(Calendar.MONTH,-1);


        //java在calendar类中,把索引对应的数字都定义成了常量
        int year = c.get(1);//Calendar.YEAR
        int month = c.get(2);
        int date = c.get(5);
        int week = c.get(Calendar.DAY_OF_WEEK);

        System.out.println(year+", "+(month+1)+", "+date+","+getWeek(week));





    }

    //查表法
    public static String getWeek(int index){
        //定义一个数组,让汉字星期几,跟1-7产生关系
        String[] arr = {"星期天","星期一","星期二","星期三","星期四","星期五","星期六"};
        return arr[index-1];
    }
}
