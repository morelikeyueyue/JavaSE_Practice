package com.itheima.a09threadsafe1;

public class MyThread extends Thread {

    //表示这个类所有的对象,都共享ticket数据
    static int ticket = 0;

    //锁对象,一定要是唯一的
    static Object lock = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (lock){
                if (ticket < 100) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    ticket++;
                    System.out.println(getName() + "售卖第" + ticket + "张票");
                } else {
                    break;
                }
            }
        }
    }
}
