package com.itheima.a02jdk7simpledateformatdemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo2 {
    public static void main(String[] args) throws ParseException {
        //需求1:你初恋的出生年月日为 2000-11-11
//        请用这个字符串转换为 2000年11月11日
        //1.将字符串存储起来
        String str = "2000-11-11";
        //2.创建simpledateformat跟字符串的格式相同(解析)
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        //创建date对象以便获取毫秒值,利用parse方法解析
        Date d1 = sdf1.parse(str);
/*        //4.创建另外一个date对象接收获取的毫秒值
        Date d2 = new Date(d1.getTime());*/
        //3.创建一个正确输出格式的simpledateformat对象(格式化)
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        //6.利用format方法将date对象中的毫秒值转换为字符串
        String format = sdf2.format(d1);
        //7.打印正确格式
        System.out.println(format);


    }
}
