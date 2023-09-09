package com.itheima.test.test6case1;

import java.util.ArrayList;
import java.util.Collections;

public class MyThread extends Thread {

    //共享数据 奖池
    static ArrayList<Integer> list;

    //自己抽奖的数据
    static ArrayList<Integer> list1 = new ArrayList<>();
    static ArrayList<Integer> list2 = new ArrayList<>();

    public MyThread(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        //1.循环
        while (true) {
            //2.同步代码块
            synchronized (MyThread.class) {
                int sumPrize;
                int maxPrize;
                //3.判断是否到了末尾(到了)
                if (list.size() == 0) {
                    sumPrize = 0;
                    maxPrize = list1.get(0);
                    if (getName().equals("抽奖箱1")){
                        for (Integer prize : list1) {
                            sumPrize+=prize;
                            if (maxPrize <prize){
                                maxPrize = prize;
                            }
                        }
                        System.out.println(getName()+list1);
                        System.out.println("总金额为"+sumPrize+",最大金额为"+maxPrize);
                    } else if (getName().equals("抽奖箱2")) {
                        sumPrize = 0;
                        maxPrize = list2.get(0);
                        for (Integer prize : list2) {
                            sumPrize+=prize;
                            if (maxPrize <prize){
                                maxPrize = prize;
                            }
                        }
                        System.out.println(getName()+list2);
                        System.out.println("总金额为"+sumPrize+",最大金额为"+maxPrize);
                    }
                    break;
                } else {
                    //4.判断是否到了末尾(没到)
                    Collections.shuffle(list);
                    int prize = list.remove(0);
                    if (getName().equals("抽奖箱1")){
                        list1.add(prize);
                    } else if (getName().equals("抽奖箱2")) {
                        list2.add(prize);
                    }
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
