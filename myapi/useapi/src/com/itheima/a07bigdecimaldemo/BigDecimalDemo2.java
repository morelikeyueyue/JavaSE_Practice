package com.itheima.a07bigdecimaldemo;

import java.math.BigDecimal;

public class BigDecimalDemo2 {
    public static void main(String[] args) {
/*        构造方法获取BigDecimal对象
            public BigDecimal(double val)
            public BigDecimal(String val)*/

        //1.通过传递double类型的小数来创建对象
        //细节:可能是不精确的,所有不建议
        BigDecimal bd1 = new BigDecimal(0.01);
        BigDecimal bd2 = new BigDecimal(0.09);
        System.out.println(bd1);
        System.out.println(bd2);

        //2.通过传递double类型的小数来创建对象
        //细节:不会不精确
        BigDecimal bd3 = new BigDecimal("0.01");
        BigDecimal bd4 = new BigDecimal("0.09");
        BigDecimal bd5 = bd3.add(bd4);
        System.out.println(bd3);
        System.out.println(bd4);
        System.out.println(bd5);


        //3.静态方法获取对象
        //如果我们传递的是0`10之间的整数,包含0包含10,那么方法会返回自己已经创建好的对象,不会重新new
        BigDecimal bd6 = BigDecimal.valueOf(10);
        BigDecimal bd7 = BigDecimal.valueOf(10);
        BigDecimal bd8 = BigDecimal.valueOf(21,6);
        System.out.println(bd6);
        System.out.println(bd7);
        System.out.println(bd6==bd7);
        System.out.println(bd8);


        //细节:1.如果表示的数字的不大,没有超出double的取值范围,建议使用静态方法
        //2.如果超出了数字比较大,超出了double的取值范围,建议使用字符串构造方法


    }
}
