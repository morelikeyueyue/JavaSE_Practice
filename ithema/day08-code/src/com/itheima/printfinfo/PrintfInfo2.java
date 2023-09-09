package com.itheima.printfinfo;
import java.util.Date;

// "%" 表示进行格式化输出， "%" 之后的内容为格式的定义
public class PrintfInfo2 {
    public static void main(String[] args) {
        int i = 111;
        double d = Math.PI;
        String s = "Regino";
        Date dt = new Date();

        //整型的输出
        System.out.printf("%d", i);//"d"表示输出十进制整数
        System.out.println();
        System.out.printf("%04d", i);//规定为4位，不够左边添加0
        System.out.println();
        System.out.printf("%d%%", i);//如果想输出百分数，则连续用两个 %%
        System.out.println();
        System.out.printf("%o", i);//"o"表示输出8进制整数
        System.out.println();
        System.out.printf("%x", i);//"x"表示输出16进制整数
        System.out.println();
        System.out.printf("%X", i);//"X"表示输出16进制整数,并且字母变成大写形式
        System.out.println("\n---------");

        //浮点型的输出
        System.out.printf("%e", d);// %e 表示以科学技术法输出浮点数
        System.out.println();
        System.out.printf("%E", d);// %E 表示以科学技术法输出浮点数，并且为大写形式
        System.out.println();
        System.out.printf("%f", d);// %f 表示以十进制格式化输出浮点数
        System.out.println();
        System.out.printf("%.2f", d);// %f 用小数点后的数字限制小数点后的位数
        System.out.println("\n---------");

        //字符串的输出
        System.out.printf("%s", 1212);// %s 表示输出字符串，也就是将后面的字符串替换模式中的 %s
        System.out.println();
        System.out.printf("%s%n", "next line");// %n 表示换行
        System.out.printf("%s = %s%n", "Name", "Regino");// %n 还可以支持多个参数
        System.out.printf("%S = %s%n", "Name", "Regino");// %S 将字符串以大写形式输出
        System.out.printf("%1$s = %3$s %2$s%n", "Name", "ino", "Reg");// 支持多个参数时，可以在%s之间插入变量编号，1$表示第一个字符串，3$表示第3个字符串
        System.out.println("---------");

        //日期类型的输出
        System.out.printf("%1$tc%n", dt);//输出时间日期的完整信息
        //常见的日期组合
        System.out.printf("%1$tD%n", dt);// %t 之后用D表示以 "%tm/%td/%ty" 格式化日期
        System.out.printf("%1$tF%n", dt);// %t 之后用F表示以 "%tY-%tm-%td" 格式化日期
        System.out.printf("%1$tF %1$ta%n", dt);// %t 之后用a表示得到星期几的简称
        System.out.printf("%1$tF %1$tA%n", dt);// %t 之后用A表示得到星期几的全称
        //常见的时间组合
        System.out.printf("%1$tR%n", dt);// %t 之后用R表示以 "%tH:%tM" 格式化时间
        System.out.printf("%1$tT%n", dt);// %t 之后用T表示以 "%tH:%tM:%tS" 格式化时间
        System.out.printf("%1$tr%n", dt);// %t 之后用r表示以 "%tI:%tM:%tS %Tp" 格式化时间
    }
}

