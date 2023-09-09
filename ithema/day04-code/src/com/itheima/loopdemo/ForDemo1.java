package com.itheima.loopdemo;

public class ForDemo1 {
    public static void main(String[] args) {
        //1.需求:打印5次helloworld

//        分析:循环五次打印语句
//        for (int i=0;i<5;i++){
//            System.out.println("helloworld");
//        }
        for (int i = 1; i < 6; i++) {
            System.out.println(i);
        }

        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }
    }
}