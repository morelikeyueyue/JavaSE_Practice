package com.itheima.test;

public class LoopTest1 {
    public static void main(String[] args) {
        //10000000
        int num = 1000000000;
        boolean flag = true;
        for (int i = 1; i < Math.sqrt(num); i++) {
                if(num%i==0){
                    flag = false;
                }
        }
        if (flag) {
            System.out.println("这是个质数");
        }else {
            System.out.println("这不是个质数");
        }
    }
}
