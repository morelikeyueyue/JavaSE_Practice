package com.itheima.a02threadpool2;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MyThreadPoolDemo1 {
    public static void main(String[] args) {
    /*
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor
        (核心线程数量,最大线程数量,空闲线程最大存活时间,任务队列,创建线程工厂,任务的拒绝策略);

        参数一：核心线程数量              不能小于0
        参数二：最大线程数                不能小于0，最大数量 >= 核心线程数量
        参数三：空闲线程最大存活时间       不能小于0
        参数四：时间单位                  用TimeUnit指定
        参数五：任务队列                  不能为null
        参数六：创建线程工厂              不能为null
        参数七：任务的拒绝策略             不能为null
    */

        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,//核心线程数量,不能小于0
                6,//最大线程数,大于等于核心数量
                60,//空线程最大存活时间 大小
                TimeUnit.SECONDS,//存活时间 单位
                new ArrayBlockingQueue<>(3),//创建阻塞队列 排队任务
                Executors.defaultThreadFactory(),//线程工厂(创建线程的方式)
                new ThreadPoolExecutor.AbortPolicy()//任务的拒绝策略
        );


    }
}
