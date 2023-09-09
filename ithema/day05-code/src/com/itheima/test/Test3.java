package com.itheima.test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //需求:判断一个数是不是质数

        //分析:
        //1.从键盘录入一个数
        Scanner sc = new Scanner(System.in);
        System.out.println("输入数字:");
        int num = sc.nextInt();
        boolean flag =true;

        //2.判断是否有数可以整除
        if(num ==1){
            System.out.println("这是质数");
        }
        else{
            for(int i = 2; i < num; i++) {
                if(num%i==0){
                    flag = false;
//                    System.out.println("这不是质数");
//                    break;
                }
            }
            if(flag){
                System.out.println("这是一个质数");
            }else{
                System.out.println("这不是一个质数");
            }
        }
    }
}
