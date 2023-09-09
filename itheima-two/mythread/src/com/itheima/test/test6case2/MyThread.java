package com.itheima.test.test6case2;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread {

    //共享数据 奖池
    static ArrayList<Integer> list;


    public MyThread(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        ArrayList<Integer> boxList = new ArrayList<>();
        //1.循环
        while (true) {
            //2.同步代码块
            synchronized (MyThread.class) {
                int sumPrize;
                int maxPrize;
                //3.判断是否到了末尾(到了)
                if (list.size() == 0) {
                    System.out.println(getName()+boxList);
                    break;
                } else {
                    //4.判断是否到了末尾(没到)
                    Collections.shuffle(list);
                    int prize = list.remove(0);
                    boxList.add(prize);
//                    System.out.println(getName() + "又产生了一个" + prize + "元大奖");
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
