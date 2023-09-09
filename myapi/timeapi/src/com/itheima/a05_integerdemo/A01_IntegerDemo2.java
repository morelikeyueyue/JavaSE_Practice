package com.itheima.a05_integerdemo;

public class A01_IntegerDemo2 {
    public static void main(String[] args) {
        //在以前包装内如何进行计算
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(2);

        //相加 对象之间不能直接进行计算的
        //步骤: 1.把对象进行拆箱,变成基本数据类型,把得到的结果在进行装箱(变成包装类)

        int result = i1.intValue() + i2.intValue();
        Integer i3 = new Integer(result);

        System.out.println(i3);


    }
}
