package com.itheima.a13waitandnotify;

public class Foodie extends Thread  {
    /**
     * 作用:消费者
     * 1.循环
     * 2.同步代码块 synchronized
     * 3.判断共享数据是否到了末尾(到了末尾)
     * 4.判断共享数据是否到了末尾(没有到末尾.执行核心逻辑)
     */
    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock){
                if (Desk.count==0){
                    break;
                }else {
                    //先去判断桌子上是否有面条
                    if (Desk.foodFlag==0){
                        //如果没有:等待
                        try {
                            Desk.lock.wait();//让当前线程跟锁进行绑定
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else {
                        //如果有:就开吃
                        //把吃的总数-1
                        Desk.count--;
                        System.out.println("吃货正在吃面条,还能再吃"+Desk.count+"碗!!!");
                        //吃完之后,唤醒厨师继续做
                        Desk.lock.notifyAll();
                        //修改桌子的状态
                        Desk.foodFlag=0;
                    }
                }
            }
        }
    }


}
