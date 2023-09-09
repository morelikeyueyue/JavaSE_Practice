package com.itheima.test.test7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {

    //共享数据 奖池
    ArrayList<Integer> list;

    public MyCallable(ArrayList<Integer> list) {
        this.list = list;
    }

    @Override
    public Integer call() throws Exception {
        ArrayList<Integer> boxList = new ArrayList<>();
        //1.循环
        while (true) {
            //2.同步代码块
            synchronized (MyCallable.class) {
                //3.判断是否到了末尾(到了)
                if (list.size() == 0) {
                    System.out.println(Thread.currentThread().getName()+boxList);
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
        if(boxList.size() == 0){
            return null;
        }else {
            return Collections.max(boxList);
        }
    }
}
