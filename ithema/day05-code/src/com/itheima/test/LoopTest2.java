package com.itheima.test;

import java.util.Random;
import java.util.Scanner;

public class LoopTest2 {
    public static void main(String[] args) {

        //生成随机数的代码不能放在循环中

        //1.生成1~100之间的数
        Random r = new Random();
        int num = r.nextInt(100)+1;
        //用来生成任意随机数 7~15
        //1.让这个范围头尾都减去一个值,让这个范围从0开始 -7 0~8
        //2.尾巴加一 8+1=9
        //3.最终的结果再加上减去的结果
//        int num1 = r.nextInt(9)+7;
//        System.out.println(num);


        //2.猜这个数字
        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入你猜的数字:");
//        int guessnumber = sc.nextInt();
        int count = 0;

        while(true){
            System.out.println("请输入你猜的数字:");
            int guessnumber = sc.nextInt();
            count++;
            if (count == 3){
                System.out.println("猜对了");
                break;
            }
            if(guessnumber > num){
            System.out.println("猜大了");
        }else if(guessnumber < num){
            System.out.println("猜小了");
        }else {
            System.out.println("猜对了");
            break;
        }
        }

    }
}
