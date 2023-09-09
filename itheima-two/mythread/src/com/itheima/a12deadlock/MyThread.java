package com.itheima.a12deadlock;

public class MyThread extends Thread {

    static Object lockA = new Object();
    static Object lockB = new Object();

    @Override
    public void run() {
        while (true) {
            if ("线程A".equals(getName())){
                synchronized (lockA){
                    System.out.println("线程A拿到了A锁,准备拿B锁");
                    synchronized (lockB){
                        System.out.println("线程A拿到了B锁,顺利执行完一轮");
                    }
                }
            } else if ("线程B".equals(getName())) {
                synchronized (lockB){
                    System.out.println("线程B拿到了B锁,准备拿A锁");
                    synchronized (lockA){
                        System.out.println("线程B拿到了A锁,顺利执行完一轮");
                    }
                }
            }
        }
    }
}
