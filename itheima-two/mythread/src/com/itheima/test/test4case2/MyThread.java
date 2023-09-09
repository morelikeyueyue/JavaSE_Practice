package com.itheima.test.test4case2;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class MyThread extends Thread {
    //共享数据
//    static double money = 100;

    //总金额
    static BigDecimal money = BigDecimal.valueOf(100.0);
    //红包个数
    static int count = 3;
    //最小抽奖金额
    static final BigDecimal MIN =BigDecimal.valueOf(0.01);


    @Override
    public void run() {
        //同步代码块
        synchronized (MyThread.class) {
            //判断是否到了末尾(到了)
            if (count == 0) {
                System.out.println(getName() + "没有抢到红包");
            } else {
                //定义一个变量,表示中奖的金额
                BigDecimal prize;
                //判断是否到了末尾(没到)
                //不能直接随机
                if (count == 1) {
                    //最后一个红包
                    prize = money;
                } else {
                    //第一次或者第二次的情况
                    Random r = new Random();
//                    double bounds = money - (count - 1) * MIN;
                    double bounds = money.subtract(BigDecimal.valueOf(count-1).multiply(MIN)).doubleValue();
                    prize = BigDecimal.valueOf(r.nextDouble(bounds));
                }
                //设置抽中红包，小数点保留两位，四舍五入
                prize = prize.setScale(2, RoundingMode.HALF_UP);
                //从money中去掉中奖的金额
                //红包的个数减1
                money = money.subtract(prize);
                count--;
                //输出红包信息
                System.out.println(getName() + "抽中了" + prize + "元");
            }

        }
    }
}
