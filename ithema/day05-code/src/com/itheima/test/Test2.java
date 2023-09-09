package com.itheima.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        /*需求:
        求平方根.键盘录入一个大于等于2的整数x,计算并返回x的平方根
        结果只保留整数部分
         */

        //分析:
        //1.从键盘录入一个大于等于2的整数
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个大于等于2的数:");
        int num = sc.nextInt();
        //2.求平方根
        for (int i = 1; i <= num; i++){
            if(i*i==num){
                System.out.println("平方根为"+i);
                break;
            }
            if(i*i >num){
                System.out.println("平方根为"+(i-1));
                break;
            }
        }
    }
}
