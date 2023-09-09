package com.itheima.test;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        /*需求:
        1.机票查询
        2.机票预定
        3.机票改签
        4.退出服务
        5.其他也是退出服务
         */

        //分析
        //1.从键盘录入用户选择
        Scanner sc =new Scanner(System.in);
        System.out.println("输入用户的选择:");
        int choose = sc.nextInt();
        //2.利用switch根据不同的选择执行不同的代码
        switch (choose){
            case 1:
                System.out.println("机票查询");
                break;
            case 2:
                System.out.println("机票预定");
                break;
            case 3:
                System.out.println("机票改签");
                break;
            case 4:
                System.out.println("退出系统");
                break;
            default:
                System.out.println("退出系统");
                break;
        }
    }
}
