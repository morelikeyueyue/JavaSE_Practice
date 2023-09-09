package com.itheima.a07bigdecimaldemo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo3 {
    public static void main(String[] args) {

        //成员方法
        //1.获取对象
        BigDecimal bd1 = BigDecimal.valueOf(10);
        BigDecimal bd2 = BigDecimal.valueOf(5);

        //2.加法
        BigDecimal bd3 = bd1.add(bd2);
        System.out.println(bd3);//15


        //3.减法
        BigDecimal bd4 = bd1.subtract(bd2);
        System.out.println(bd4);//5

        //4.乘法
        BigDecimal bd5 = bd1.multiply(bd2);
        System.out.println(bd5);//50

        //5.除法
        BigDecimal bd6 = bd1.divide(bd2);
        System.out.println(bd6);//2

        //除不尽
        BigDecimal bd7 = bd1.divide(bd2, 2, RoundingMode.HALF_UP);
        System.out.println(bd7);//2.00


        System.out.println(bd1);//10
        System.out.println(bd2);//5

    }
}
