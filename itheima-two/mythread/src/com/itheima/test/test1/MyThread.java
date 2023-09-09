package com.itheima.test.test1;

public class MyThread extends Thread {
    //第一种方式实现多线程，测试类中MyThread会创建多次，所以需要加static
    static int ticket = 0;
    @Override
    public void run() {
        //1.循环
        while (true) {
            //2.同步代码块
            synchronized (MyThread.class) {
                //3.判断共享数据是否到末尾(已经到末尾)
                if (ticket==1000){
                    break;
                }else {
                    //还没到末尾
                    ticket++;
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName()+"卖出一张票,还剩下"+(1000-ticket)+"张票!!");
                }
            }
        }
    }
}
