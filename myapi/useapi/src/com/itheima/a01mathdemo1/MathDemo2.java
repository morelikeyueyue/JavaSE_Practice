package com.itheima.a01mathdemo1;

import java.util.Scanner;

public class MathDemo2 {
    public static void main(String[] args) {
        //判断一个数是不是质数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int number = sc.nextInt();
        int count = 0;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            count++;
            if (number % i == 0){
                System.out.println("不是质数");
                break;
            }
            if(i==number){
                System.out.println("是质数");
            }
        }
        System.out.println(count);
    }
}
