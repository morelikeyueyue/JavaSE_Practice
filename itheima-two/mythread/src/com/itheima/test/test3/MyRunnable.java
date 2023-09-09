package com.itheima.test.test3;

public class MyRunnable implements Runnable {

    int number =1;
    @Override
    public void run() {
        //1.循环
        while(true){
            //2.同步代码块
            synchronized (MyRunnable.class){
                //3.判断是否到末尾(到了)
                if (number==101){
                    break;
                }else {
                    //4.判断是否到了末尾(还没到)
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (number%2==1){
                        System.out.println(Thread.currentThread().getName()+"打印"+number+"是个奇数");
                    }
                    number++;
                }
            }
        }
    }
}
