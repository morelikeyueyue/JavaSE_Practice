package com.itheima.a07threadmethod4;

public class Mythread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "@" + i);

            //表示出让当前CPU的执行权
            Thread.yield();
        }
    }
}
