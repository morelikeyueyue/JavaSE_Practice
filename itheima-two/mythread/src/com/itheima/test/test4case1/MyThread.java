package com.itheima.test.test4case1;

import java.util.Random;

public class MyThread extends Thread {
    //共享数据
    static double money = 100;
    static int count = 3;

    //最小的金额
    static final double MIN = 0.01;

    @Override
    public void run() {
        //同步代码块
        synchronized (MyThread.class) {
            //判断是否到了末尾(到了)
            if (count == 0) {
                System.out.println(getName() + "没有抢到红包");
            } else {
                //定义一个变量,表示中奖的金额
                double prize = 0;
                //判断是否到了末尾(没到)
                //不能直接随机
                if (count == 1) {
                    //最后一个红包
                    System.out.println(getName() + "抢到了" + money + "元");
                    money = 0;
                    count--;
                } else {
                    //第一次或者第二次的情况
                    Random r = new Random();
                    double bounds = money - (count - 1) * MIN;
                    prize = r.nextDouble(bounds);
                    if (prize < MIN) {
                        prize = MIN;
                    }
                    //从money中去掉中奖的金额
                    money -= prize;
                    //红包的个数减1
                    count--;
                    System.out.println(getName() + "抢到了" + prize + "元");
                }
            }

        }
    }
}
