package com.itheima.skiploop;

public class SkipLoopDemo2 {
    public static void main(String[] args) {
        //2.结束整个循环
        for (int i = 0; i < 10; i++) {
            if(i==3){
                //结束整个循环
                break;
            }
            System.out.println("小老虎在吃第"+i+"个包子");
        }
    }
}
