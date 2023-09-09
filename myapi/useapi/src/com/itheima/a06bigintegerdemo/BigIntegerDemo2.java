package com.itheima.a06bigintegerdemo;

import java.math.BigInteger;

public class BigIntegerDemo2 {
    public static void main(String[] args) {
        //常用方法


        //1.加法
        BigInteger bd1 = BigInteger.valueOf(10);
        BigInteger bd2 = BigInteger.valueOf(5);

        BigInteger add = bd1.add(bd2);
        System.out.println(add);//15

        //2.减法
        BigInteger subtract = bd1.subtract(bd2);
        System.out.println(subtract);//5

        //3.乘法
        BigInteger multiply = bd1.multiply(bd2);
        System.out.println(multiply);//50

        //4.除法  获取商
        BigInteger divide = bd1.divide(bd2);
        System.out.println(divide);//2

        //5.除法 获取商和余数
        BigInteger[] bigIntegers = bd1.divideAndRemainder(add);
        System.out.println(bigIntegers.length);//2
        for (int i = 0; i < bigIntegers.length; i++) {
            System.out.println(bigIntegers[i]);//0 10
        }

        //6.判断两个biginteger对象的属性值是否相等 重写了object的equals方法
        boolean equals = bd1.equals(bd2);
        System.out.println(equals);//false

        //7.次幂
        BigInteger pow = bd1.pow(2);
        System.out.println(pow);//100

        //8.返回较大值\较小值
        BigInteger max = bd1.max(bd2);
        BigInteger min = bd1.min(bd2);
        System.out.println(max);//10
        System.out.println(min);//5

        //9.将BigInteger对象的属性值 转换为基本数据类型
        int i = bd1.intValue();
        System.out.println(i);//10

        float v = bd1.floatValue();
        System.out.println(v);//10.0

        byte b = bd1.byteValue();
        System.out.println(b);//10

        double v1 = bd1.doubleValue();
        System.out.println(v1);//10.0

//        int[] arr = new int[Integer.MAX_VALUE];

    }
}
