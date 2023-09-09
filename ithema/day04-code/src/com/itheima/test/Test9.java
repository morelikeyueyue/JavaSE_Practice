package com.itheima.test;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        //需求:在一个范围内,能被三和无同时整除的数有多少

        //分析:
        //1.从键盘录入两个数字变范围
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数字:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1>num2){
            int num3 = num1;
            num1 = num2;
            num2 = num3;
        }

        int sum=0;
        //2.利用for循环进行判断同时被三和五整除
        for (int i=num1;i<=num2;i++){
//            System.out.println(i);
            if(i%3==0&&i%5==0){
                sum++;
                System.out.println(i);
            }
        }
        System.out.println(sum);
    }
}
