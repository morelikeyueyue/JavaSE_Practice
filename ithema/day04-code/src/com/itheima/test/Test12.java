package com.itheima.test;

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        /*需求
        给定两个整数,被除数和出书,将两数相除,得到余数和商
        不能使用乘法\除法和%
         */

        //分析:
        //1.从键盘录入两个数
        //2.使用while语句将两数相减

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入被除数:");
        int number1 = sc.nextInt();
        System.out.println("请输入除数:");
        int number2 = sc.nextInt();
        int count = 0;

        while(number1>=number2){
            number1-= number2;
            count++;
        }
        System.out.println("商为"+count+",余数为"+number1);
    }
}
