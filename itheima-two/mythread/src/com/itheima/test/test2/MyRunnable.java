package com.itheima.test.test2;

public class MyRunnable implements Runnable {
    int count = 100;
    @Override
    public void run() {
        //1.循环
        while (true){
            //2.同步代码块
            synchronized (MyRunnable.class){
                //3.判断是否到末尾(已经到末尾)
                if (count<10){
                    break;
                }else {
                    //4.判断是否到末尾(还没有到末尾)
                    count--;
                    System.out.println(Thread.currentThread().getName() + "在赠送礼物,还剩下"+count+"件礼物!");
                }
            }
        }
    }
}
