package com.itheima.ifdemo;

import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args) {
        //需求:键盘录入女婿的酒量,如果大于2斤,老丈人给出回应,其他不回应

        /*if格式
        if(关系语句){
          语句体;
        }
         */

        /*分析
        1.从键盘录入女婿的酒量
        2.编写if条件句,对酒量进行判断
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入女婿的酒量:");
        int wine = sc.nextInt();
        if (wine > 2) {
            System.out.println("小伙子,真不错!");
        }
    }
}
