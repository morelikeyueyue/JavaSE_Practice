package com.itheima.a06bigintegerdemo;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerDemo1 {
    public static void main(String[] args) {

        //1.获取一个随机的大整数
/*        Random r   = new Random();
        for (int i=0;i<100;i++) {
            BigInteger bd1 = new BigInteger(4,r);//new Random()
            System.out.println(bd1);
        }*/

        //2.获取一个指定的大整数
        //字符串里面的数字必须是整数,必须要跟进制温和,比如二进制中只能写0和1
/*        BigInteger bd2 = new BigInteger("9999999999999999999999999999999999999999999999999999999999999");
        System.out.println(bd2);*/

        //3.获取指定进制的大整数
/*        BigInteger bd3 = new BigInteger("100",10);
        System.out.println(bd3);
        BigInteger bd4 = new BigInteger("110",2);
        System.out.println(bd4);*/

        //4.静态方法获取BigInteger的对象,内部有优化
        //细节:表示的范围比较小,在long的范围之内,超出不行
        //在内部对常用的数字: -16~16 进行了优化
        // 提前把 -16 ~ 16 先创建好bigInteger 的对象,如果多次获取不会重新创建新的
/*        BigInteger bd5 = BigInteger.valueOf(100);
        System.out.println(bd5);

        long maxValue = Long.MAX_VALUE;//9223372036854775807
        BigInteger bd6 = BigInteger.valueOf(9223372036854775807L);
        System.out.println(bd6);*/

        BigInteger bd5 = BigInteger.valueOf(16);
        BigInteger bd6 = BigInteger.valueOf(16);

        System.out.println(bd5 == bd6);//true


        BigInteger bd7 = BigInteger.valueOf(17);
        BigInteger bd8 = BigInteger.valueOf(17);

        System.out.println(bd7 == bd8);//false

        //5.对象一旦创建,内部的数据不在发生改变
        BigInteger bd9 = BigInteger.valueOf(1);
        BigInteger bd10 = BigInteger.valueOf(2);
        //1+2
        BigInteger result = bd9.add(bd10);
        System.out.println(result);//3
        //不会修改参与计算的BigInteger对象中的值,而是产生了一个新的BigInteger对象记录3
        System.out.println(bd9);
        System.out.println(bd10);



    }
}
