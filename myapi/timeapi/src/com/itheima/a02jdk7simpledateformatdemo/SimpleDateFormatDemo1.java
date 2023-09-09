package com.itheima.a02jdk7simpledateformatdemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo1 {
    public static void main(String[] args) {

//        method();


        //1.定义一个字符串表示时间
        String str = "2023-11-11 11:11:11";
        //2.利用构造方法创建对象
        //细节:创建对象的格式要个字符串中的格式完全一致
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d1;
        try {
            d1 = sdf1.parse(str);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        //3.打印结果
        System.out.println(d1.getTime());

    }

    private static void method() {
        //1.利用空参构造创建对象 默认格式
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        Date d1 = new Date(0L);
        String str1 = sdf1.format(d1);//1970/1/1 上午8:00
        System.out.println(str1);

        //2.利用带参构造创建对象 指定格式
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EE");
        Date d2 = new Date(0L);
        String str2 = sdf2.format(d2);//1970/1/1 上午8:00
        System.out.println(str2);

        //课堂练习: yyyy年MM月dd日 时:分:秒 星期
    }
}
