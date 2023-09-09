package com.itheima.test.test3;

public class Test {
    public static void main(String[] args) {
        /*
           同时开启两个线程，共同获取1-100之间的所有数字。
           要求：将输出所有的奇数。
        */

        MyRunnable mr = new MyRunnable();

        Thread t1 = new Thread(mr,"线程2");
        Thread t2 = new Thread(mr,"线程1");
        Thread t3 = new Thread(mr,"线程3");


        t1.start();
        t2.start();
        t3.start();

    }
}
