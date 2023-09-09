package com.itheima.a03runtimedemo1;

import java.io.IOException;

public class RuntimeDemo1 {
    public static void main(String[] args) throws IOException {
        //1.获取Runtime的对象
/*        Runtime r1 = Runtime.getRuntime();
        Runtime r2 = Runtime.getRuntime();

        System.out.println(r1==r2);*/

        //2.exit  停止虚拟机  0:正常停止 非0:异常停止
/*        r1.exit(0);
        System.out.println("aaa");*/

        //3.获得CPU的线程数
        System.out.println(Runtime.getRuntime().availableProcessors());//8

        //4.JVM从系统中获取的总内存大小(单位byte)
        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024);//4040

        //5.JVM从系统中已经获取的总内存大小(单位byte)
        System.out.println(Runtime.getRuntime().totalMemory()/1024/1024);//254

        //6.JVM剩余的内存大小
        System.out.println(Runtime.getRuntime().freeMemory()/1024/1024);//251

        //7.运行cmd命令
        //shutdown 关机 -s 默认在1分之关机 -s -t 指定关机时间 -a 取消关机操作 -r 关机并重启
        Runtime.getRuntime().exec("shutdown -a");//打开记事本

    }
}
