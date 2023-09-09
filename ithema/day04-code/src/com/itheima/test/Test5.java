package com.itheima.test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        /*需求:
        周一:跑步
        周二:游泳
        周三:慢走
        周四:动感单车
        周五:拳击
        周六:爬山
        周日:好好吃一顿
         */

        //分析:
        //1.从键盘录入星期几
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入今天星期几:");
        int day = sc.nextInt();
        //2.用switch来匹配
        if (day > 0 && day < 8) {
            switch (day) {
                case 1:
                    System.out.println("跑步");
                    break;
                case 2:
                    System.out.println("游泳");
                    break;
                case 3:
                    System.out.println("慢走");
                    break;
                case 4:
                    System.out.println("动感单车");
                    break;
                case 5:
                    System.out.println("拳击");
                    break;
                case 6:
                    System.out.println("爬山");
                    break;
                case 7:
                    System.out.println("好好吃一顿");
                    break;
                default:
                    System.out.println("无");
                    break;
            }
        }
    }
}