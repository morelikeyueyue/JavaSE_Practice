package com.itheima.a07threadmethod4;

public class ThreadDemo {
    public static void main(String[] args) {
       /*
            public static void yield()      出让线程/礼让线程
            细节:尽可能均与,不是一定一人一次

       */

        Mythread t1 = new Mythread();
        Mythread t2 = new Mythread();

        t1.setName("飞机");
        t2.setName("坦克");

        t1.start();
        t2.start();

    }
}
