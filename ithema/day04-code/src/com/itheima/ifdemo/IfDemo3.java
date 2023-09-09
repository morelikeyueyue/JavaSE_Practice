package com.itheima.ifdemo;

import java.util.Scanner;

public class IfDemo3 {
    /*
    if(关系表达式){
    语句体1;
    }

    else{
    语句体2;
    }
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身上的钱:");
        int money = sc.nextInt();
        if(money > 100){
            System.out.println("吃网红餐厅.");
        }
        else{
            System.out.println("吃经济实惠的沙县小吃.");
        }
    }

}
